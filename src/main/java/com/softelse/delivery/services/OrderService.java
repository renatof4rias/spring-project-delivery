package com.softelse.delivery.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softelse.delivery.dtos.OrderDTO;
import com.softelse.delivery.dtos.ProductDTO;
import com.softelse.delivery.entities.Order;
import com.softelse.delivery.entities.Product;
import com.softelse.delivery.enums.OrderStatus;
import com.softelse.delivery.repositories.OrderRepository;
import com.softelse.delivery.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;
	
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> result = orderRepository.findOrdersWithProducts();
		return result.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	@Transactional
	public OrderDTO insert(OrderDTO obj) {
		Order order = new Order(null, obj.getAddress(), obj.getLatitude(), obj.getLongitude(), Instant.now(), OrderStatus.PENDING, obj.getTotal() ); 

		for (ProductDTO p : obj.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = orderRepository.save(order);
		return new OrderDTO(order);
	}  

//	public void update
	
}
	
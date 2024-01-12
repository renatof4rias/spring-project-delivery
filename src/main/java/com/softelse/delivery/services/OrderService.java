package com.softelse.delivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.delivery.dtos.OrderDTO;
import com.softelse.delivery.entities.Order;
import com.softelse.delivery.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<OrderDTO> findAll() {
		List<Order> result = orderRepository.findOrdersWithProducts();
		return result.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

	public Order insert(Order obj) {
		return orderRepository.save(obj);
	}

//	public void update
	
}

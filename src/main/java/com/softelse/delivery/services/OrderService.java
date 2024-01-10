package com.softelse.delivery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.delivery.entities.Order;
import com.softelse.delivery.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		List<Order> result = orderRepository.findAll();
		return result;
	}
	
	
}

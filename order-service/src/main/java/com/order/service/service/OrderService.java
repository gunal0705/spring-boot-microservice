package com.order.service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.order.service.model.Order;
import com.order.service.repository.*;
@Service
public class OrderService {
	private OrderRepository OrderRepository;

	public OrderService(com.order.service.repository.OrderRepository orderRepository) {
		super();
		OrderRepository = orderRepository;
	}
	
	public void placeOrder(Order order) {
		order.setOrderNumber(UUID.randomUUID().toString());
		OrderRepository.save(order);
	}
}

package com.order.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.model.Order;
import com.order.service.service.*;
@RestController
@RequestMapping("api/order")
public class OrdrerController {
	
	private OrderService OrderService;

	public OrdrerController(com.order.service.service.OrderService orderService) {
		super();
		OrderService = orderService;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String placeOrder(@RequestBody Order order) {
		OrderService.placeOrder(order);
		return "Order Placed Successfully";
	}
}

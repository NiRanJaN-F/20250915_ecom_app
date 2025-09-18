package com.example.demoSpring.controller;

import Model.FoodOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.service.OrderService;

import java.util.List;

@RestController
public class orderController {
	
	private final OrderService orderService;
	
	public orderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/orders")
	public List<FoodOrder> getOrders() {
		return orderService.getOrders();
	}
}
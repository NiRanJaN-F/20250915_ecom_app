package com.example.demoSpring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import Model.FoodOrder;
@Service
public class OrderService {
	
	public List<FoodOrder> getOrders(){
		List<FoodOrder> orders = new ArrayList<>();
		
		orders.add(new FoodOrder("John Doe","123 Main st","Pizza"));
		orders.add(new FoodOrder("Jane Smith","456 Elm st","Burger"));
		orders.add(new FoodOrder("Mike Johnson","789 Oak st","Pasta"));
		
		return orders;
	}
}
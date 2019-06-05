package com.alvincabayan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvincabayan.model.MenuOrder;
import com.alvincabayan.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public void addOrder(MenuOrder order) {
		orderRepository.save(order);
	}
	
	public MenuOrder getOrderById(Long orderId) {
		MenuOrder order = new MenuOrder();
    	order.setIdMenuOrders(1L);
    	order.setName("Laing");
		
    	return order;
	}
}

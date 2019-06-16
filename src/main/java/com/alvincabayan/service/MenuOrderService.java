package com.alvincabayan.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvincabayan.model.MenuOrder;
import com.alvincabayan.repository.MenuOrderRepository;

@Service
public class MenuOrderService {
	@Autowired
	private MenuOrderRepository menuOrderRepository;
	
	public void addOrder(MenuOrder menuOrder) {
		menuOrder.setMenuOrderDate(new Date());
		menuOrderRepository.save(menuOrder);
	}
	
	public MenuOrder getOrderById(Long idMenuOrders) {
		MenuOrder menuOrder = new MenuOrder();
		menuOrder.setIdMenuOrder(1L);
		menuOrder.setMenuOrderName("Laing");
		
    	return menuOrder;
	}
}

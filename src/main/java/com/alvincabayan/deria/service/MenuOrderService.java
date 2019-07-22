package com.alvincabayan.deria.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvincabayan.deria.model.MenuOrder;
import com.alvincabayan.deria.dao.MenuOrderDao;

@Service
public class MenuOrderService {
	@Autowired
	private MenuOrderDao menuOrderDao;
	
	public void addOrder(MenuOrder menuOrder) {
		menuOrder.setMenuOrderDate(new Date());
		menuOrderDao.save(menuOrder);
	}
	
	public MenuOrder getOrderById(Long idMenuOrders) {
		MenuOrder menuOrder = new MenuOrder();
		menuOrder.setIdMenuOrder(1L);
		menuOrder.setMenuOrderName("Laing");
		
    	return menuOrder;
	}
}

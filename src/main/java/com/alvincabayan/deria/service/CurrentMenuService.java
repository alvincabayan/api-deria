package com.alvincabayan.deria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvincabayan.deria.dao.CurrentMenuDao;
import com.alvincabayan.deria.model.CurrentMenu;


@Service
public class CurrentMenuService {	
	@Autowired
	private CurrentMenuDao currentMenuDao;
	
	public CurrentMenu getCurrentMenu() {
		List<CurrentMenu> currentMenuList = new ArrayList<CurrentMenu>();//Collections.   currentMenuRepository.findAll();
		Iterable<CurrentMenu> currentMenuIterable = currentMenuDao.findAll();
		currentMenuIterable.forEach(currentMenuList::add);
		
    	return currentMenuList.get(0);
	}
	
}

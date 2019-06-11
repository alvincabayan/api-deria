package com.alvincabayan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvincabayan.model.CurrentMenu;
import com.alvincabayan.repository.CurrentMenuRepository;

@Service
public class CurrentMenuService {
	@Autowired
	private CurrentMenuRepository currentMenuRepository;
	
	public CurrentMenu getCurrentMenu() {
		List<CurrentMenu> currentMenuList = new ArrayList<CurrentMenu>();//Collections.   currentMenuRepository.findAll();
		Iterable<CurrentMenu> currentMenuIterable = currentMenuRepository.findAll();
		currentMenuIterable.forEach(currentMenuList::add);
		
    	return currentMenuList.get(0);
	}
	
}

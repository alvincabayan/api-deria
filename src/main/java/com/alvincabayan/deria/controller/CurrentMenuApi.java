package com.alvincabayan.deria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alvincabayan.deria.model.CurrentMenu;


public interface CurrentMenuApi {
	@RequestMapping(value = "/api/currentMenu", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<CurrentMenu> getCurrentMenu();
}

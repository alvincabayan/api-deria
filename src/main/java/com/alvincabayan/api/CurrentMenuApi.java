package com.alvincabayan.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alvincabayan.model.CurrentMenu;


public interface CurrentMenuApi {
	@RequestMapping(value = "/api/currentMenu", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<CurrentMenu> getCurrentMenu();
}

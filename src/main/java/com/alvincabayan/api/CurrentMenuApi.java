package com.alvincabayan.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alvincabayan.model.CurrentMenu;


public interface CurrentMenuApi {
	@CrossOrigin(origins = {"http://localhost:3000", "http://45.33.97.103:80", "http://45.33.97.103"})
	@RequestMapping(value = "/currentMenu", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<CurrentMenu> getCurrentMenu();
}

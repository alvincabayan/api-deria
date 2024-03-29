package com.alvincabayan.deria.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alvincabayan.deria.model.MenuOrder;

public interface MenuOrderApi {

	@RequestMapping(value = "/api/menuorder", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<Void> addMenuOrder(@Valid @RequestBody MenuOrder body);

	@RequestMapping(value = "/api/menuorder/{idMenuOrder}", produces = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteMenuOrder(Long idmenuorder, @RequestHeader(value = "api_key", required = false) String apiKey);

	@RequestMapping(value = "/api/menuorder/{idMenuOrder}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<MenuOrder> getMenuOrderById(@PathVariable("idMenuOrder") Long idMenuOrder);

	@RequestMapping(value = "/api/menuorder", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Void> updateMenuOrder(@Valid @RequestBody MenuOrder body);

	@RequestMapping(value = "/api/menuorder/{idMenuOrder}", produces = { "application/json" }, consumes = {
			"application/x-www-form-urlencoded" }, method = RequestMethod.POST)
	ResponseEntity<Void> updateMenuOrderWithForm(@PathVariable("idMenuOrder") Long idMenuOrder,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "status", required = false) String status);

}

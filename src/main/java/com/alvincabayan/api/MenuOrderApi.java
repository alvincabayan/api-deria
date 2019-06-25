package com.alvincabayan.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alvincabayan.model.MenuOrder;

public interface MenuOrderApi {

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menuorder", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<Void> addMenuOrder(@Valid @RequestBody MenuOrder body);

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menuorder/{idMenuOrder}", produces = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteMenuOrder(Long idmenuorder, @RequestHeader(value = "api_key", required = false) String apiKey);

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menuorder/{idMenuOrder}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<MenuOrder> getMenuOrderById(@PathVariable("idMenuOrder") Long idMenuOrder);

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menuorder", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Void> updateMenuOrder(@Valid @RequestBody MenuOrder body);

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menuorder/{idMenuOrder}", produces = { "application/json" }, consumes = {
			"application/x-www-form-urlencoded" }, method = RequestMethod.POST)
	ResponseEntity<Void> updateMenuOrderWithForm(@PathVariable("idMenuOrder") Long idMenuOrder,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "status", required = false) String status);

}

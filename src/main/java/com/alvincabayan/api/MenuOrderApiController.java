package com.alvincabayan.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvincabayan.model.MenuOrder;
import com.alvincabayan.service.MenuOrderService;

@RestController
public class MenuOrderApiController implements MenuOrderApi {

	private static final Logger log = LoggerFactory.getLogger(MenuOrderApiController.class);

	@Autowired
	private MenuOrderService menuOrderService;

	/*
	 * @Autowired public OrderApiController(ObjectMapper objectMapper,
	 * HttpServletRequest request, OrderService orderService) { this.objectMapper =
	 * objectMapper; this.request = request; this.orderService = orderService; }
	 */

	public ResponseEntity<Void> addMenuOrder(@Valid @RequestBody MenuOrder menuOrder) {
		menuOrderService.addOrder(menuOrder);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> deleteMenuOrder(Long idMenuOrder,
			@RequestHeader(value = "api_key", required = false) String apiKey) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<MenuOrder> getMenuOrderById(@PathVariable("idMenuOrder") Long idMenuOrder) {
		MenuOrder menuOrder = menuOrderService.getOrderById(idMenuOrder);

		return new ResponseEntity<MenuOrder>(menuOrder, HttpStatus.OK);
	}

	public ResponseEntity<Void> updateMenuOrder(@Valid @RequestBody MenuOrder body) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> updateMenuOrderWithForm(@PathVariable("idMenuOrder") Long idMenuOrder,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "status", required = false) String status) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}

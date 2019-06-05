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
import com.alvincabayan.service.OrderService;

@RestController
public class OrderApiController implements OrderApi {

	private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

	// private final ObjectMapper objectMapper;

	// private final HttpServletRequest request;

	@Autowired
	private OrderService orderService;

	/*
	 * @Autowired public OrderApiController(ObjectMapper objectMapper,
	 * HttpServletRequest request, OrderService orderService) { this.objectMapper =
	 * objectMapper; this.request = request; this.orderService = orderService; }
	 */

	public ResponseEntity<Void> addOrder(@Valid @RequestBody MenuOrder order) {
		orderService.addOrder(order);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> deleteOrder(Long orderId,
			@RequestHeader(value = "api_key", required = false) String apiKey) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<MenuOrder> getOrderById(@PathVariable("orderId") Long orderId) {
		MenuOrder order = orderService.getOrderById(orderId);

		return new ResponseEntity<MenuOrder>(order, HttpStatus.OK);
	}

	public ResponseEntity<Void> updateOrder(@Valid @RequestBody MenuOrder body) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> updateOrderWithForm(@PathVariable("orderId") Long orderId,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "status", required = false) String status) {
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}

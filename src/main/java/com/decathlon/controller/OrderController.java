package com.decathlon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.decathlon.pojo.Order;
import com.decathlon.service.DecathlonOrdersService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/")
public class OrderController {

	@Autowired
	private DecathlonOrdersService orderService;

	@RequestMapping("/home")
	public String loadConfigPage() {
		return "home";
	}

	@RequestMapping("/welcome")
	public String loadWelocmePage() {
		return "welcome";
	}

	@RequestMapping("/orderCreation")
	public String loadOrderPage() {
		return "order-creation";
	}

	@RequestMapping("/changeOrderStatus")
	public String loadStatusPage() {
		return "change-order-status";
	}

	/**
	 * 
	 * @param order
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/orderCreation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> orderCreation(@RequestBody Order order) {
		Order orderDb = orderService.createOrder(order);
		Gson gson = new Gson();
		String msg = "Order created! please note down your orderId is " + orderDb.getOrderId();
		return new ResponseEntity<>(gson.toJson(msg), HttpStatus.OK);
	}

	/**
	 * 
	 * @param order
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT, path = "/orderStatusUpdation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> orderStatusUpdation(@RequestBody Order order) {
		Gson gson = new Gson();
		String msg = orderService.updateOrder(order.getOrderId(), order.getOrderState());
		return new ResponseEntity<>(gson.toJson(msg), HttpStatus.OK);
	}
}

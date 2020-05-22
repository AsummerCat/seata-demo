package com.linjingc.orderdemo.controller;

import com.linjingc.orderdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/add")
	public String addOrder() {
		orderService.addOrder();
		return "success";
	}
}

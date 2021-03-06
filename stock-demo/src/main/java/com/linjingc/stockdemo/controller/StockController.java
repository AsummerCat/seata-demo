package com.linjingc.stockdemo.controller;

import com.linjingc.stockdemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StockService stockService;

	@RequestMapping("/add")
	public String addStock() {
		stockService.addStock();
		return "success";
	}
}

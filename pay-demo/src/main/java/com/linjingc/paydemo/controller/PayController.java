package com.linjingc.paydemo.controller;

import com.linjingc.paydemo.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

	@Autowired
	private PayService payService;

	/**
	 * 下单购买
	 *
	 * @return
	 */
	@RequestMapping("/add")
	public String addpay() {
		payService.addPay();
		return "success";
	}
}

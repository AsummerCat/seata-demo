package com.linjingc.paydemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("order-server")
public interface OrderService {

	@RequestMapping("/order/add")
	 String addOrder();
}

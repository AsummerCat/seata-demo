package com.linjingc.paydemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("stock-server")
public interface StockService {

	@RequestMapping("/stock/add")
	 String addStock();
}

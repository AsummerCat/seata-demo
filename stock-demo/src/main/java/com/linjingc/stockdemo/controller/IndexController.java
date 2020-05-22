package com.linjingc.stockdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/")
	public String index(){
		return "启动stock-demo 服务成功";
	}
}

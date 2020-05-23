package com.linjingc.paydemo.service;

import com.linjingc.paydemo.dao.PayDao;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
	@Autowired
	private PayDao payDao;
	@Autowired
	private OrderService orderService;
	@Autowired
	private StockService stockService;

	@GlobalTransactional
	public void addPay() {
		//开始购买
		payDao.addPay();
		System.out.println("下单成功");
		//下单
		orderService.addOrder();
		//扣库存
//		stockService.addStock();
	}
}

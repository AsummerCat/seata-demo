package com.linjingc.orderdemo.service;

import com.linjingc.orderdemo.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderDao orderDao;

	public void addOrder() {
		orderDao.addOrder();
	}
}

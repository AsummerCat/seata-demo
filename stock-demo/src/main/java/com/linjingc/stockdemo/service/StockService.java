package com.linjingc.stockdemo.service;

import com.linjingc.stockdemo.dao.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
	@Autowired
	private StockDao stockDao;

	public void addStock() {
		stockDao.addStock();
	}
}

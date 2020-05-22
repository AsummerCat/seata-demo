package com.linjingc.stockdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StockDao {
	@Update("UPDATE STOCK_INFO SET STOCK_NUM =STOCK_NUM-1 WHERE ID=1")
	int addStock();
}

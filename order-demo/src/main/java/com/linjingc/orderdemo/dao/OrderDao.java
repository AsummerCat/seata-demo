package com.linjingc.orderdemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderDao {

	@Insert("INSERT INTO ORDER_INFO(NAME, ORDER_DATE) VALUES('小道具', now())")
	int addOrder();
}

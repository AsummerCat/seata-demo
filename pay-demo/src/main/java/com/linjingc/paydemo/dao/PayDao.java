package com.linjingc.paydemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayDao {

	@Insert("INSERT INTO PAY_USER(NAME, PAY_DATE) VALUES('小明',now())")
	int addPay();
}

package com.test.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.test.demo.User;

public interface TestDaoMapper {

	@SuppressWarnings("rawtypes")
	public List<Map> findUser();
	
	public boolean insertSjd(User u);
	
}

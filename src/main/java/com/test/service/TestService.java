package com.test.service;

import java.util.List;
import java.util.Map;

import com.test.demo.User;

public interface TestService {

	@SuppressWarnings("rawtypes")
	public List<Map> findUser();
	
	public boolean insertSjd(User u);
	
}

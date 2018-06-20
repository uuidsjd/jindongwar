package com.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.test.dao.TestDaoMapper;
import com.test.demo.User;
import com.test.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDaoMapper Tdao;
	
	@Override
	public List<Map> findUser() {
		List<Map> Slist = Tdao.findUser();
		return Slist;
	}
	
	public boolean insertSjd(User u){
		boolean flag = false;
		flag = Tdao.insertSjd(u);
		return flag;
	}
	public TestDaoMapper getTdao() {
		return Tdao;
	}

	public void setTdao(TestDaoMapper tdao) {
		Tdao = tdao;
	}

	
}

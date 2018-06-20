package com.test.factory;

import com.test.factory.util.Send;

public class Weixin implements Send {

	@Override
	public boolean sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("这是微信发送"+message);
		return true;
	}

}

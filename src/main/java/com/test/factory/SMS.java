package com.test.factory;

import com.test.factory.util.Send;

public class SMS implements Send {

	public static SMS sms;
	private SMS() {
		System.out.println("SMS构造函数");
	}
	public static synchronized SMS getSingle(){
		System.out.println("单例模式创建");
		if(sms==null){
			System.out.println("创建SMS实例");
			sms = new SMS();
			return sms;
		}else{
			System.out.println("引用SMS实例");
			return sms;
		}
	}
	@Override
	public boolean sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("这是短信发送"+message);
		return true;
	}

}

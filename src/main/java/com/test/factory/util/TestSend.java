package com.test.factory.util;

import com.test.factory.FactorySMS;
import com.test.factory.FactoryWeixin;

public class TestSend {
	
	public static void main(String[] args) {
//		Send send2 = FactorySMS.sendsms();
//		Send send = fs.send("sMs");
//		Send send1 = fs.send("sMs");
//		System.out.println(send==send1);
//		send2.sendMessage("内容");
		FactorySend fa = new FactoryWeixin();
		Send send = fa.sendmessage();
		send.sendMessage("电话号码");
	}

}

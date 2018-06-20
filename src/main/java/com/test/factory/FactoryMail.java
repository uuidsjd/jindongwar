package com.test.factory;

import com.test.factory.util.FactorySend;
import com.test.factory.util.Send;

public class FactoryMail implements FactorySend{

	@Override
	public Send sendmessage() {
		// TODO Auto-generated method stub
		return new Mail();
	}

}

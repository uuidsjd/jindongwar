package com.test.factory;

import com.test.factory.util.FactorySend;
import com.test.factory.util.Send;

public class FactoryWeixin implements FactorySend {

	@Override
	public Send sendmessage() {
		// TODO Auto-generated method stub
		return new Weixin();
	}

}

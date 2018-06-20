package com.test.factory;

import com.test.factory.util.FactorySend;
import com.test.factory.util.Send;

public class FactorySMS implements FactorySend{

	@Override
	public Send sendmessage() {
		// TODO Auto-generated method stub
		return SMS.getSingle();
	}

//	public Send send(String purpose){
//		String newpurpose = purpose.toLowerCase();
//		if("sms".equals(newpurpose)){
//			return SMS.getSingle();
//		}else if("mail".equals(newpurpose)){
//			return new Mail();
//		}
//		return null;
//	}
	
//	public static Send sendmail(){
//		
//		return new Mail();
//	}
//	
//	public static Send sendsms(){
//		
//		return SMS.getSingle();
//		
//	}
	
}

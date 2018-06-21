/**
 * 
 */
package com.test.game;


public class PrivateMethod {

	private String privateMethod(Integer i){
		
		test(i);
		return "这是PrivateMethod的私有方法";
		
	}
	
	private void test(Integer i){
		if(i>0){
			System.out.println("i>0");
			return;
		}
		System.out.println("i<=0");
	}
	
}

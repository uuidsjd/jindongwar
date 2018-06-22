/**
 * 
 */
package com.test.game;

import java.lang.reflect.Method;


public class CallPrivateMethod {

	public static void main(String[] args) {
		
		try {
			Class c =  Class.forName("com.test.game.PrivateMethod");
				Method m = c.getDeclaredMethod("privateMethod",Integer.class);
				m.setAccessible(true);
				String s= (String)m.invoke(c.newInstance(), 1);
				System.out.println(s);
				
				
				Class cc = Class.forName("com.test.game.PrivateMethod");
				Method mm =  cc.getDeclaredMethod("privateMethod", Integer.class);
				mm.setAccessible(true);
				System.out.println(mm.invoke(cc.newInstance(), 2));
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

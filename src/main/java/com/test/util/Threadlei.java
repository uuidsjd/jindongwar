package com.test.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Threadlei extends Thread{

//	Map m = new HashMap();
	final Map map = new HashMap();
	String str;
	static Object o = new Object();
	@Override
	public void run() {
//		synchronized("c"){
//			synchronized(this){
// 		synchronized(map){
 		synchronized(o){
 			try {
// 				System.out.println(o.hashCode());
// 				System.out.println(Threadlei.class.hashCode());
				Thread.sleep(2000);
				map.put("name", Thread.currentThread().getName());
				System.out.println(new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:SSS").format(new Date())+":"+Thread.currentThread().getName()+"=="+map);
				map.clear();
		} catch (InterruptedException e) {
			System.err.println(Thread.currentThread().getName()+e);
		}
			
		}
//		pao();
		
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Threadlei(String str) {
		this.str = str;
	}
	
	

	
	
	
	
	

}

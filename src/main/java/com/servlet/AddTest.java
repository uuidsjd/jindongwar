package com.servlet;

import java.util.HashMap;
import java.util.Map;

public class AddTest {


	public int Add(int i,int l){
		
		return i+l;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		long time1= System.currentTimeMillis();	
		for (int i = 0; i < 10; i++) {
			System.out.println("");
			Thread.sleep(1000);
		}
		long time2= System.currentTimeMillis();	
		System.out.println(time2-time1);
		
		
	}
	
}

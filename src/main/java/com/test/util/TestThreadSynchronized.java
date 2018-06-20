package com.test.util;

public class TestThreadSynchronized {

	public static void main(String[] args) {
		
		Threadlei t1 = new Threadlei("xx");
		Threadlei t2 = new Threadlei("xx");
		Threadlei t3 = new Threadlei("xx");
		Threadlei t4 = new Threadlei("xx");
		Threadlei t5 = new Threadlei("xx");
		
		t1.setName("T1线程");
		t2.setName("T2线程");
		t3.setName("T3线程");
		t4.setName("T4线程");
		t5.setName("T5线程");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
	
}

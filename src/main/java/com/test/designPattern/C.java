package com.test.designPattern;

public class C {

	public static void main(String[] args) {
		//实例化的是B的对象，为什么最终结果是A的值呢
		//原因：子类继承父类，将父类的属性，方法继承到自己内部，然后调用的时候，用子类对象调用的属性是继承自父类的属性，因为调用类型是父类，对于属性来说，是静态绑定，
		//也就是说，静态绑定是在编译过程中被绑定的，所以属性a是父类的值
//		A a = new B();
//		System.out.println(a.a);
//		a.testA();
		SourceAble s1 = new Source1();
		SourceAble s2 = new Source2();
		
		s1.method1();
		s1.method2();
		
		s2.method1();
		s2.method2();
		Runtime runtime = Runtime.getRuntime();
		long l = runtime.freeMemory();
		long l2= runtime.maxMemory();
		long l3= runtime.totalMemory();
		System.out.println(l/1024/1042+"M\n"+l2/1024/1042+"M\n"+l3/1024/1042+"M");
		
		String a= "a";
		System.out.println(a.hashCode());
	}
	
}

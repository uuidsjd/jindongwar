package com.servlet;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Son extends Father{
	

	
	
	public Son() {
		
		System.out.println("这是子类的无参构造方法");
		
	}

	public void eat() {
		
		System.out.println("这是子类的吃饭方法");
		
	}
	
	public static void main(String[] args) {
//		byte a = 127;
//		byte b = 127;
////		b += a; 
//		b = b+a;
//		System.out.println(b);
//		System.out.println(a);
//		String str = "asd";
//		String str1 = "asd";
//		String str2 = "dsa"+str;
//		System.out.println(str2);
		//多线程之间可以共享，不用同步，性能相对高
		//如果是可变的，如 str1 和 str 值相同其实，str1
//		String str = "qwe";
//		System.out.println(str.hashCode());
//		String str1 = "123";
//		String str2 = "123";
//		System.out.println(str1==str2);
		WeakHashMap<String, Object> maps = new WeakHashMap<String, Object>();
		maps.put("a", null);
		System.out.println(maps);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qwe", "qwes");
		SoftReference<Map<String, Object>> soft = new SoftReference<Map<String, Object>>(map);
		System.out.println(map);
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("sun.arch.data.model"));
		
	}

//	public void sleep(){
//		
//		System.out.println("这是子类的睡觉方法");
//		
//	}
	
	
	
}

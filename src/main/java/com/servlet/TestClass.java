package com.servlet;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestClass implements Cloneable{

	public static void main(String[] args) {
			
	//		Father f = new Father();
	//		Son s = new Son();
//			Father f = new Son();
	//		f.eat();
//			Son s = (Son)f;
//			s.eat();
//			Hashtable h = new Hashtable();
			Map h = new HashMap();
			StringBuffer sb = new StringBuffer();
			sb.append("abc");
			h.put("1", sb);
			sb.append("def");
			h.put("2", sb);
			sb.append("opq");
			h.put("3", sb);
			sb.append("rst");
			h.put("4", sb);
			int num = 0;
//			Enumeration it = h.elements();
//			while(it.hasMoreElements()){
//				System.out.print("Hashtable "+(++num)+" value ");
//				System.out.println(it.nextElement());
//			}
			System.out.println(h.get("1"));
			System.out.println(h.get("2"));
			System.out.println(h.get("3"));
			System.out.println(h.get("4"));
			
	}

	
	
	public static class Test1 implements Cloneable{
		
		String str1  = "这是test1的参数";
		
		public void test1(){
			
			System.out.println("这是test1方法");
			
		}
		
		public Object clone1(){
			Test1 t1 = new Test1();
			Test1 o = null;
			try {
				o = (Test1) super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return o;
		}
		
		public static void main(String[] args) throws CloneNotSupportedException {
			
			Test1 t1 = new Test1();
			Test1 ob = (Test1) t1.clone1();
			ob.setStr1("这是ob修改后对象的参数");
			t1.setStr1("修改str参数");
			String t1Str = t1.getStr1()==""||t1.getStr1()==null?"为空":t1.getStr1();
			System.out.println("t1对象："+t1Str);
			System.out.println("ob对象："+ob.getStr1());
		}

		public String getStr1() {
			return str1;
		}

		public void setStr1(String str1) {
			this.str1 = str1;
		}
		
	}
	
}

package com.test.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JdbcUtil {

	/**
	 * 获取四种参数的第一种方式
	 */
	private static String driver="";
	private static String url="";
	private static String username="";
	private static String password="";
	/**
	 * 获取参数的第二种方式，通过配置获取
	 */
	InputStream io = JdbcUtil.class.getResourceAsStream("/jdbc.properties");
	Properties prop = new Properties();
//	static{
//		try {
//			//加载数据库驱动
//			Class.forName(driver);
//			//连接数据库
//			Connection conn = DriverManager.getConnection(username, password, url);
//			conn.createStatement();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	//获取数据库通道statement，preparestatement
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("123");
		String str4 = new String("123");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		Map<String, Object> map = new HashMap<String, Object>();
		map.equals("1");
	}
	
	
	
}

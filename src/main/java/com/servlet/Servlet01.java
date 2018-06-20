package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.demo.User;

public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String Username = (String) request.getParameter("username1");
		String Password = (String) request.getParameter("password1");
		System.out.println("username====="+Username);
		System.out.println("password====="+Password);
		doPost(request, response);
		System.out.println("doGet01");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		User user = new User();
		String Username = (String) request.getParameter("username1");
		String Password = (String) request.getParameter("password1");
		user.setUsername(Username);
		user.setPassword(Password);
		System.out.println("username====="+Username);
		System.out.println("password====="+Password);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		/**
		 * request转发，相当于服务器发起请求，携带之前的信息向客户端发送请求
		 */
		//request.setCharacterEncoding("UTF-8");
		//request.getRequestDispatcher("test.jsp").forward(request,response);
		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String str1 = input.next();
		if(str1.isEmpty()){
			System.out.println("cuowu");
		}else if("qwer".equals(str1)){
			System.out.println("ok");
		}else{
			System.out.println("姓名不匹配");
		}*/
		System.out.println("doPost01");
		/**
		 * response重定向,相当于客户端发送请求，之前携带的信息取消，页面地址会变更
		 */
		response.sendRedirect("test.jsp");
	}
	


}

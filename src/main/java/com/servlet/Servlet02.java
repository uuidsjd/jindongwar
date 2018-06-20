package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet02
 */
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
		System.out.println("doGet02");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = (String) request.getAttribute("username1");
		String Password = (String) request.getAttribute("password1");
		System.out.println(Username);
		System.out.println(Password);
		// TODO Auto-generated method stub
		System.out.println("doPost02");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StringBuffer sb = new StringBuffer();
		PrintWriter print = response.getWriter();
		sb.append("<%@ page language=\"java\" import=\"java.util.*\" pageEncoding=\"utf-8\"%>\n");
		sb.append("<html>\n");
		sb.append("<head>\n");
		sb.append("</head>\n");
		sb.append("<script type=\"text/javascript\">\n");
		sb.append("function startup(){\n");
		sb.append("document.getElementById(\"form0\").submit();\n");
		sb.append("}\n");
		sb.append("</script>\n");
		sb.append("</head>\n");
		sb.append("<body onload=\"startup()\">\n");
		sb.append("<form id=\"form0\" name=\"form0\" action=\"Servlet01\" method=\"post\">\n");
		sb.append("later追踪过\n");
		sb.append("</form>\n");
		sb.append("</body>\n");
		sb.append("</html>\n");
		print.write(sb.toString());
		
	}

}

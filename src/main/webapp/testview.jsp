<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title></title>
</head>
<body>
<form name="form1" id="form1" action="testView.do" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" id="username1" name="username1" placeholder="请输入用户名"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" id="password1" name="password1" placeholder="请输入密码"/></td>
		</tr>
		<tr>
			<td><input type="submit"  value="提交"/></td>
		</tr>
	</table>
<%-- <% String req = (String)request.getParameter("username1"); %> --%>
<%-- <% session.setAttribute("username2", (String)request.getParameter("username1")); %> --%>
<%-- <% session.setAttribute("password2", (String)request.getParameter("password1")); %> --%>
<%-- <%=req %> --%>
</form>
</body>
</html>
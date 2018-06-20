<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title></title>
</head>
<script type="text/javascript">
	function startup(){
		var username1 = document.getElementById("username1").value;
		var password1 = document.getElementById("password1").value;
		alert(username1);
		alert(password1);
		if(confirm("Yes?")){
			var url = "Servlet01.do?username="+username1+"password"+password1;
			form1 = document.getElementById("form1");
			form1.attr("action",url);
			form1.submit();
		}
	}
</script>
<body>
<form name="form1" id="form1" action="Servlet01" method="post">
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
	<a href="httpClient01.do">httpClient连接</a>
<%-- <% String req = (String)request.getParameter("username1"); %> --%>
<%-- <% session.setAttribute("username2", (String)request.getParameter("username1")); %> --%>
<%-- <% session.setAttribute("password2", (String)request.getParameter("password1")); %> --%>
<%-- <%=req %> --%>
</form>
</body>
</html>
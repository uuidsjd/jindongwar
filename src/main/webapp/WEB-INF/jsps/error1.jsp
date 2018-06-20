<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>错误页面</title>
</head>
<body>
您好，您输入错误</br>
具体错误信息如下</br>
${requestScope.message }
<% String path = request.getRealPath("baoxiao.jpg"); %>
<%=request.getRealPath("baoxiao.jpg") %>
<img alt="报销凭证" src="images/baoxiao.png"/>
</body>
</html>
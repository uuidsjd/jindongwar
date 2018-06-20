<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test页面</title>
</head>
<body>
test页面</br>
request:${requestScope.message }</br>
多条数据信息</br>
<c:forEach items="${requestScope.users }" var="u">
	${u.username }
	${u.password }</br>
</c:forEach>
	<img alt="报销凭证" src="images/baoxiao.png"/>
</body>
</html>
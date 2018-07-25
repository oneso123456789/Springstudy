<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
String conPath = request.getContextPath();
%>
<body>
	<form action="<c:url value="/member/create"/>" , method="post">
		아아디 : <input name="id" type="text" value="${member.id}"> 
		패스워드 : <input name="password" type="password" value="${member.password }">
		<input type="submit" value="로그인">
	</form>
</body>
</html>
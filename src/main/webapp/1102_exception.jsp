<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception Processing 예외 처리</title>
</head>
<body>
<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	int a = Integer.parseInt(num1);
	int b = Integer.parseInt(num2);
	int c = a / b; // 10 / 0 = 예외 발생!!
	out.println(num1 + " / " + num2 + " = " + c);
%>
</body>
</html>
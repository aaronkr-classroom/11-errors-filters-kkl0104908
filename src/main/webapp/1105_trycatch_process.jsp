<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try{
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = a / b; // 10 / 0 = 예외 발생!!
		out.println(num1 + " / " + num2 + " = " + c);
	} catch(NumberFormatException e) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("1106_trycatch_error.jsp");
		dispatcher.forward(request, respone);
	} catch(ArithmeticException e) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("1107_trycatch_error.jsp");
		dispatcher.forward(request, respone);

	} finally{
		out.println("<h2 style=\ 'color:red'>Finally!......</h2>");
	}
%>
</body>
</html>
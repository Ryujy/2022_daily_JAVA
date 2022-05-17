<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String email = request.getParameter("email");
	String phone = request.getParameter("cellPhone");
	// 세션에 저장
	session.setAttribute("email", email);
	session.setAttribute("phone", phone);
	// 페이지 이동
	response.sendRedirect("result.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
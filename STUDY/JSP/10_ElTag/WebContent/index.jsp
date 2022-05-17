<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% session.setAttribute("sessionId", session.getId()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="result.jsp">
		ID : <input type="text" name="useId"/>
		<button>전송</button>
	</form>
	<p><a href="oper.jsp">연산</a></p>
</body>
</html>
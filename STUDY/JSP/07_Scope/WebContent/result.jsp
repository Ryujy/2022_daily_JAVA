<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Application 영역에 저장된 정보</legend>
		<p>ID : <%=application.getAttribute("id") %></p>
		<p>NAME : <%=application.getAttribute("name") %></p>
	</fieldset>
	<fieldset>
		<legend>Session 영역에 저장된 정보</legend>
		<p>EMAIL : <%=session.getAttribute("email") %></p>
		<p>PHONE : <%=session.getAttribute("phone") %></p>
	</fieldset>
</body>
</html>
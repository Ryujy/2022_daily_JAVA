<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><a href="print.jsp">각 객체별 페이지 출력</a></p>
	<p><a href="redirect.jsp">redirect</a></p>
	<form action="redirect.jsp" method="post">
		<input type="text" name="id" value=""/>
		<input type="submit" value="send"/>
	</form>
</body>
</html>
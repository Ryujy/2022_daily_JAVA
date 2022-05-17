<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	
	<!-- include 시 param 을 줄 수 있다. -->
	<jsp:include page="body.jsp">
		<jsp:param name="val" value="my content" />
	</jsp:include>
	
	
	<jsp:include page="footer.jsp"/>
</body>
</html>
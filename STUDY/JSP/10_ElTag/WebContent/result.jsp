<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	EL(Expression Laguage) TAG 는 기존 스크립틀릿의 출력문을 대체하기 위해 나왔다.
	일반적으로는 자바 변수의 값을 출력하는데 사용한다. 
	sessionScope, param 등을 이용해 파라메터의 값이나 세션값을 출력하기도 한다.
 -->
 
 	session id : ${sessionScope.sessionId } <br/>
 	parameter : ${param.userId } <br/>
 	msg : ${msg } <!-- 나중에 MVC 에서 서버로부터 온 내용을 출력할 때 사용 -->
</body>
</html>
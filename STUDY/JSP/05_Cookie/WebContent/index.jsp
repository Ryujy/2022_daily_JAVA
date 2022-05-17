<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    // 쿠키는 클라이언트(PC)에 저장되므로 request로 가져오고 response로 내려준다. 
    // 쿠키 저장 방법
    // 쿠키는 기본적으로 String, String 형태이다.
    Cookie cookie = new Cookie("name","kim"); //key, value
    cookie.setMaxAge(60*10);// 얼마나 쿠키를 유지할 것인지? (초)
    response.addCookie(cookie);// 저장(response 사용)
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>쿠키의 이름 : <%= cookie.getName() %></h2>
	<h2>쿠키의 값 : <%= cookie.getValue() %></h2>
	<h2>쿠키의 만료시간 : <%= cookie.getMaxAge() %></h2>
	<button onclick="javascript:location.href='cookieResult.jsp' ">쿠키 값 불러오기</button>
	<button onclick="javascript:location.href='exam/main.jsp' ">쿠키 예제</button>
</body>
</html>
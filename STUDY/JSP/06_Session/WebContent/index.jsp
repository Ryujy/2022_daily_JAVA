<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 객체에서 뭔가 가져오거나 쓸 때 get, set을 사용한다. (자바에서도 private 을 get/set 사용했지) 
	String  name = (String)session.getAttribute("name");
    
	if(name == null) {
		name = "세션의 값이 존재하지 않습니다.";
	}
	
	// 세션 만료 시간
	System.out.println("세션 만료시간 : " + session.getMaxInactiveInterval());
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session TEST</h2>
	<a href="sessionSet.jsp">세션 속성값 저장(로그인)</a><br/>
	<a href="sessionDel.jsp">세션 속성값 삭제(로그아웃)</a><br/>
	<a href="sessionInit.jsp">세션 초기화</a><br/>
	<a href="exam/login.jsp"> 로그인 </a>
	<h3>세션에 저장된 값 : <%=name %></h3>
	<h3>SESSION ID : <%=session.getId() %></h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>c:if</h1>
	<ul>
		<li>자바의 if문과 비슷하다.</li>
		<li>c:if test="조건"</li>
		<li>test의 조건이 참이면 태그 몸체의 내용이 실행</li>
		<li>test는 기본적으로 참/거짓만을 받을 수 있다.</li>
		<li>var 속성을 활용하면 결과를 따로 저장할 수도 있다.</li>		
	</ul>
	
	<%if(true){%>
	항상 실행한다.
	<% }%>
	<br/>
	
	<c:if test="true">
		얘도 항상 실행한다. <br/>
	</c:if>
	
	<c:set var="myId">admin</c:set>
	<!-- c:if 에는 else 가 없다 -->
	<c:if test="${myId eq 'admin'}" var="result">
		myId는 admin이 맞습니다. <br/>
		결과 값 : ${result}
	</c:if> <!-- test에는 참/거짓만 담길 수 있고, EL 태그는 출력해주는 애이고 연산도 가능하니까 test는 el 태그로 외워두기 -->
	
	
	
	
	
</body>
</html>
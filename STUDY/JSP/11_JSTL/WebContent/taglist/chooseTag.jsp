<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>자바의 switch 문과 비슷하다.</li>
		<li>c:when 태그의 test 값이 true 면 태그 몸체를 수행</li>
		<li>c:otherwise 는 어떠한 c:when 에도 해당되지 않으면 실행된다.</li>
	</ul>
	<h1>c:choose</h1>
	
	<c:choose>
		<c:when test="${param.num == '0'}">
			<h3>파라매터 값은 0입니다.</h3>
		</c:when>
		<c:when test="${param.num eq '1'}">
			<h3>파라매터 값은 1입니다.</h3>
		</c:when>
		<c:when test="${param.num == '2'}">
			<h3>파라매터 값은 2입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>파라매터 값은 0~2 사이를 넣어주세요.</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>
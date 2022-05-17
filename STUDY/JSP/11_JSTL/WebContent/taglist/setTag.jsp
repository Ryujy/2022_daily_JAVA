<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	session.setAttribute("myId", "admin");
	session.setAttribute("uId", "105784");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>c:set</h3>
	<!-- EL 에서 사용하는 변수 선언 -->
<%-- 	<c:set value="값"  />
	<c:set var="변수명" scope="영역">값</c:set> --%>
	<h3>set tag attributes</h3>
	<ul>
		<li>var : 변수의 이름 </li>
		<li>value : 변수에 담을 값</li>
		<li>scope : 저장영역(page, request, session, application) - 기본값은 page</li>
	</ul>
	
	<!-- value 속성 사용 -->
	<c:set var ="name1" value="test"/><!-- scope\"page -->
	<c:set var="name2" value="${sessionScope.myId }" scope="request"/>
	<c:set var="name3" value="${sessionScope.myId }_${sessionScope.uId }" scope="request"/>
	
	<!-- 태그 몸체에 값 지정 -->
	<c:set var="name4">test</c:set>
	<c:set var="name5" scope="request">${sessionScope.myId }</c:set>
	<c:set var="name6">${sessionScope.myId } ${sessionScope.uId }</c:set>
	
	<h3>변수 출력</h3>
	<ul>
		<li>${name1 }</li>
		<li>${name2 }</li>
		<li>${name3 }</li>
		<li>${name4 }</li>
		<li>${name5 }</li>
		<li>${name6 }</li>
	</ul>
	
	<hr/>
	
	<!-- 속성 삭제 -->
	<%-- <c:remove var="변수명" scope="영역"/> --%>
	<c:remove var="name3" scope="request"/>
	<c:remove var="name6"/>
		<h3>변수 출력</h3>
	<ul>
		<li>${name1 }</li>
		<li>${name2 }</li>
		<li>${name3 }</li>
		<li>${name4 }</li>
		<li>${name5 }</li>
		<li>${name6 }</li>
	</ul>
	
	
	
</body>
</html>
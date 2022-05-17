<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String[] sports ={"축구","야구","농구","골프","수영","볼링"};
	HashMap<String,String> map = new HashMap<String,String>();
	map.put("name","kim");
	map.put("gender","male");
	map.put("phone","010-1234-1234");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>c:foreach</h1>
	<ul>
		<li>일반적인 for문과 비슷하며, 주로 array나 collection, map 등의 값을 꺼낼 때 사용한다.</li>
		<li>c:foreach var="변수" items="덩어리" begin="시작값" end="끝값" step="증가 정도"</li>
		<li>items 에는 배열이나 컬렉션등의 덩어리가 들어간다.</li>
		<li>var 에는 덩어리에서 꺼낸 값을 담는다.(향상된 for문과 비슷)</li>
	</ul>
	
	<!-- 실제 활용법 -->
	<h3>sports 배열의 값을 하나씩 뽑아내기</h3>
	<c:forEach var="item" items="<%=sports %>" varStatus="stat"><p>[${stat.index}] ${item }</p></c:forEach>
	
	<h3>map 의 내용 출력</h3>
	<c:forEach var="item" items="<%=map %>">
		${item.key } : ${item.value } <br/> 
	</c:forEach> <!-- 들여쓰기,, 안하면 안나옴~ -->
	
	
	<!-- 잘 쓰지 않지만 일반 for문 처럼 쓰는 방법 -->
	<c:forEach var="i" begin="1" end="10" step="1">${i} </c:forEach>
	<hr/>
	
	<!-- 2중 for -->
	<c:forEach var="i" begin="2" end="9" step="1">
		<p>${i} 단 시작 </p>
		<c:forEach var="j" begin="1" end="9" step="1">
			${i } X ${j } = ${i*j } <br/>
		</c:forEach>
	</c:forEach>
	
	
</body>
</html>
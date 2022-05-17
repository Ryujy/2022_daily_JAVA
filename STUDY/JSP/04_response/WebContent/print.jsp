<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  response 페이지 출력(그리기)을 할 수 있다. -->
	<!-- 그 외에도 추가적인 방법들이 있다. -->
	<!-- scriptlet -->
	<%="<p>첫번째, 스크립틀릿 출력문을 사용하는 방법</p>" %>	
	
	<!-- out 객체  : response로 부터 나온 객체로 내장 객체 이다. 
	response로부터 한 번 추출한 객체를 사용하므로 가장 느리다. -->
	<% out.print("<p>두번째, out 객체를 이용하는 방법</p>"); %>
	
	<!--  response 객체 : response는 응답전용이기 때문에 가장 빠르다. 
	따라서 혼용해서 쓸 경우 의도와 다르게 순서가 정해질 수 있다. 그러므로 하나만 쓰는 것이 좋다. -->
	<% response.getWriter().write("<p>세번째, response 객체를 이용하는 방법</p>"); %>

</body>
</html>
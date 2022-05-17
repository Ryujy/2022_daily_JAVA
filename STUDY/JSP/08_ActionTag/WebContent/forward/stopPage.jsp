<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");%>
<!-- forward 는 페이지를 이동시켜준다. -->
<!--  그러면서 추가적인 파라메터도 보낼 수 있다. -->
<!-- 파라메터는 request 객체에만 존재한다. , 주석 왠만하면 넣지 말기! 오류날 수도 있음-->
<jsp:forward page="result.jsp">
	<jsp:param name="tel" value="010-1234-1234" />
</jsp:forward>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	id: 빈 호출 이름, class:빈 패키지 위치, scop:영역 (page, request, session, application)
-->
<jsp:useBean id="firstBean" class="com.beans.FirstBean" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- name=사용할 빈이름 property=가져올 빈안의 필드명 -->
	당신의 이름 : <jsp:getProperty name="firstBean" property="name" />
	<hr/>
	<!-- method 는 기본 get 이다. -->
	<form action="setBeans.jsp">
		이름 : <input type="text" name="userName"/>
		<button>저장</button>
	</form>
</body>
</html>
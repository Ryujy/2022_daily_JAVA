<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>My 페이지</h3>
	안녕하세요 <%= session.getAttribute("loginId")%>님 <a href='logout.jsp'>로그아웃</a> 
	<!-- 세션으로부터 loginId 가져오면 그 값인 id가 나타난다. 로그아웃 링크를 누르면 logout.jsp로 보내진다.-->
	
</body>
<script>
<% // url 에 직접 mypage.jsp를 쳐서 들어오는 것과 같은 경우 로그인된 상태가 아니기 때문에 그 경우를 막기 위한 코드
if(session.getAttribute("loginId") == null) { // 로그인 상태가 아니라면 (session으로부터 가져온 loginId 값이 null이라면)
%>
	alert("로그인이 필요한 서비스입니다."); <!-- 알림창을 띄우고 -->
	location.href="login.jsp"; <!-- login.jsp 로 돌려보낸다. -->
<%}%>

</script>
</html>
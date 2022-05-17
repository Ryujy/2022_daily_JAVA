<!-- 페이지 속성 선언  -->
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 변수나 메서드 선언 -->
<%!
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR_OF_DAY); // 하루를 24시간으로 계산
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);

%>    
    
<div class="header">
	<!-- 위에 선언된 변수를 출력 -->
	현재 시간은 <%=hour %>시 <%=min %>분 <%=sec %>초
	<!-- hour가 12보다 크면 오후입니다. 아니면 오전 입니다. -->
	<% if (hour >= 12) { %>
		오후
	<%	} else { %>
		오전
	<%	} %>
	입니다.	
	
	<%--
		int sum = 0;
		for(int i=0; i<=100; i++){
			sum += i;
		}
	--%>
	
	
</div>
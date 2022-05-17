<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] list = request.getCookies();
	String lang="";

	for(Cookie c : list) {
		if(c.getName().equals("lang")){ // 쿠키의 이름이 lang 이면
			lang = c.getValue();				// lang 에 가져온 값을 저장한다?
		}
	}



if(lang.equals("kor")){%>
	<h2>한글 페이지에 오신 것을 환영합니다. </h2>
<%} else {%>
	<h2> Welcome to English Page! </h2>
<%}%>
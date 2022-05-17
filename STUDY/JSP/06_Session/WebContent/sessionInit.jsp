<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//session을 초기화 한다.
session.invalidate();  // 세션 객체를 아예 지웠다가 다시 만든다.

//index.jsp로 보낸다.
response.sendRedirect("index.jsp");

%>
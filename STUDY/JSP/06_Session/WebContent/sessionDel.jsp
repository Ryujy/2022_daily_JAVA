<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//session 에서 name 이라는 세션을 삭제
session.removeAttribute("name");

//index.jsp로 이동
response.sendRedirect("index.jsp");

%>
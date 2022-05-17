<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//session 에서 loginId 라는 속성을 지우고
session.removeAttribute("loginId"); 
//login.jsp 페이지로 보낸다.
response.sendRedirect("login.jsp");

%>
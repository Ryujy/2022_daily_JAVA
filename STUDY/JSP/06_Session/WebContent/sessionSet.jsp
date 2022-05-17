<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션을 저장(String, Object)
session.setAttribute("name", "new name change!!");
// 세션에 유효시간(기본 30분) : 따라서 꼭 지정해주지 않아도 된다.
session.setMaxInactiveInterval(60);
// index.jsp로 돌려보낸다.
response.sendRedirect("index.jsp");
%>
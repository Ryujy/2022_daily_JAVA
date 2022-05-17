<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<p>이름 : <%=request.getParameter("name") %></p>
<p>나이 : <%=request.getParameter("age") %></p>
<p>전화번호(추가된 파라메터) : <%=request.getParameter("tel") %></p>
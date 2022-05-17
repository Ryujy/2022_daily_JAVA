<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 사용할 빈 등록(객체화) -->
<jsp:useBean id="firstBean" class="com.beans.FirstBean" scope="session"/>

<p>새로 빈에 등록된 이름 : <jsp:getProperty name="firstBean" property="name" /></p>
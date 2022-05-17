<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 빈에 받아온 값을 넣고 result.jsp로 전송한다. -->

<!-- 사용할 빈 등록(객체화) -->
<jsp:useBean id="firstBean" class="com.beans.FirstBean" scope="session"/>

<!--  request 에서 받아온 userName을 bean에 추가 -->
<!-- param 속성을 이용하면 파라매터의 값을 넣는다. -->
<jsp:setProperty name="firstBean" property="name" param="userName"/>

<!-- 페이지 이동 -->
<jsp:forward page="result.jsp"/>
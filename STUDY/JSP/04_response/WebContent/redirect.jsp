<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 여기서는 다른 페이지로 이동만 시킬 예정 -->
<% 
	String id = request.getParameter("id");
	System.out.println("id : "+id); // client 에서 넘어온 값은 반드시 찍어주자

	if(id.equals("admin")){
		response.sendRedirect("endPage.jsp");
	}else {
		response.sendRedirect("index.jsp");
	}
// sendRedirect 는 한 문장만 쓸 수 있다. 동시에 쓰면 집이랑 학원을 동시에 가라고 명령하는 것과 마찬가지
%>
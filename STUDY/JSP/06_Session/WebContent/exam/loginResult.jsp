<!-- 05-16 code review -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. id와 pw 가 admin과 pass 가 아니면 login.jsp로 돌려보낸다.
	String id = request.getParameter("id");  // login.jsp에서 받아온 id 값을 String 변수 id에 저장한다.
	String pw = request.getParameter("pw"); // login.jsp에서 받아온 pw 값을 String 변수 pw에 저장한다. 이 parameter는 login.jsp의 name 과 일치해야함
	System.out.println(id+"/"+pw); // 받아온 id와 pw값을 출력해본다. 이유는 null이 들어왔을까봐 null 이 들어오면 NullPointException


	if(id == null || pw == null) {//NullPointException에 대한 방어 코드로 id 또는 pw 가 null이면 
		response.sendRedirect("login.jsp"); // login.jsp로 돌려보낸다.
	}
		//2. 맞으면 session 에 loginId 라는 이름으로 받아온 id값을 넣는다.
		if(id.equals("admin") && pw.equals("pass")) { //NullPointException 떨어지는 위치 null을 비교하려고 하면 exception이 떨어진다.
			session.setAttribute("loginId", id); // 세션에 어떤 속성을 집어넣는데 속성의 이름을 loginId로 값을 변수 id에 담긴 값으로 저장한다.
			response.sendRedirect("mypage.jsp"); // 그리고 mypage.jsp로 보낸다.
		} else { // 아니면 login.jsp 로 돌려보낸다.
			response.sendRedirect("login.jsp");
		}



%>
    
    

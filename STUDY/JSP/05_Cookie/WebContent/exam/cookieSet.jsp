<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// main.jsp 에서 받아온 파라메터를 쿠키에 저장
String value = request.getParameter("lang");
System.out.println(value);

// value 의 값이 null일 경우 NullPoinException 이 날 수 있다.
// 그것을 방어하기 위한 코드
if(value != null) {
	// 쿠키에 저장
	Cookie cookie = new Cookie("lang", value); 
	cookie.setMaxAge(60*60*24); // 초(하루로 지정해보자)
	response.addCookie(cookie);
	// 이후 cookieGet.jsp로 보내기
	response.sendRedirect("cookieGet.jsp");
	
} else {
	// 아무것도 설정하지 않으면 되돌아간다.
	response.sendRedirect("main.jsp");
}



%>
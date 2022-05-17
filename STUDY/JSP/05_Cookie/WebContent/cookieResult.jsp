<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//이미 저장된 쿠키를 불러오려면 사용자 PC에서 request를 이용해 불러와야 한다.
    	// 쿠키는 생성된 브라우저에서만 저장된다. 다른 브라우저의 쿠키가 공유 되지 않는다. 크롬에서 팝업창 다시보지않기 해놓아도 익스에서 팝업창 뜸
    	Cookie array[] = request.getCookies(); // 쿠키는 한 개가 아닌 여러개니까 배열로 받는다.
    	
    	for(Cookie cookie : array) {
    		out.println("<p>"+cookie.getName()+" : "+cookie.getValue()+"</p>");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
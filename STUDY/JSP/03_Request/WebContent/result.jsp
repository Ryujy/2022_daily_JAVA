<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
//파라메터 가져오기
	String name = request.getParameter("userName");
	String gender = request.getParameter("gender");
	String hobbies[] = request.getParameterValues("hobby");
	// 그 외 request 에서 가져오는 정보들...
	System.out.println("도메인 : " + request.getServerName());
	System.out.println("포트번호"+request.getServerPort());
	System.out.println("URL : "+request.getRequestURL());
	System.out.println("URI : " + request.getRequestURI());
	System.out.println("Protocol : "+request.getProtocol());
	System.out.println("요청 방식 : " + request.getMethod());
	System.out.println("요청 IP : "+request.getRemoteAddr()); //IP V6
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<table>
			<tr>
				<th>이름</th>
				<td> <%= name %> </td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<% if(gender.equals("male")){ %>
						남자
					<% } else { %>
						여자
					<% } %>
					
				</td>
			</tr>
			<tr>
				<th>취미</th>
				<td>
					<% for(String hobby : hobbies) { %>
						<%=hobby %>
					<% } %>
				</td>
			</tr>
			<tr>

			</tr>
		</table>
</body>
</html>
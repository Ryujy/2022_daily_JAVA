<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//get 방식으로 보낼 때는 톱캣에서 한글 깨짐을 방지해준다. (8부터 가능)
//post 방식은 별도의 처리를 해줘야 한다.
request.setCharacterEncoding("UTF-8"); 

// index.jsp 에서 받아온 파라메터를 application 영역에 저장
String id = request.getParameter("userId");
String name = request.getParameter("userName");
System.out.println(id + "/" + name);

if(id != null && name != null) {
	//application 도 서버에 저장되는 객체로 사용법은 session과 거의 동일하다.
	application.setAttribute("name", name);
	application.setAttribute("id", id);
} else {
	response.sendRedirect("index.jsp");
}

%>
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=name %>님 반갑습니다. </br>
	<%=name %>님의 아이디는 <%=id %>입니다.</h3>
	
	<form action="session.jsp" method="post">
		<table border ="1">
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email"/></td>
			</tr>		
			<tr>
				<th>연락처</th>
				<td><input type="text" name="cellPhone"/></td>
			</tr>
			<tr>
				<th colspan="2">
					<button>전송</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="application.jsp" method="post">
		<table border ="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="userId"/></td>
			</tr>		
			<tr>
				<th>이름</th>
				<td><input type="text" name="userName"/></td>
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
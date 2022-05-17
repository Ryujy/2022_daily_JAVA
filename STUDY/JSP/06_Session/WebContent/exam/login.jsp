<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	th,td {
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<form action="loginResult.jsp" method="POST"> <!-- 로그인 페이지에서 loginResult.jsp로 id와 pw 값을 post 형식으로 보낸다. -->
	<!-- post방식은 get방식과 달리 url에 parameter 값이 노출되지않아 보안상 더 좋고, parameter 값의 제한이 거의 없다. 속도가 느리다는 단점이 있다. -->
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" value=""></td>  <!-- id라는 이름으로 값을 받는다. -->
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="text" name="pw" value=""></td> <!-- pw이름으로 값을 받는다. -->
			</tr>
			<tr>
				<th colspan="2">
					<button>LOGIN</button>
				</th>
			</tr>
			
		</table>
		
	</form>
</body>
</html>
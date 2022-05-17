<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td {
		border:1px solid black;
		border-collapse : collapse;
	}
	th, td {
		padding : 5px 10px;
	}
	input[type="text"]{
		width:100%;
	}
</style>
</head>
<body>
	<h1> Request Test </h1>
	<form action="jsUse.jsp" method="get">
		<table>
			<tr>
				<th>이름</th>
				<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="gender" value="male"/>남자
					<input type="radio" name="gender" value="female"/>여자
				</td>
			</tr>
			<tr>
				<th>취미</th>
				<td>
					<input type="checkbox" name="hobby" value="독서"/> 독서
					<input type="checkbox" name="hobby" value="게임"/>게임
					<input type="checkbox" name="hobby" value="축구"/>축구
					<input type="checkbox" name="hobby" value="영화"/>영화
				</td>
			</tr>
			<tr>
				<td colspan="2"><button>전송</button></td>
			</tr>
		</table>
	</form>
</body>
</html>
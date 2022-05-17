<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, thd {
		border : 1px solid black;
		bordr-collapse : collase;"
	}
</style>
</head>
<body>
	<form action="stopPage.jsp" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<th>나이<th>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<th colspan=2><button> 전송 </button> </th>
			</tr>
		</table>
	</form>
</body>
</html>
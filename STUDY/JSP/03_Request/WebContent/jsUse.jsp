<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	
</style>
<body>
			<table>
			<tr>
				<th>이름</th>
				<td id="name">  </td>
			</tr>
			<tr>
				<th>성별</th>
				<td id = "gender">

				</td>
			</tr>
			<tr>
				<th>취미</th>
				<td id="hobby">

				</td>
			</tr>
			<tr>

			</tr>
		</table>
</body>
<script>
	var name = "<%=request.getParameter("userName")%>";
	var gender = "<%=request.getParameter("gender")%>" ;
	var hobby = [];
	
	<% 
	String[] hobby = request.getParameterValues("hobby");
	for(String h : hobby) {
	%>
	
		hobby.push("<%=h%>");
	<%}%>
	
	document.getElementById("name").innerHTML = name;
	document.getElementById("gender").innerHTML = gender;
	document.getElementById("hobby").innerHTML = hobby.join(',');
	
	
	
	
</script>
</html>
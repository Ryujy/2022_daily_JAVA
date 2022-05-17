<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL TAG 연산</h3>
	<!-- 4칙 연산 -->
	\${5+7} = ${5+7} <br/>
	\${8-3} = ${8-3} <br/>
	\${9/3} = ${9/3} <br/>
	\${6*3} = ${6*3} <br/>
	\${9%2} = ${9%2} <br/>
	
	<!-- 논리 연산 -->
	<ul>
		<li>\${10==9 } = ${10==9} </li>
		<li>\${10 eq 9 } = ${10 eq 9} </li>
		
		<li>\${10!=9 } = ${10!=9} </li>
		<li>\${10 ne 9 } = ${10 ne 9}</li>
		
		<li>\${3<8} = ${3<8}</li>
		<li>\${3 lt 8} = ${3 lt 8}</li>
		
		<li>\${3>8} = ${3>8}</li>
		<li>\${3 gt 8} = ${3 gt 8}</li>
		
		<li>\${15 <= 9} = ${15 <= 9}</li>
		<li>\${3 gt 8} = ${3 gt 8}</li>
		
		<li>\${15 <= 9} = ${15 <= 9}</li>
		<li>\${3 le 8} = ${3 le 8}</li>
		
		<li>\${7 >= 7} = ${7 <= 7}</li>
		<li>\${7 ge 7} = ${7 ge 7}</li>
		
		<!-- 3항 연산자 -->
		<li>\${5+3==8 ? 1:0 } = ${5+3==8?1:0 }</li>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>inputFrm.jsp - 성적 입력 폼</h1>
<form action="score" method="post">
		<table border="1" width="250" align="left">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" size="15" /></td>
				</tr>	
				<tr>
					<td>생년월일</td>
					<td><input type="text" name="birth" size="15" /></td>
				</tr>	
				<tr>
					<td>Java</td>
					<td><input type="text" name="java" size="15" /></td>
				</tr>	
				<tr>
					<td>MySQL</td>
					<td><input type="text" name="mysql" size="15" /></td>
				</tr>	
				<tr>
					<td>Web</td>
					<td><input type="text" name="web" size="15" /></td>
				</tr>
				<tr align="center">	
					<td colspan="2"><button>전송</button></td>
				</tr>
		</table>
</form>
</body>
</html>
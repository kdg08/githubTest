<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>score.jsp</h1>
<h2>${name}님, (${age}세)</h2>
------------------------------------------------<br>
<h2>java: ${java}점</h2>
<h2>mysql: ${mysql}점</h2>
<h2>web: <%=request.getAttribute("web") %>점</h2>
------------------------------------------------<br>
${result}
<%-- <h2>total: ${total}</h2> --%>
<%-- <h2>avg: ${avg}</h2> --%>
<%-- <h2>grade: ${grade}</h2> --%>
</body>
</html>
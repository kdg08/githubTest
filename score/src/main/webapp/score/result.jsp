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
<h2>${name}��, (${age}��)</h2>
------------------------------------------------<br>
<h2>java: ${java}��</h2>
<h2>mysql: ${mysql}��</h2>
<h2>web: <%=request.getAttribute("web") %>��</h2>
------------------------------------------------<br>
${result}
<%-- <h2>total: ${total}</h2> --%>
<%-- <h2>avg: ${avg}</h2> --%>
<%-- <h2>grade: ${grade}</h2> --%>
</body>
</html>
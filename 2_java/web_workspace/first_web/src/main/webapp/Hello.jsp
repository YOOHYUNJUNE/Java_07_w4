<%@page import="java.time.LocalDateTime"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 웹 프로젝트!!!</title>
	<!-- // <%// java 코드 작성 가능%> 안에 java 코드 작성 가능 -->

</head>

<body>

	<h1>Hello World!</h1>
	<!-- JSP : Java를 품은 HTML -->
	<hr>
	<p> 
		현재 날짜와 시간은 <%=LocalDateTime.now()%>
	</p>
	


	
	

</body>
</html>
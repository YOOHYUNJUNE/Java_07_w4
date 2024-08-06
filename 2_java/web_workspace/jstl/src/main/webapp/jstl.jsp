<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습</title>
</head>
<body>
	<!-- jstl 사용을 위해 taglib 지시어(jstl어딨는지, 접두어가 무엇인지) 추가 -->
	<c:set var="title" value="<h1>JSP</h1>"/>
	${title}
	
	<c:set var="greeting" value="안녕하세요"/>
	${greeting}
	
	<br>
	
	<c:set var="numArr" value="${[1,2,3,4,5]}"/>
	${numArr[2]}
	
	<br>
	
	<c:set var="loginUser" value='${sessionScope.loginUser}'/>
	
	<c:if test='${loginUser != null}'>
		<p>${greeting}, ${loginUser.getName()}님!</p>
		<form action="/jstl/logout" method="post"/>
		<button>로그아웃</button>
	</c:if>
	<c:if test='${loginUser == null}'>
		<p>로그인해주세요.</p>
		<form action="/jstl/login" method="post">
			<input type="text" name="name"/>
			<button>로그인</button>
		</form>
	</c:if>
	

	<c:choose>
	
		<c:when test='${loginUser == null}'>
			<p>로그인해주세요.</p>
			<form action="/jstl/login" method="post">
				<input type="text" name="name"/>
				<button>로그인</button>
			</form>
		</c:when>		
		
		<c:when test="${loginUser.getName().equals(\"유현준\")}">
			<p>드디어 오셨군요. ${loginUser.getName()}님 </p>
			<form action="/jstl/logout" method="post">
				<button>로그아웃</button>
			</form>
		</c:when>
		
		<c:otherwise>
			<p>${greeting}, ${loginUser.getName()}님!</p>
			<form action="/jstl/logout" method="post">
				<button>로그아웃</button>
			</form>
		</c:otherwise>
		
	</c:choose>
	
	
	<c:forEach var="u" items="${userList}">
		<p>${u.getName()}</p>
	</c:forEach>
	
	
	
	
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
	<h1>로그인 폼</h1>
	<c:choose>
		<!-- 로그인 상태 -->
		<c:when test="${sessionScope.loginedUser != null}">
			<p>${sessionScope.loginedUser}님 어서오세요!</p>
			<form action="login" method="post">
				<input type="hidden" name="action" value="logout" />
				<input type="submit" value="로그아웃"/>
			</form>
		
		</c:when>
		
		<!-- 로그아웃 상태 -->
		<c:otherwise>
			<form action="login" method="post">
				아이디 :<input type="text" name="userId"/> <br/>
				비밀번호 : <input type="password" name="userPw"/> <br/>
				<input type="submit" value="로그인"/>
			</form>
		
		</c:otherwise>
	
	</c:choose>	
	
	
	<p style="color:red">${error}</p>
	
	
	
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
    
<!DOCTYPE html>
<html>
<head>

<!-- 부트스트랩 css, js번들 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>뉴스 보기</title>
</head>
<body>

	<div class="container mt-5 mx-auto">
		<h2 class="text-center mb-4">${news.getTitle()}</h2>
		<hr/>
		<div class="card mx-auto">
			<img src="/img/${news.getImg()}" alt="뉴스 이미지" />
			<div class="card-body">
				<h4 class="card-title">보도일자 : ${news.getDate()}</h4>
				<p class="card-text">내용 : ${news.getContent()}</p>				
			</div>		
		</div>
			<hr/>
			<a href="javascript:history.back()" class="btn btn-primary">📌 뒤로가기 📌</a>
	
	
	</div>

	
	
</body>
</html>
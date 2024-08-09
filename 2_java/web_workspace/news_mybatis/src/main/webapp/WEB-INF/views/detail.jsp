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
<title>뉴스 상세 보기</title>
</head>
<body>

	<div class="container mt-5 mx-auto">
		<h2 class="text-center mb-4">${news.title}</h2>

		<div class="card mx-auto">
			<div style="text-align:center;">
				<img style="width:300px; height:auto;" src="/img/${news.img}" alt="뉴스 이미지" />
			</div>
			<div class="card-body">
				<h6 class="card-text">${news.content}</h6>				
			</div>		
		</div>
			<div style="text-align:right;">
				<p style="padding:5px;" class="card-title">보도일자 : ${news.date}</p>
				<a href="/news/edit?id=${news.id}" class="btn btn-outline-danger">수정하기</a>
				<a href="/news" class="btn btn-primary m-2">뒤로가기</a>			
			</div>
	
	
	
	

	</div>

	
</body>
</html>
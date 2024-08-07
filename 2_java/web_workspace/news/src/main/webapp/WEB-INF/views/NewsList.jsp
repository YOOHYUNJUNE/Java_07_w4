<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>

<!-- 부트스트랩 css, js번들 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>뉴스 목록</title>
</head>
<body>
	<div class="container w-75 mt-5 mx-auto">
		<h2 class="text-center mb-4">뉴스 목록</h2>
		<hr/>
		<ul class="list-group mb-4">
			
		<c:forEach var="news" items="${newsList}" varStatus="s">
			
			<li class="list-group-item list-group-item-action d-flex justify-content-between align-items-center">
				<a>[${s.count}] ${news.getTitle()}</a>
				<div>			
					<span>${news.getDate()}</span>
					<a><span class="badge bg-secondary"> &times; </span></a>
				</div>
			</li>
		</c:forEach>
		
			<li class="list-group-item list-group-item-action d-flex justify-content-between align-items-center">
				<a>[2] 이도현 파리올림픽 남자 클라이밍 출전</a>
				<div>
					<span>2024-08-07</span>
					<a><span class="badge bg-secondary"> &times; </span></a>
				</div>
			</li>
		</ul>
		
		<!-- 에러 메시지 -->
		<div class="alert alert-danger alert-dismissible fade show mt-3" role="alert">
			에러 발생 : error
			<button class="btn-close" data-bs-dismiss="alert"></button>
		</div>
		
		<!-- 기사 등록 버튼 -->
		<button class="btn btn-outline-success collapse-button" data-bs-toggle="collapse" 
			data-bs-target="#addForm" aria-expanded="false" aria-controls="addForm">기사 등록</button>
		
		<!-- 기사 등록 화면 : 등록 버튼을 누르면 나옴 -->
		<div class="collapse" id="addForm">
			<div class="card card-body">
				<form 
					action="/news/newsList?action=addNews"
					method="post"
					enctype="multipart/form-data"  
				>
					<label for="title" class="form-label">제목</label>
					<input id="title" name="title" class="form-control" required />
					
					<label for="img" class="form-label">이미지</label>
					<input id="img" name="img" class="form-control" type="file" required />
					
					<label for="content" class="form-label">기사 내용</label>
					<textarea id="content" name="content" class="form-control" rows="5" cols="50" required></textarea>
					
					<button class="btn btn-success mt-3">저장</button>
				</form>
			</div>
		</div>
		
		
		
		
	
	</div>
</body>
</html>
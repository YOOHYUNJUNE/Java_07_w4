<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
    
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- style.css 가져오기: servlet을 거치기 때문에 경로가 아닌 변수 주소로 해야함  -->
<link href="${pageContext.request.contextPath}/style.css" rel="stylesheet">

<meta charset="UTF-8">
<title>제품 수정 페이지</title>

<link rel="icon" href="/img/자바아이콘.png" type="image/png">

</head>
<body>
	
	<div class="container mt-5 mx-auto">
		<div style="text-align: center;">
			<img style="width:500px; height:500px" src="/img/${coffee.getImg()}" alt="커피 이미지" />
		</div>

		<div class="card mx-auto">
			<h3 class="text-center m-2 mx-auto">제품명 : ${coffee.getName()}</h3>
			<hr/>
			<p class="card-text m-2">카페인 함량 : ${coffee.getCaffeine()}mg | 당 함량 : ${coffee.getSugar()} g</p>
			<hr/>
			<p class="card-text m-2">${coffee.getDetail()}</p>
		</div>
	
		<!-- 수정하기 버튼 만들기, 토글 형태로 수정 양식 나타나게 하기 -->
		<!-- 메뉴 등록 버튼 -->
		<div class="d-flex justify-content-between">
			<div>
				<button class="btn btn-outline-success collapse-button m-2" data-bs-toggle="collapse" 
					data-bs-target="#modifyForm" aria-expanded="false" aria-controls="modifyForm">메뉴 수정</button>
				<a href="javascript:history.back()" class="btn btn-primary m-2">돌아가기</a>
				
			</div>	
			<div>
				<a href="/coffee/coffeeList?action=deleteCoffee&id=${coffee.getId()}" class="btn btn-danger m-2">삭제</a>
			</div>
		</div>
	
		
	
		<!-- 메뉴 수정 화면 : 버튼 누르면 나옴 -->
		<div class="collapse" id="modifyForm">
			<div class="card card-body">
				<form
					action="/coffee/coffeeView?action=modifyCoffee"
					method="post"
					enctype="multipart/form-data"
				>
					<input type="hidden" name="id" value="${coffee.getId()}">
				
					<label for="name" class="form-label">이름</label>
					<input id="name" name="name" class="form-control" value="${coffee.getName()}" required />
				
					<label for="img" class="form-label">이미지</label>
					<input id="img" name="img" class="form-control" type="file" accept="image/*" />
					
					<label for="price" class="form-label">가격</label>
					<input id="price" name="price" class="form-control" type="number" value="${coffee.getPrice()}" required  />
				
					<label for="caffeine" class="form-label">카페인 함량</label>
					<input id="caffeine" name="caffeine" class="form-control" type="number" value="${coffee.getCaffeine()}" required />
				
					<label for="sugar" class="form-label">당 함량</label>
					<input id="sugar" name="sugar" class="form-control" type="number" value="${coffee.getSugar()}" required />
					
					<label for="detail" class="form-label"></label>
					<textarea id="detail" name="detail" class="form-control" rows="5" cols="50" required>${coffee.getDetail()}</textarea>
					
					<button class="btn btn-success mt-2">등록</button>
					<a href="/coffee/coffeeView?id=${coffee.getId()}" class="btn btn-primary mt-2">취소</a>


				</form>
			
			</div>
		
		</div>
	
	
	
	
	
	
	
	
	
	
	
	</div>

</body>
</html>
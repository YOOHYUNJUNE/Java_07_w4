<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- 부트스트랩 css, js번들 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- style.css 가져오기: servlet을 거치기 때문에 경로가 아닌 변수 주소로 해야함  -->
<link href="${pageContext.request.contextPath}/style.css" rel="stylesheet">

<meta charset="UTF-8">
<title>커피 목록</title>
</head>
<body>

	<div class="container w-75 mt-5 mx-auto">
		<h2 class="text-center mb-4">커피 목록</h2>
		<hr/>
		
		
		<c:choose>
		
			<c:when test="${not empty coffeeList}">
			
				<ul class="list-group mb-4">
				
					<c:forEach var="coffee" items="${coffeeList}" varStatus="s">
					
					<li class="list-group-item list-group-item-action d-flex justify-content-between align-items-center">
						<a href="/coffee/coffeeView?id=${coffee.getId()}">[%] ${coffee.getName()} / ${coffee.getPrice()}</a>
						<a href="/coffee/coffeeList?action=deleteCoffee&id=${coffee.getId()}"></a>
					</li>
	
					</c:forEach>
				</ul>
				
			</c:when>
	
			<c:otherwise>
				<div>등록된 메뉴가 없습니다.</div>
			</c:otherwise>
	
		</c:choose>
		
	<!-- 에러 메시지 -->
	<c:if test="${error != null}">
		<div class="alert alert-danger alert-dismissible fade show mt-3" role="alert">
			에러 발생 : ${error}
			<button class="btn-close" data-bs-dismiss="alert"></button>
		</div>
	</c:if>
	
	<!-- 메뉴 추가 버튼 -->
	<button class="btn btn-outline-success collapse-button" data-bs-toggle="collapse" 
			data-bs-target="#addForm" aria-expanded="false" aria-controls="addForm">메뉴 추가</button>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 함수사용 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

   
<!DOCTYPE html>
<html>
<head>

<!-- 부트스트랩 css, js번들 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- style.css 가져오기: servlet을 거치기 때문에 경로가 아닌 변수 주소로 해야함  -->
<link href="${pageContext.request.contextPath}/style.css" rel="stylesheet">

<meta charset="UTF-8">
<title>기가GGC커피</title>

<link rel="icon" href="/img/자바아이콘.png" type="image/png">

</head>
<body>

  <!-- 네비게이션 바 -->
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="https://www.mega-mgccoffee.com/">
            	<img style="width:300px; height:80px" src="/img/기가커피_홈.jpg" alt="홈">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="https://blog.naver.com/ekddusekddus"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_블로그.png" alt="블로그">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="https://www.facebook.com/mega.mgc.coffee.official"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
	                       	<img src="/img/메가네비_페북.png" alt="페북">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="https://www.instagram.com/mega.mgc.coffee_official/"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_인스타.png" alt="인스타">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="https://smartstore.naver.com/megamgccoffee"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_스토어.png" alt="스토어">
                        </span></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>





	<div class="container w-90 mt-5 mx-auto">
		
		
		<c:choose>
		
			<c:when test="${not empty coffeeList}">
				<br/><br/><br/><br/>
				<h4 style="font-size:20px; opacity:0.7;" class="text-center mb-4">기가GGC커피의 엄선된 메뉴</h4>
				<h1 style="font-size:60px; font-weight:bold;" class="text-center mb-4">GIGA MENU</h1>
				<br/>
				<h6 style="font-size:11px; opacity:0.5;" class="text-center mb-4">※메뉴 이미지는 연출컷이라 실물과 다를 수 있습니다.</h6>
			
			<div class="container mt-5">
			
				<div class="row">
				
						<c:forEach var="coffee" items="${coffeeList}" varStatus="s">
							<div class="col-md-3 mb-4 coffee-item">
								<div class="img-container">
									<a class="text-link" href="/coffee/coffeeView?id=${coffee.getId()}">
										<img src="/img/${coffee.getImg()}" alt="커피 이미지" /> <br/>
										
										<!-- 제품 설명에 따라 ICE, HOT 오버레이 이미지 구분 -->
											<c:choose>
	   											<c:when test="${fn:contains(coffee.getDetail(), '아이스')}">
		   											<div class="overlay">
														<img src="/img/아이콘_ICE.png" alt="핫" class="over-img">
		   											</div>
												</c:when>
											
												<c:otherwise>
													<div class="overlay">
														<img src="/img/아이콘_HOT.png" alt="아이스" class="over-img">
													</div>
												</c:otherwise>
											</c:choose>
										
									</a>
								</div>
								<br/><br/>
								<p style="font-size: 20px; font-weight: bold;">${coffee.getName()}</p> <hr/>
								<p style="text-align: right;">&#x20A9; ${coffee.getPrice()}</p>
								<p style="text-align: right;" class="sugar">카페인:${coffee.getCaffeine()}mg |
								당류:${coffee.getSugar()}g</p>								
								<p class="detail">${coffee.getDetail()}</p>
							
							</div>
						</c:forEach>
				</div>
			</div>
				
			</c:when>
			
			<c:otherwise>
				<div style="text-align: center;" class="no-news-msg">메뉴를 추가해주세요.</div>
			
			</c:otherwise>
			
			
			
		</c:choose>
		
		<!-- 에러 메시지 -->
		<c:if test="${error != null}">
			<div class="alert alert-danger alert-dismissible fade show mt-3" role="alert">
				에러 발생 : ${error}
				<button class="btn-close" data-bs-dismiss="alert"></button>
			</div>
		</c:if>
		
		<!-- 커피 추가 버튼 -->
		<div style="text-align: right;">
			<button class="btn btn-outline-success collapse-button mb-2" data-bs-toggle="collapse" 
			data-bs-target="#addForm" aria-expanded="false" aria-controls="addForm">메뉴 추가</button>
		</div>
		
		<!-- 커피 등록 화면 : 등록 버튼을 누르면 나옴 -->
		<div class="collapse" id="addForm">
			<div class="card card-body">
				<form
					action="/coffee/coffeeList?action=addCoffee"
					method="post"
					enctype="multipart/form-data"
				>
					<label for="name" class="form-label">제품명</label>
					<input id="name" name="name" class="form-control" required />
					<br/>
					<label for="img" class="form-label">이미지</label>
					<input id="img" name="img" class="form-control" type="file" accept="image/*" required />
					<br/>
					<label for="price" class="form-label">가격</label>
					<input id="price" name="price" class="form-control" type="number" required />
					<br/>
					<label for="caffeine" class="form-label">카페인 함량</label>
					<input id="caffeine" name="caffeine" class="form-control" type="number" required />
					<br/>
					<label for="sugar" class="form-label">당 함량</label>
					<input id="sugar" name="sugar" class="form-control" type="number" required />
					<br/>
					<label for="detail" class="form-label">상세 설명</label>
					<textarea id="detail" name="detail" class="form-control" rows="5" cols="50" required></textarea>
					<br/>
					<button class="btn btn-success mt-3">등록</button>
					<button class="btn btn-outline-success collapse-button mt-3" data-bs-toggle="collapse" 
						data-bs-target="#addForm" aria-expanded="false" aria-controls="addForm">취소</button>
					
					
					
				</form>
			
			</div>
		
		</div>
		
		
		
		
		
	
	</div>
</body>
</html>
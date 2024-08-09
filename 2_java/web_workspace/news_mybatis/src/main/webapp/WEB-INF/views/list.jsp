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

<!-- 네비게이션 바 -->
    <nav style="box-shadow: 0 1px 4px rgba(0,0,0,0.1);" class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="http://localhost:8080/news">
            	<img style="width:300px; height:80px" src="/img/자바커피.png" alt="홈">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="http://localhost:8080/news"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_블로그.png" alt="블로그">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="http://localhost:8080/news"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
	                       	<img src="/img/메가네비_페북.png" alt="페북">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="http://localhost:8080/news"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_인스타.png" alt="인스타">
                        </span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="http://localhost:8080/news"><span class="nav-circle rounded-circle d-inline-block text-white p-2">
                        	<img src="/img/메가네비_스토어.png" alt="스토어">
                        </span></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>











	<div class="container w-80 mt-5 mx-auto">
		<h1 style="font-size:60px; font-weight:bold;" class="text-center mb-4">뉴스 목록</h1>
		<h5 style="text-align:right;">오늘날짜</h5>
		<hr/>

		<c:choose>

			<c:when test="${not empty newsList}">

				<div class="container mt-2">
					<div class="row">

						<c:forEach var="news" items="${newsList}" varStatus="s">

							<div style="padding:15px;" class="list-group mb-4 col-md-6" >
								<!--   onclick="Location.href='/news/detail?id=${news.getId()}'" role="button" -->
								<a style="color: green; text-decoration: none;"
									class="text-link" href="/news/detail?id=${news.id}">[${s.count}] ${news.getTitle()}</a>
									<br/>
									<a href="/news/detail?id=${news.id}" style="text-align:center;">
										<img style="width:50%; height:auto;" src="/img/${news.getImg()}" alt="${news.getImg()}" /> <br/>
									</a>
									
									<br/>
									
									
								<div style="text-align:right;">
									<span>${news.getDate()}</span> 
									
									<!-- post방식으로 해서, 주소 입력만으로 delete할 수 없도록 -->
									<form action="/news/delete" method="post" class="d-inline">
										<input name="id" type="hidden" value="${news.id}">
										<button class="badge bg-secondary"> &times; </button>
									</form>
										
								</div>
								
								
								<br/><br/>
							</div>
						</c:forEach>

					</div>
				</div>


			</c:when>

			<c:otherwise>
				<div class="no-news-msg">뉴스 기사가 없습니다.</div>
			</c:otherwise>

		</c:choose>

		<!-- 에러 메시지 -->
		<c:if test="${error != null}">
			<div class="alert alert-danger alert-dismissible fade show mt-3" role="alert">
				에러 발생 : ${error}
				<button class="btn-close" data-bs-dismiss="alert"></button>
			</div>
		</c:if>
		
		
		
		<!-- 기사 작성하기 -->
		<a href="news/add" class="btn btn-outline-primary mb-3">기사 작성</a>
		
		
		
		
		
		
		
		
		
		
		
			
		
	</div>
</body>
</html>
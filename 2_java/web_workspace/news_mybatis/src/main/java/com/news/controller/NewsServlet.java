package com.news.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/news/*") // 서블릿 경로
@MultipartConfig(maxFileSize = 1024*1024*5, location = "C:\\Users\\WD\\news") // 이미지 저장 경로
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// url 주소에 따른 동작을 수행하도록 map 생성
	Map<String, NewsController> ctrlMap = new HashMap<>();
	
	// url 주소에 따른 Controller 연결
    public NewsServlet() {
    	ctrlMap.put("/news", new ListController()); // "news"가 들어오면 ListController 보여준다
    	ctrlMap.put("/news/detail", new DetailController()); 
    	ctrlMap.put("/news/add", new AddController());
    	ctrlMap.put("/news/edit", new EditController());
    	ctrlMap.put("/news/delete", new DeleteController());

    }

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// POST 요청시 서버에 한글 인코딩 전송
		req.setCharacterEncoding("UTF-8");
		
		// URI를 가져와서 uri에 맞는 컨트롤러 가져오기
		String uri = req.getRequestURI();
		NewsController ctrl = ctrlMap.get(uri);
		
		// uri에 맞는 컨트롤러가 없으면 404 반환
		if (ctrl == null) {
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		// 맞는 컨트롤러가 있으면 process 메소드 수행
		ctrl.process(req, res);
		
		
		
	}

}

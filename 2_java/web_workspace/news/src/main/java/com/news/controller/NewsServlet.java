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


@WebServlet("/news/*")
@MultipartConfig(maxFileSize = 1024*1024*2, location="C:\\Users\\WD")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, NewsController> controllerMap = new HashMap<>();
      
    public NewsServlet() {
    	controllerMap.put("/news/newsList", new ListController()); // 기사 전체 보기
    	controllerMap.put("/news/newsView", new ViewController()); // 기사 보기
    	
    }

    // NewsController로부터 
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
		String requestURI = req.getRequestURI(); // http://localhost:8080/news/ 주소 접속 가능
		System.out.println(requestURI);
		NewsController controller = controllerMap.get(requestURI);
		
		if (controller == null) {			
//			controller = controllerMap.get("/news/newsList"); // 디폴트로 newsList를 띄움
			res.setStatus(HttpServletResponse.SC_NOT_FOUND); // res가 아닌 원래 값을 입력해야함
			return;
			
		}
		
		controller.process(req, res);
	}

}

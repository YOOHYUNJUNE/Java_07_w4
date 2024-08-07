package com.coffee.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/coffee/*")
@MultipartConfig(maxFileSize = 1024*1024*2, location="C:\\Users\\WD")
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Map<String, CoffeeController> controllerMap = new HashMap<>();
 
    public CoffeeServlet() {
    	// 커피 메뉴 보기
    	controllerMap.put("/coffee/coffeeList", new ListController());
    	
    	// 커피 상세 설명 보기
    	controllerMap.put("/coffee/coffeeView", new ViewController());
    }

    @Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	String requestURI = req.getRequestURI();
    	CoffeeController controller = controllerMap.get(requestURI);
    	
    	if (controller == null) {
    		res.setStatus(HttpServletResponse.SC_NOT_FOUND);
    		return;
    	}
    	
    	controller.process(req, res);
    	
	}

}

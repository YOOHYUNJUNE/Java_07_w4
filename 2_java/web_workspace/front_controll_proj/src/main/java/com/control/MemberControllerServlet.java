package com.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/*")
public class MemberControllerServlet extends HttpServlet {
	
	private Map<String, MemberController> controllerMap = new HashMap<>();
	public MemberControllerServlet() {
		controllerMap.put("/front/member/new-form", new FormController());
		controllerMap.put("/front/member/save", new SaveController());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		System.out.println(requestURI);
		MemberController controller = controllerMap.get(requestURI);
		System.out.println(controller);
		
		if (controller == null) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		controller.process(req, resp);
		
		
		
	}
	
	
	
	

}

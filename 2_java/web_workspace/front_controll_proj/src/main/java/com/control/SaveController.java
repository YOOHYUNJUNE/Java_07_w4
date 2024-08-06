package com.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;

public class SaveController implements MemberController{

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String viewPath = "/WEB-INF/views/save-result.jsp";
		
		String name1 = req.getParameter("name");
		int age1 = Integer.parseInt(req.getParameter("age"));
		
		req.setAttribute("name2", name1);
		req.setAttribute("age2", age1);
		
		req.setAttribute("user", new User(name1, age1));
		
		req.getRequestDispatcher(viewPath).forward(req, res);
		
		
	}

}

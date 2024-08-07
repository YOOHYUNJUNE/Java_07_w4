package com.coffee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coffee.service.CoffeeService;
import com.coffee.service.CoffeeServiceImpl;

public class ListController implements CoffeeController {
	
	CoffeeService cs = new CoffeeServiceImpl();

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) {
		
		String action = req.getParameter("action");
		
		if (action != null && action.equals("addCoffee")) {
			System.out.println("메뉴 추가");
			
			return;
			
		} else if (action != null && action.equals("deleteCoffee")) {
			System.out.println("메뉴 삭제");
			
			return;
			
		} else {
			// default
			System.out.println("메뉴 전체 보기");
		}
		
	}

}

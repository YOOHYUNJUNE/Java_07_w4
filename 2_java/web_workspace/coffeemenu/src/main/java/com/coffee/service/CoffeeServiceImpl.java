package com.coffee.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import com.coffee.dao.CoffeeDAO;
import com.coffee.dao.CoffeeDAOImpl;
import com.coffee.model.Coffee;

public class CoffeeServiceImpl implements CoffeeService {
	
	CoffeeDAO coffeeDAO = new CoffeeDAOImpl();

	@Override
	// 요청 파라미터 (name, img, price, caffeine, sugar, detail)를 가지고 Coffee 객체 생성
	public void addCoffee(HttpServletRequest req) throws Exception {
		String name = req.getParameter("name");
//		String img = req.getParameter("img");
		int price = Integer.parseInt(req.getParameter("price")) ;
		int caffeine = Integer.parseInt(req.getParameter("caffeine"));
		int sugar = Integer.parseInt(req.getParameter("sugar"));
		String detail = req.getParameter("name");
		
		// img 가져오기
		Part part = req.getPart("img");
		String header = part.getHeader("content-disposition");
		int start = header.indexOf("filename=");
		String img = header.substring(start + 10, header.length()-1);
		
		// img 저장
		if (img != null && !img.isEmpty()) {
			part.write(img);
		}
		
		// Coffee 객체 생성
		Coffee coffee = new Coffee(name, img, price, caffeine, sugar, detail);
		
		// DAO에게 DB에 넣으라 명령
		coffeeDAO.addCoffee(coffee);
		
		
	}

	@Override
	public List<Coffee> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coffee getCoffee(HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCoffee(HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyCoffee(HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}

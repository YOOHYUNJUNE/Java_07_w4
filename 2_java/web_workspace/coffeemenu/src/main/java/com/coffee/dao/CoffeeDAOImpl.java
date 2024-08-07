package com.coffee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.coffee.model.Coffee;
import com.coffee.util.ConnectionPool.DBPool;

public class CoffeeDAOImpl implements CoffeeDAO {

	@Override
	public void addCoffee(Coffee coffee) throws Exception {
		String sql = "insert into coffee (name, img, price, caffeine, sugar, detail) values (?,?,?,?,?,?)";
		
		try (		
			Connection conn = DBPool.getDBPool();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, coffee.getName());
			pstmt.setString(2, coffee.getImg());
			pstmt.setInt(3, coffee.getPrice());
			pstmt.setInt(4, coffee.getCaffeine());
			pstmt.setInt(5, coffee.getSugar());
			pstmt.setString(6, coffee.getDetail());
			
			pstmt.executeUpdate();
			
		}
		
	}

	@Override
	public List<Coffee> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coffee getCoffee(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCoffee(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyCoffee(Coffee coffee) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

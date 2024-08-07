package com.coffee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CoffeeController {
	void process(HttpServletRequest req, HttpServletResponse res);
}

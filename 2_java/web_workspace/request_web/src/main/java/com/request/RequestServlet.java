package com.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RequestServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// http://localhost:8080/request_web/req?name=유현준
		// http://localhost:8080/request_web/req?name=유현준&hobby=취미1&hobby=취미2
		String data = request.getParameter("name");
		System.out.println(data);
		
		String[] options = request.getParameterValues("hobby");
		if (options != null) {
			for (String opt : options) {
				System.out.println(opt);
			}
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

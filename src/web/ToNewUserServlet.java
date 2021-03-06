package com.ruanko.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class ToNewUserServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				request.setCharacterEncoding("UTF-8");
				HttpSession session = null;
				session = request.getSession();
				Integer userId = (Integer)session.getAttribute("userId");
				
				if (userId == null) {
					response.sendRedirect("toLogin");
				}else {
					request.getRequestDispatcher("/newUser.jsp").forward(request, response);
				}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
}

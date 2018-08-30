package com.jwt.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jwt.hibernate.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(userName, password, email, phone, city);
			
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

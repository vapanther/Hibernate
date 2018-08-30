package com.jwt.hibernate.controller3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jwt.hibernate.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password1");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		//String stockId = request.getParameter("stockId");
		String stockName = request.getParameter("stockName");
		String stockCode = request.getParameter("stockCode");
		//String bookId = request.getParameter("bookid");
		String bookisbn = request.getParameter("bookisbn");
		String bookname = request.getParameter("bookname");
		String bookaurthor = request.getParameter("bookauthor");
		String bookpublisher = request.getParameter("bookpublisher");
		int bookprice=Integer.valueOf(request.getParameter("bookprice"));
		
		//HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addStockDetails(stockName, stockCode);
			userDAO.addBookkDetails(bookisbn,bookname,bookaurthor,bookpublisher,bookprice);
			userDAO.addUserDetails(userName, password, email, phone, city);
			
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

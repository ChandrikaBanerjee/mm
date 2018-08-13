package com.cg.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.service.MoneyMoneyBankService;

/**
 * Servlet implementation class MoneyMoneyBankController
 */
@WebServlet("*.app")
public class MoneyMoneyBankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MoneyMoneyBankService service=new MoneyMoneyBankService();
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		
		switch(action)
		{
		 case "/search.app":
			 int accountToBeSearched = Integer.parseInt(request.getParameter("searchAccount").toString());

//			 System.out.println("Account number : " + accountToSearched2);
			 service.getAccountByAccountNumber(accountToBeSearched);
			 System.out.println("*********************2");
			 session.setAttribute("search",  service.getAccountByAccountNumber(accountToBeSearched));
			 System.out.println("*********************3");
			 response.sendRedirect("viewAccount.jsp");
			break;
		 case "/viewAllAccount.app":
			
			 System.out.println("All Accounts : " +service.viewAll());
			 session.setAttribute("BankAccounts", service.viewAll());
			 response.sendRedirect("viewAllCustomers.jsp");
			 break;
		} 
		
			 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

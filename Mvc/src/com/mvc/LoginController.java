package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	PrintWriter out=response.getWriter();
	String name=request.getParameter("uname");
	String password=request.getParameter("password");
	LoginBean bean=new LoginBean();
	bean.setName(name);
	bean.setName(password);
	request.setAttribute("bean", bean);
	if(bean.validate())
	{
		RequestDispatcher rd=request.getRequestDispatcher("LoginSuccess.jsp");
		rd.forward(request, response);
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("LoginFailure.jsp");
		rd.forward(request, response);
	}
	}

}

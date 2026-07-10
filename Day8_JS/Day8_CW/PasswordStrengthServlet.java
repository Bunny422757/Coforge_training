package com.coforge.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordStrengthServlet
 */
@WebServlet("/PasswordStrengthServlet")
public class PasswordStrengthServlet extends HttpServlet {
	static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String password = "";
		password = request.getParameter("pwd");
	
		if(password!=null && password.length()<3) {
			out.println("<font color = 'red'><b>WEAK</b></font>");
		}
		if(password!=null && password.length()>3 && password.length()<6) {
			out.println("<font color = 'yellow'><b>GOOD</b></font>");
		}
		if(password!=null && password.length()>6) {
			out.println("<font color = 'green'><b>STRONG</b></font>");
		}
		
		out.close();
	}

}

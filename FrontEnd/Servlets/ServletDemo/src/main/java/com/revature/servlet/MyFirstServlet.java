package com.revature.servlet;

<<<<<<< HEAD
public class MyFirstServlet {

=======
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7277435585400150737L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) 
	throws ServletException,IOException{
		System.out.println("howdy!");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) 
			throws ServletException,IOException{
				System.out.println("Post Up!");
			}

	
	
>>>>>>> e819e1ca6e08a61b3406d01e43bc510202531b0b
}

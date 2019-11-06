package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.bean.VideoGame;
import com.revature.dao.VideoGameDaoImpl;

/**
 * Servlet implementation class VGServlet
 */
public class VGServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException{
		
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	//method called for any GET request sent by the server/host
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//used to show get request happen on the tomcat apache server
    	//System.out.println("in doGet "); 
    	
    	//used to interface with JSON OBJECT by mapping each variable to the 
    	//corresponding fields in our POJO
		ObjectMapper mapper= new ObjectMapper();
		
		//used to make a call to the database for 
		VideoGameDaoImpl vgdi = new VideoGameDaoImpl();
		
		// the variable ID is being read from the HTTP Request variable request passed into the method
		//this is stored in the key value: pair with the key value of 'vgid' defined in the js file
		int id = mapper.readValue(request.getParameter("vgid"), Integer.class);
		
		//mouse over PrintWriter for details for both the class and what the method is actually doing
		PrintWriter out=response.getWriter();
		
		// string literal of JSON object
		String vgJSON;
		try {
			//this is where the magic happens
			//take the string literal and write the response from the database
			//to the string 
			vgJSON = mapper.writeValueAsString(vgdi.getVGbyID(id));
			
			//this is formatting the response to the needed format for the front-end
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			
			//this actually sends the formatted information to the front-end for consumption by client
			out.print(vgJSON);
			
			//what the raw data to be handled by the js/html files looks like 
			//before it is further formatted to be human readable?/useful?
			System.out.println(vgJSON);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//cleans out your PrintWriter to prevent data leakage/corruption
		out.flush();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
		VideoGame vg = null;
		ObjectMapper mapper= new ObjectMapper();
		VideoGameDaoImpl vgdi = new VideoGameDaoImpl();
		//convert JSON to POJO
		//YOU NEED A DEFAULT CONSTRUCTOR  IN YOUR JAVA OBJECT CLASS IN ORDER TO DO THIS
		vg= mapper.readValue(request.getInputStream(), VideoGame.class);
		System.out.println(vg);
		try {
			vgdi.instertVG(vg);
			PrintWriter pw = response.getWriter();
			pw.write("<h3>Added Video Game</h3>");
			pw.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

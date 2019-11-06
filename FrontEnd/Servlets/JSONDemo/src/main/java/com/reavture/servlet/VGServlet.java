package com.reavture.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.VideoGame;
import com.revature.dao.VideoGameDaoImpl;

public class VGServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		ObjectMapper mapper= new ObjectMapper();
		VideoGameDaoImpl vgdi= new VideoGameDaoImpl();
		int id= mapper.readValue(request.getParameter("vgid"), Integer.class);
		PrintWriter out=response.getWriter();
		String vgJSON;
		try {
			vgJSON= mapper.writeValueAsString(vgdi.getVGbyID(id));
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			out.print(vgJSON);
			System.out.println(vgJSON);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
		VideoGame vg=null;
		ObjectMapper mapper= new ObjectMapper();
		//convert JSON to a Java Object
		//YOU NEED A DEFAULT CONSTRUCTOR IN UR JAVA OBJECT CLASS IN ORDER TO USE THIS!!
		vg=mapper.readValue(request.getInputStream(), VideoGame.class);
		System.out.println(vg);
		VideoGameDaoImpl vgdi= new VideoGameDaoImpl();
		try {
			vgdi.insertVG(vg);
			PrintWriter pw=response.getWriter();
			pw.write("<h3>Added Video Game</h3>");
			pw.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

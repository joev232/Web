package com.ejemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CerrarSession extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=null;
		session=req.getSession();
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		if(null==(session=req.getSession(false))){
			
		}else{
			pw.println("Session Cerrada");
			session.invalidate();
		}
	//	super.doGet(req, resp);
	}
	
}

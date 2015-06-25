package com.ejemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;


import com.ejemplo.connection.SessionManager;
import com.ejemplo.tablasDTO.Departments;


public class ListaDepartamento extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Session session=SessionManager.obtenerSesionNueva();
		List<Departments> ld=session.createSQLQuery("SELECT * FROM DEPARTMENTS").addEntity(Departments.class).list();
		Departments d=null;
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<select>");
		Iterator it=ld.iterator();
		while(it.hasNext()){
			d=(Departments) it.next();
			pw.println("<option value="+d.getDepartmentId()+">"+d.getDepartmentName()+"</option>");
		}
		pw.println("</select>");
		
				
		//super.doGet(req, resp);
	}

}

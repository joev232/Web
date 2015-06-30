package com.ejemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.ejemplo.connection.Pool;
import com.ejemplo.connection.SessionManager;
import com.ejemplo.tablasDTO.Employees;

public class ListarSueldos extends HttpServlet {

	private final Logger log=LogManager.getRootLogger();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		try{
		String sueldo= req.getParameter("sueldo");
		int sueldoe=Integer.parseInt(sueldo);
		
		Employees em=null;
		
		
		Session session=SessionManager.obtenerSesionNueva();
		List<Employees> sueldoemp=session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE SALARY<"+sueldoe).addEntity(Employees.class).list();
		Iterator it=sueldoemp.iterator();
		while(it.hasNext()){
			em=(Employees) it.next();
			
			pw.println("<h4>Nombre: "+ em.getFirstName()+" Salario: " +em.getSalary()+"</h4><br>");
		}
		}catch (NumberFormatException e){
			pw.println("El formato de sueldo no es correcto debe ser entero");
		}
		
	
	}
	
}

package com.ejemplo.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.ejemplo.DAO.EmpHibernateDAO;
import com.ejemplo.interfaz.IRecuperable;
import com.ejemplo.service.EmployeeService;

public class EjemploEmpleado extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		EmployeeService es=new EmployeeService();
		
		IRecuperable i_hibernate=new EmpHibernateDAO();
		//es.set
		es.setRecuperable(i_hibernate);
		//es.leerEmpleado(i);
		
		
		ServletContext sc= req.getServletContext();//refencia la contexto
		
		SessionFactory sf= (SessionFactory) sc.getAttribute("sf");
		
		//crear session y cerrarla
		Session session=sf.openSession();
		
		//Session session=sf.
		
		//System.out.println("get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//super.doPost(req, resp);
	}

}

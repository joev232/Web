package com.ejemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ejemplo.connection.Pool;
import com.ejemplo.tablasDTO.Empleado;

public class ServletAutenticacion extends HttpServlet{
	
private final Logger log= LogManager.getRootLogger();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre=req.getParameter("nombre");
		String pass=req.getParameter("pass");
		
		try {
			Connection conn=null;
			ResultSet rset=null;
			Statement stmt=null;
			
			conn=Pool.getConnection();	
			stmt= conn.createStatement();
			
			rset=stmt.executeQuery("SELECT * FROM USUARIO WHERE USER_NAME='"+nombre+"'");
			//rset=stmt.executeQuery("select * from USUARIO WHERE USER_NAME="+nombre);
			if (rset.next()){
				String nombreusuario=rset.getString(1);
				String password=rset.getString(2);
			
				if((nombreusuario.equals(nombre)) && (password.equals(pass))   ){
					log.info("Bienvenido"+nombreusuario);
				}else{
					log.info("usuario no existe");
				}
				
				resp.setContentType("text/html");
				PrintWriter pw=resp.getWriter();
				pw.println("Bienvenido"+nombreusuario);
				//pw.println(edto.getFirstName());
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	super.doPost(req, resp);
	}

}

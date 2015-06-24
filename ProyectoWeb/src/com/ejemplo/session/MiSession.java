package com.ejemplo.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MiSession extends HttpServlet{
	
	//private final Logger log = Logger.g 
	private final Logger log= LogManager.getRootLogger();
	
	
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	//si la peticion tiene una session valida y sino se la genero
	
	HttpSession ses=null;
 	//ses=req.getSession(false);
	
 	//asi no compila
 	if(null==(ses=req.getSession(false))){
 		ses=req.getSession();
 		log.info("Petitcion sin session asociada");
 	}else{
 		log.info("cliente con session asociada");
 	}
	//super.doPost(req, resp);
}
	
}



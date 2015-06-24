package com.ejemplo.listeners;



import java.util.logging.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;







public class ListenerHttp implements HttpSessionListener{

	//private final Logger log= LogManager.getRootLogger();
	//private final Logger log= LogManager.getRootLogger();
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		//no sale 
		
		System.out.println("session creado");
		arg0.getSession();
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Session Destruido");
		
	}

}

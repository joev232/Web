package com.ejemplo.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

import com.ejemplo.connection.SessionManager;

public class ListenerServletContext implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		//estaria en un try 
		ServletContext sc=sce.getServletContext();
		SessionFactory sf=(SessionFactory) sc.getAttribute("sf");
		sf.close();
			
		//System.out.println("contexto destruido");
 }

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//se llama cuando arranca la aplicacion 
		//session manager y log y iniciarHB
		ServletContext sc=null;
		sc= sce.getServletContext();//refencia al objeto
		//llamar a session manager y coger el sessiomfactory y me guardo el contexto
		
		
		SessionFactory sf= SessionManager.getSessionFactory();
		
		//me guardo contexto
		sc.setAttribute("sf", sf);
		
		System.out.println("contexto inicializado");
		
	}

}

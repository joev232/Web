import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetContextPropertiesRule;


public class Prueba extends HttpServlet {
	
	//metodos q vamos a sobreescribir doget y dopost
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//req.getParameter("nombre");
		
		//System.out.println(req.getParameter("nombre"));
		String nombre=req.getParameter("nombre");
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("el nombre es"+nombre+"y el numero de letras q tiene es="+nombre.length());
		//System.out.println("Ha llamado a get");
		
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ha llamado a post");
		super.doPost(req, resp);
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ha llamado a service");
		super.service(arg0, arg1);
	}

}

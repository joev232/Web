import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Filtro implements javax.servlet.Filter {

	private final Logger log= LogManager.getRootLogger();
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.info("Estoy en destroy");
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		//para acceder a un servelcontetx
		arg0.getServletContext();
		
		
		Long ti=System.currentTimeMillis();
		//dentro del tercer parametro 
		arg2.doFilter(arg0, arg1);
		//antes y despues el tiempo para saber el tiempo q tarda el filter
		
		Long tf= System.currentTimeMillis();
		System.out.println("Tiempo q se se demora el servlet"+(tf-ti));
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		log.info("Estoy en init");
	}

}

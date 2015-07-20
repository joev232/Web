package com.ejemplo.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.ejemplo.service.EmployeeService;
import com.ejemplo.tablasDTO.Employees;

public class EtiquetaDepartamentos extends SimpleTagSupport {
	
	private int iddepartamento;
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
			
		getJspContext().getOut().println("llamando a Etiqueta departamento!");
		//consulta para modificar
		EmployeeService empservice=new EmployeeService();
		PageContext pc=(PageContext) getJspContext();
		
		//String departamentoid= req.getParameter("departamentoid");
		//int deparid=Integer.parseInt(departamentoid);
		
		List<Employees> emple= empservice.obtenerEmpleadosPorDepartamento(iddepartamento);	
		pc.getRequest().setAttribute("empleado", emple);
		
		for (Employees employees : emple) {
		employees.getFirstName();
		getJspContext().getOut().println("Nombre"+employees.getFirstName()+"<br>");
		getJspContext().getOut().println("Apellidos"+employees.getLastName()+"<br>");
		getJspContext().getOut().println("Salario"+employees.getSalary()+"<br>");
		
	}
		
		
	}
	public int getIddepartamento() {
		return iddepartamento;
	}
	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

}

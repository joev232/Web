<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejemplo Empleados </title>
</head>
<body>




<!-- muestro id del departamento a mostrar -->
<jsp:useBean id="empleado" type="com.ejemplo.tablasDTO.Employees" scope="request"/>
	<jsp:getProperty property="departmentId" name="empleado"/>







</body>
</html>
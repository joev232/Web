<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC Ejemplo Empleado</title>
</head>
<body>

<h3>hollaaaaaaa mvcc</h3>

<!-- class puede ser type la diferencia ?   request muere cuando se ejecuta jsp  -->
<jsp:useBean id="empleado" class="com.ejemplo.tablasDTO.Employees" scope="request"/>

<!-- hacer una tabla      empleado bean-->
<jsp:getProperty property="firstName" name="empleado"/>


</body>
</html>
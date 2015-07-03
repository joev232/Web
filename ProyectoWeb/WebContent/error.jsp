<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isErrorPage="true" %>




    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba de error</title>
</head>
<body>

<h3>la pagina jsp no esta disponible</h3>
<%
Integer codigoHttp;
codigoHttp=(Integer)request.getAttribute("javax.servlet.error.status_code");
out.println("el error es codigo"+codigoHttp);
%>
</body>
</html>
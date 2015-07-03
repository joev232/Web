<%@page import="org.apache.logging.log4j.LogManager"%>
<%@page import="org.apache.logging.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<%@ page errorPage="error.jsp" %>

<%@import org.apache.logging.log4j.LogManager %>
<%@import org.apache.logging.log4j.* %>

 <%-- <%@include file=”/ListaDepartamento” --%> 
 
 <jsp:include page="/ListarSueldos"></jsp:include>


<%!

private final Logger log= LogManager.getRootLogger();
int numeromagico=-1;

%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adivina Numeros</title>
</head>
<body>


<form action="adivina2.jsp">
<h3>Es este el numero </h3>
<input type="text" name="numero" value="<%=numeromagico %>>"><br>




<select name="opcion">

<option value="Mayor">Mayor</option>
<option value="Menor">Menor</option>
<option value="Igual">Igual</option>
</select>

<h1>Hola 
</h1>




</form>

</body>
</html>
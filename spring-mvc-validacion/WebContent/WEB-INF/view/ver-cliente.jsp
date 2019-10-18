<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Procesar cliente</title>
</head>
<body>
	<h1>Cliente</h1>
	<p>Nombre:${cliente.nombre}</p>
	<p>NIF:${cliente.nif}</p>
	<p>Provincia:${cliente.provincia}</p>
	<p>Sector:${cliente.sector}</p>
	Pagos:

	<ul>
		<c:forEach var="pago" items="${cliente.pagos}">

			<li>${pago}</li>

		</c:forEach>
	</ul>
</body>
</html>
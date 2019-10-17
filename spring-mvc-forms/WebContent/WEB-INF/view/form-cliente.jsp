<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta clientes</title>
</head>
<body>
	<form:form action="procesar" modelAttribute="cliente">
		Nombre:<form:input path="nombre" />
		<br />
		NIF:<form:input path="nif" />
		<br />
		Provincia: <form:select path="provincia">
			<form:options items="${ cliente.listaProvincias}" />
		</form:select>
		<br />
			Sector: <form:radiobuttons path="sector"
			items="${cliente.listaSectores}" />
			<br />
				Pagos: <form:checkboxes path="pagos"
				items="${cliente.listaPagos}" />
		<input type="submit">
	</form:form>
</body>
</html>
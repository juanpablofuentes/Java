<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta clientes</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="procesar" modelAttribute="cliente">
		Nombre(*):<form:input path="nombre" />
		<form:errors path="nombre" cssClass="error" />
		<br />
		NIF:<form:input path="nif" />
		<form:errors path="nif" cssClass="error" />
		<br />
			DNI admin:<form:input path="dni_admin" />
		<form:errors path="dni_admin" cssClass="error" />
		<br />
		Credito:<form:input type="number" path="credito" />
		<form:errors path="credito" cssClass="error" />
		<br />
		Provincia: <form:select path="provincia">
			<form:options items="${ cliente.listaProvincias}" />
		</form:select>
		<br />
			Sector: <form:radiobuttons path="sector"
			items="${cliente.listaSectores}" />
		<br />
				Pagos: <form:checkboxes path="pagos" items="${cliente.listaPagos}" />
		<input type="submit">
	</form:form>
</body>
</html>
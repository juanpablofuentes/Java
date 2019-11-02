<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarea</title>
</head>
<body>
	<h1>Tarea</h1>

	<form:form action="savetarea" modelAttribute="tarea" method="post">
	<form:hidden  path="idtarea" />
		<p>
			Nombre:
			<form:input path="nombre" />
		</p>
		<p>
			Prioridad:
			<form:input path="prioridad"></form:input>
		</p>
		<p>
			Vencimiento:
			<form:input  path="vencimiento"></form:input>
		</p>
		<input type="submit" value="Guardar"/>
		<a href="${pageContext.request.contextPath}/tarea/lista">Lista de tareas</a>
	</form:form>
</body>
</html>
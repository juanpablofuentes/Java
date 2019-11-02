<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de tareas</title>
</head>
<body>
	<h1>Lista de tareas</h1>

	<a href="addtarea">Añadir tarea</a>
	<table>
		<tr>
			<td>Id</td>
			<td>Nombre</td>
			<td>Prioridad</td>
			<td>Vencimiento</td>
			<td>Acciones</td>
		</tr>

		<c:forEach var="tarea" items="${tareas}">
			<c:url var="linkEditar" value="/tarea/updatetarea">
				<c:param name="idtarea" value="${tarea.idtarea }" />
			</c:url>
			<tr>
				<td>${tarea.idtarea }</td>
				<td>${tarea.nombre }</td>
				<td>${tarea.prioridad }</td>

				<td><fmt:formatDate value="${tarea.vencimiento}" type="date"
						pattern="dd-MM-yyyy" /></td>
				<td><a href="${linkEditar }">Editar</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
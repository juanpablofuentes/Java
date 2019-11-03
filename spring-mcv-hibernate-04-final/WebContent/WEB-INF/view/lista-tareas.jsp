<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de tareas</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<img src="${pageContext.request.contextPath}/resources/img/task.png"
				alt="tareas" class="float-right" height="150" />
			<h1>Lista de tareas</h1>
			<p>Mantenimiento de una lista de tareas realizado con Spring e
				Hibernate.</p>

		</div>


		<a href="addtarea" class="btn btn-primary mb-1">Añadir tarea</a>
		<table class="table table-striped">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Prioridad</th>
				<th>Vencimiento</th>
				<th>Acciones</th>
			</tr>

			<c:forEach var="tarea" items="${tareas}">
				<c:url var="linkEditar" value="/tarea/updatetarea">
					<c:param name="idtarea" value="${tarea.idtarea }" />
				</c:url>
				<c:url var="linkBorrar" value="/tarea/deletetarea">
					<c:param name="idtarea" value="${tarea.idtarea }" />
				</c:url>
				<tr>
					<td>${tarea.idtarea }</td>
					<td>${tarea.nombre }</td>
					<td>${tarea.prioridad }</td>

					<td><fmt:formatDate value="${tarea.vencimiento}" type="date"
							pattern="dd-MM-yyyy" /></td>
					<td><a href="${linkEditar }"
						class="btn btn-outline-success btn-sm">Editar</a> <a
						href="${linkBorrar }"
						onclick="if(!confirm('¿Está seguro?')) return false"
						class="btn btn-outline-danger btn-sm">Borrar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>
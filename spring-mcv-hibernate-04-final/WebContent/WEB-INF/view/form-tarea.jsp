<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarea</title>
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
			<h1>${ tarea.idtarea==0 ? "Nueva" : "Editar"}  tarea</h1>
			<p>Mantenimiento de una lista de tareas realizado con Spring e
				Hibernate.</p>

		</div>


		<form:form action="savetarea" modelAttribute="tarea" method="post">
			<form:hidden path="idtarea" />
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<form:input path="nombre" class="form-control" />
			</div>


			<div class="form-group">
				<label for="nombre">Prioridad:</label>
				<form:input path="prioridad" class="form-control" />
			</div>
			<div class="form-group">
				<label for="nombre">Vencimiento:</label>
				<form:input path="vencimiento" class="form-control" />
			</div>
			<input type="submit" value="Guardar" class="btn btn-success" />
			<a href="${pageContext.request.contextPath}/tarea/lista"
				class="btn btn-outline-primary float-right"> Volver a lista de
				tareas</a>
		</form:form>
	</div>
</body>
</html>
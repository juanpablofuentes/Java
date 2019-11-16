<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarea</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<div class="float-right">
				Usuario:
				<sec:authentication property="principal.username" />
				<form:form action="${pageContext.request.contextPath}/logout"
					method="POST">
					<button type="submit" class="btn btn-warning">Salir</button>
				</form:form>
			</div>
			<div>
				<h1>Catálogo</h1>
				<h3>Añadir categorías</h3>
			</div>
		</div>

		<form:form action="savecategory" modelAttribute="category"
			method="post">
			<form:hidden path="idcategory" />
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<form:input path="name" class="form-control" />
			</div>


			<div class="form-group">
				<label for="nombre">Descripción:</label>
				<form:input path="description" class="form-control" />
			</div>

			<input type="submit" value="Guardar" class="btn btn-success" />
			<a href="${pageContext.request.contextPath}/"
				class="btn btn-outline-primary float-right"> Volver a lista de
				categorías</a>
		</form:form>
	</div>
</body>
</html>
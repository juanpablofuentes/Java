<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Producto</title>
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
				<h3>Añadir producto</h3>
			</div>
		</div>

		<form:form action="saveproduct" modelAttribute="product" method="post">
			<form:hidden path="idproduct" />
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<form:input path="name" class="form-control" />
			</div>


			<div class="form-group">
				<label for="nombre">Stock:</label>
				<form:input path="stock" class="form-control" />
			</div>
			<div class="form-group">
				<label for="nombre">Precio:</label>
				<form:input path="price" class="form-control" />
			</div>
			<div class="form-group">
				<label for="nombre">Categoría:</label>
				<form:select class="form-control" path="category.idcategory">
					<option value="0">--Selecciona--</option>
					<form:options items="${categories}" itemValue="idcategory"
						itemLabel="name" />
				</form:select>
			</div>
			<input type="submit" value="Guardar" class="btn btn-success" />
			<a href="${pageContext.request.contextPath}/"
				class="btn btn-outline-primary float-right"> Volver a lista de
				categorías</a>
		</form:form>
	</div>
</body>
</html>
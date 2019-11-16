<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catálogo</title>
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
				<h3>Categorías</h3>
			</div>


		</div>
		<sec:authorize access="hasAnyRole('GERENTE','ADMIN')">
			<a href="${pageContext.request.contextPath}/gerente/addcategory"
				class="btn btn-primary mb-1">Añadir categoría</a>
		</sec:authorize>

		<table class="table table-striped">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Num productos</th>
				<sec:authorize access="hasAnyRole('GERENTE','ADMIN')">
					<th>Acciones</th>
				</sec:authorize>
			</tr>

			<c:forEach var="category" items="${categories}">
				<c:url var="linkEditar" value="/gerente/updatecategory">
					<c:param name="idcategory" value="${category.idcategory }" />
				</c:url>
				<c:url var="linkBorrar" value="/admin/deletecategory">
					<c:param name="idcategory" value="${category.idcategory }" />
				</c:url>
				<c:url var="linkProducts" value="/products">
					<c:param name="id" value="${category.idcategory }" />
				</c:url>
				<tr>
					<td>${category.idcategory }</td>
					<td>${category.name }</td>
					<td>${category.description }</td>
					<td><a href="${linkProducts }">${fn:length(category.products) }</a></td>
					<sec:authorize access="hasAnyRole('GERENTE','ADMIN')">
						<td><sec:authorize access="hasAnyRole('GERENTE','ADMIN')">
								<a href="${linkEditar }" class="btn btn-outline-success btn-sm">Editar</a>
							</sec:authorize> <sec:authorize access="hasRole('ADMIN')">
								<a href="${linkBorrar }"
									onclick="if(!confirm('¿Está seguro?')) return false"
									class="btn btn-outline-danger btn-sm">Borrar</a>
							</sec:authorize></td>
					</sec:authorize>
				</tr>
			</c:forEach>
		</table>
	</div>




</body>
</html>
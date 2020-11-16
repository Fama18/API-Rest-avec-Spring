<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifier pharmacie</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous" />
<body style="background-color:#ADD8E6">
	<form action="updatePharmacie" method="post">
		<pre>
		    id : <input type="text" name="idProduit" value="${produit.idProduit}">
			nom : <input type="text" name="nomProduit" value="${produit.nomProduit}">
			prix : <input type="text" name="prixProduit" value="${produit.prixProduit}">
			date création : <fmt:formatDate pattern="yyyy-MM-dd" value="${produit.dateCreation}" var="formatDate" />
		    <input type="date" name="date" value="${formatDate}"></input>
		    <input type="submit" value="Modifier">
		</pre>
	</form>
	<br />
	<br />
	<a href="ListeProduits">Liste Produits</a>
</body>
</html>
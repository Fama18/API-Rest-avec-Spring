<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<body style="background-color:#BDB76B">
	<h1>Liste des pharmacies</h1>
	<table>
		<tr>
			<th>ID</th><th>Nom </th><th>Quartier</th><th>Ville</th><th>Etat</th><th>Suppression</th><th>Edition</th>
		</tr>
		<c:forEach items="${pharmacies}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.nom}</td>
				<td>${p.quartier}</td>
				<td>${p.ville}</td>
				<td>${p.etat}</td>
				<td><a onclick="return confirm('Etes-vous sur ?')" href="supprimerPharmacie?id=${p.id}">Supprimer</a></td>
				<td><a href="modifierPharmacie?id=${p.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
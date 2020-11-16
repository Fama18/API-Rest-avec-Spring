<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter une Pharmacie</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous" />
<body style="background-color:#ADD8E6">
	<form action="savePharmacie" method="post">
		<pre>
			nom : <input type="text" name="nomProduit">
			prix : <input type="text" name="prixProduit">
			date création : <input type="date" name="date">
		    <input type="submit" value="ajouter">
		</pre>
	</form>
	${msg}
	<br />
	<br />
	<a href="ListeProduits">Liste Produits</a>
</body>
</html>
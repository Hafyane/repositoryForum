<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h3>Ajout</h3>
	<br>
	<form action="ajoutvilleclient" method="post">
		<table border="1" width="30%">
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nom" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="description" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="ajouter" /></td>
			</tr>
		</table>
	</form>

	<h3>List Ville client</h3>
	<br>

	<table cellspacing="10">
		<tr>
			<td>ID</td>
			<td>NOM</td>
			<td>DESCRIPTION</td>
		</tr>

		<c:forEach items="${listvilleclt}" var="villeclt">
			<tr>
				<td>${villeclt.idVille}</td>
				<td>${villeclt.nom}</td>
				<td>${villeclt.description}</td>
			</tr>
		</c:forEach>
	</table>
	<h3>Suppression</h3>
	<br>
	<form action="deletevilleclt" method="post">
		<input type="text" name="id"> <br /> <input type="submit"
			value="delete">
	</form>
	<h3>Search</h3>
	<br>
	<form action="searchvilleclt" method="post">
		<input type="text" name="id"> <br /> <input type="submit"
			value="Search">
	</form>

</body>
</html>

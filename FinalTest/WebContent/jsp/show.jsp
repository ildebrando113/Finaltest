<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sala</title>
</head>
<body>
	<table>
		<tr>
			<th>nome</th>
			<th>cognome</th>
			<th>datanascita</th>
			<th>biglietto</th>
			<th>id</th>
		</tr>
	</table>
	<tr>
		<td><c:out value="${Spettatore.nome}" /></td>
		<td><c:out value="${Spettatore.cognome}" /></td>
		<td><c:out value="${Spettatore.datanascita}" /></td>
		<td><c:out value="${Spettatore.biglietto}" /></td>
		<td><c:out value="${Spettatore.id}" /></td>
		
	</tr>
</body>
</html>
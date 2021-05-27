<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Clients</title>
</head>
<body>
	<div align="center">
		<table border="1" cellpadding="5">
	        <tr>
	            <th>Id</th>
	            <th>Nom client</th>
	            <th>Prénom client</th>
	            <th>Téléphone client</th>
	            <th>Adresse client</th>
	            <th>Ville client</th>
	            <th>CIN client</th>
	            <th>Action</th>
	        </tr>
	        <c:forEach items="${listClient}" var="client">
		        <tr>
		            <td>${client.id_client}</td>
		            <td>${client.nom_client}</td>
		            <td>${client.prenom_client}</td>
		            <td>${client.tele_client}</td>
		            <td>${client.adresse_client}</td>
		            <td>${client.ville_client}</td>
		            <td>${client.cin_client}</td>
		            <td>
		                <a href="editer?id_client=${client.id_client}">Editer</a>
		                &nbsp;&nbsp;&nbsp;
		                <a href="supprimer?id_client=${client.id_client}">Supprimer</a>
		            </td>
		        </tr>
	        </c:forEach>
	    </table>
	</div>
</body>
</html>
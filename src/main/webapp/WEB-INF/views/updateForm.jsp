<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>
<div class="container">
	<form action="/update?previoustitle=${previoustitle}" method="post">
		<p>modification de	${previoustitle} </p>
		<label for="title" >Titre</label>
		<input type="text" name="title" id="title" placeholder="${title}">
		<label for="isbn" >ISBN</label>
		<input type="text" name="isbn" id="isbn" placeholder="${isbn}">
		<label for="auteur" >Auteur</label>
		<input type="text" name="auteur" id="auteur" placeholder="${auteur}">
		<button type="submit" >Mettre à jour</button>
		<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}"/>
		
	</form>
</div>
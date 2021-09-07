<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>
<div class="container">
	<form action="/" method="post">
		<label for="title" >Titre</label>
		<input type="text" name="title" id="title">
		<label for="isbn" >ISBN</label>
		<input type="text" name="isbn" id="isbn">
		<label for="auteur" >Auteur</label>
		<input type="text" name="auteur" id="auteur">
		<button type="submit" >Ajouter</button>
		<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}"/>
		
	</form>
</div>
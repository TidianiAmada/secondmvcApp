<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	
	
	
	
	<spring:message code="welcome.message"/>
		<div class="container">
		<a class = "btn btn-primary" href="/addForm"> Ajouter un livre</a>
	</div> 
<div class="container">
<table class="table table-hover">
	<thead class="thead-dark">
		<caption><spring:message code="todo.caption" /></caption>
		<tr>
            <th>Titre</th>
            <th>ISBN</th>
            <th>Auteur</th>
            
            <th>Action </th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${books}" var="bk" varStatus="Status">
		<tr>
				<td>${bk.getLivre()}</td>
				<td>${bk.getIsbn()}</td>
				<td>${bk.getAuteur()}</td>
				<!-- ajouter button -->
				<td>
				<a class = "btn btn-danger" href="/droplist?title=${bk.getLivre()}"> Effacer</a>
				<a class = "btn btn-warning" href="/updateForm?title=${bk.getLivre()}&isbn=${bk.getIsbn()}&auteur=${bk.getAuteur()}"> Modifier</a></td>
				
		</tr>
	</c:forEach>
	
	
</tbody>
</table>
</div>

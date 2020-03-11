

<%@page import="city.City"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Employee Details</title>
</head>
<body>
	<h1><%=session.getAttribute("logged")%></h1>


	<table>
		<tr>
			<th>Name</th>
			<th>PTT</th>
			<th>edit</th>
			<th>remove</th>
		</tr>
		<c:forEach items="${applicationScope.cities}" var="city">
			<tr>
				<td>${city.ime}</td>
				<td>${city.postanskiBroj}</td>
				<td><c:url var="edit" value="../city/edit">
						<c:param name="ptt" value="${city.postanskiBroj}" />
						<c:param name="ime" value="${city.ime}" />
					</c:url> <a href="<c:out value="${edit}"/>">Edit</a></td>
				<td><c:url var="remove" value="../city/remove">
						<c:param name="ptt" value="${city.postanskiBroj}" />
					</c:url><a href="<c:out value="${remove}"/>">REMOVE</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="../home">back</a>
</body>

</html>


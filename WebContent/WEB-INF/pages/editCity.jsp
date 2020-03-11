<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="../city/editedName">
ime <input name="editovanoIme" type="text" value="${requestScope.ime}">
	 <input type="hidden" name="hidden" value="edit" type="text">
	  <input type="hidden" name="ptt" value="${requestScope.ptt}" type="text">
<input type="submit" name="submit"/>
</form>
	<c:url var="back" value="../city/all">
	<c:param name="operation" value="back" />
	</c:url>
	 <a href="<c:out value="${back}"/>">back</a>
</body>
</html>
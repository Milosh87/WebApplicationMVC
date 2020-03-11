<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>


<form action="/../webappMVC/application/login" method="post">
Username: <input type="text" id="user" name="user"/>
Password: <input type="password" id="pass" name="pass"/>
<input type="submit" value="login">


	<c:out value="${requestScope.error}"></c:out>



</form>

</body>
</html>
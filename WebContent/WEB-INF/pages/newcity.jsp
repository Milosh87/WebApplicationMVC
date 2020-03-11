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
<h1>Add new city</h1>
<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
<form method="post" action="../city/new">
ime <input name="ime" type="text" value="${requestScope.ime}"/>
<br>
ptt <input name="ptt" type="text" value="${requestScope.ptt}"/>
<br>
 <input type="hidden" name="hidden" value="new" type="text"/>
 <input type="submit" name="submit"/>
${requestScope.error}
</form>
<c:url var="back" value="../home">
	<c:param name="operation" value="back"/>
	</c:url>
	 <a href="<c:out value="${back}"/>">back</a>
</body>
</html>
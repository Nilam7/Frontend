<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Category Form</h1>
<hr/>
<br/>
<form:form action="${pageContext.request.contextPath}/addcategory" modelAttribute="categoryobj" method="post">
<table>

<c:if test="${categoryobj.categoryId ne 0}">
<tr>
	<td>Category Id :</td>
	<td><form:input path="categoryId"/></td>
</tr>
</c:if>
<tr>
	<td>Category Name :</td>
	<td><form:input path="categoryName"/></td>
</tr>
<tr>
	<td>Category Description :</td>
	<td><form:input path="description"/></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>
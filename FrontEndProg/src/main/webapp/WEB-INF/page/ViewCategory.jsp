<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">View Category</h1>
<table>
<tr>
			<th>Category Name</th>
			<th>Category Description</th>
			<th colspan="2">Operations</th>
		</tr>
		<c:forEach items="${categories}" var="category">	
			<tr>
				<td>${category.categoryName}</td>
				<td>${category.description }</td>
				<td><a href="deleteCategory/${category.categoryId}">Delete</a></td>
				</tr>
		</c:forEach>

</table>
</body>
</html>
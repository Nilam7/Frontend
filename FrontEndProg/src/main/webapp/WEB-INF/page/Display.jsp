<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form:form action="${pageContext.request.contextPath}/addproduct" modelAttribute="productobj" method="post">
<tr>
	<td>Product Name</td>
	<td><form:input path="productName"/></td>
</tr>
<tr>	
	<td>Product Name</td>
	<td><form:input path="productName"/></td>
</tr>
<tr>	
	<td>Product Quantity</td>
	<td><form:input path="quantity"/></td>
</tr>
<tr>
	<td>Product Price</td>
	<td><form:input path="price"/></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</form:form>
</table>
</body>
</html>
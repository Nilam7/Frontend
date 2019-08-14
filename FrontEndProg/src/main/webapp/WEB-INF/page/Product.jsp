<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/addproduct" modelAttribute="productobj" method="post">
<table>
<c:if test="${productobj.productId ne 0}">
<tr>
	<td>Product Id :</td>
	<td><form:input path="productId"/></td>
</tr>
</c:if>
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
	
	<tr>
	<td>Category : </td>
	<td>
	<form:select path="categoryId">
	<form:option value="0">----select category-----</form:option>
	<c:forEach items="${categories}" var="obj">
	<form:option value="${obj.categoryId}">${obj.categoryName}</form:option> 
	 
	</c:forEach>
	</form:select>
	</td>
	</tr>
	
<tr>

	<td colspan="2"><input type="submit" value="submit"/></td>
</tr>	
</table>
</form:form>
</body>
</html>
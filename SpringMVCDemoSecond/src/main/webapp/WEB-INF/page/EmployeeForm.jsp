<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
</style>
</head>
<body>

<div align="center">
<fieldset>
<legend>Add Employee</legend>
<h1>${msg}</h1>

<form:form action="getemployeeform" modelAttribute="empobj" method="post">
<table>
<tr>
	<td>Employee Id :</td>
	<td><form:input type="text" path="employeeId"/></td>
	<td><form:errors path="employeeId" cssClass="error"></form:errors></td>
	
</tr>

<tr>
	<td>Employee Name :</td>
	<td><form:input type="text" path="employeeName"/></td>
	<td><form:errors path="employeeName" cssClass="error"></form:errors></td>
</tr>
<tr>
	<td>Email :</td>
	<td><form:input type="email" path="email"/></td>
	<td><form:errors path="email" cssClass="error"></form:errors></td>
</tr>
<tr>
	<td>ContactNumber :</td>
	<td><form:input type="tel" path="contactNumber"/></td>
	<td><form:errors path="contactNumber" cssClass="error"></form:errors></td>
</tr>
<tr>
	<td>Department Name :</td>
	<td><form:input type="text" path="departmentName"/></td>
	<td><form:errors path="departmentName" cssClass="error"></form:errors></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="AddEmployee"/></td>
</tr>
</table>
</form:form>
</fieldset>
</div>
</body>
</html>
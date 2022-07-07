<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<h1 style="background-color: lightgreen;" align="center">CUSTOMER
		RELATIONSHIP MANAGEMENT</h1>
	<h3 style="font-size: 135%; padding-left: 100px">Save Customer</h3>
	<form action="save" method="post">
		<table style="width: 35%;">
			<tr>
				<td
					style="font-size: 115%; padding-bottom: 5px; padding-left: 100px">First
					Name:</td>
				<td style="padding-bottom: 5px;"><input type="text"
					value="${customer.first_name}" name="first_name" /></td>
			</tr>
			<tr>
				<td
					style="font-size: 115%; padding-bottom: 5px; padding-left: 100px">Last
					Name:</td>
				<td style="padding-bottom: 5px;"><input type="text"
					value="${customer.last_name}" name="last_name" /></td>
			</tr>
			<tr>
				<td
					style="font-size: 115%; padding-bottom: 5px; padding-left: 100px">Email:</td>
				<td style="padding-bottom: 5px;"><input type="text"
					value="${customer.email}" name="email" /></td>
			</tr>
			<tr>
				<td><input type="hidden" value="${customer.customer_id}"
					name="customer_id" /></td>
				<td style="padding-top: 20px;"><input type="submit"
					value="Save" style="width: 30%;" /></td>
			</tr>
		</table>
		<br> <a href="list" style="width: 20%; padding-left: 100px">Back
			to list</a>
	</form>
</body>
</html>
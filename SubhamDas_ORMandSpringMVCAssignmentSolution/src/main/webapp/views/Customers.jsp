<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of customers</title>
</head>
<body>
	<h1 style="background-color: lightgreen;" align="center">CUSTOMER
		RELATIONSHIP MANAGEMENT</h1>
	<table align="center">
		<tr>
			<td><a href="addCustomer?customer_id=-1"><button
						type="button"
						style="width: 110%; font-size: 100%; background-color: rgb(255, 215, 0); border-width: 0.5px; padding: 3px">Add
						Customer</button></a></td>
		</tr>
	</table>
	<br>
	<table border="1" align="center" style="width: 50%;">
		<thead
			style="font-size: 125%; background-color: limegreen; color: white;">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody style="font-size: 115%;">
			<c:forEach items="${customerList}" var="cust">
				<tr>
					<td align="center">${cust.first_name}</td>
					<td align="center">${cust.last_name}</td>
					<td align="center">${cust.email}</td>
					<td align="center" style="padding: 3px;"><a
						href="addCustomer?customer_id=${cust.customer_id}"><button
								type="button"
								style="font-size: 90%; background-color: rgb(0, 191, 255); border-width: 0.5px; width: 40%;">Update</button></a>
						<span>||</span> <a
						href="deleteCustomer?customer_id=${cust.customer_id}"
						onclick="return confirm('Are you sure you want to delete?')"><button
								type="button"
								style="font-size: 90%; background-color: rgb(178, 34, 34); color: white; border-width: 0.5px; width: 40%;">Delete</button></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
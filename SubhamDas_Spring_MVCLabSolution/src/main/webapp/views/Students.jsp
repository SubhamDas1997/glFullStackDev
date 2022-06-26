<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NITK Debate Participant List</title>
</head>
<body>
<table>
	<tr>
		<td><a href="insertStudent?student_id=-1"><button type="button">Add Student</button></a></td>
	</tr>
</table>
<table border="1">
	<thead>
		<tr>
			<th>Student Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Department</th>
			<th>Country</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td align="center">${student.student_id}</td>
				<td align="center">${student.first_name}</td>
				<td align="center">${student.last_name}</td>
				<td align="center">${student.department}</td>
				<td align="center">${student.country}</td>
				<td><a href="insertStudent?student_id=${student.student_id}"><button type="button">Update</button></a>
					<a href="deleteStudent?student_id=${student.student_id}"><button type="button">Delete</button></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
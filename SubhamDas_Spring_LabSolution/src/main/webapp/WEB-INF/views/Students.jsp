<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Debate Participant List</title>
</head>
<body>
	<h1 style="background-color: lightgreen;" align="center">STUDENT
		REGISTRATION MANAGEMENT</h1>
	<table align="center">
		<tr>
			<td><a href="/student-registration/students/insert-student"><button
						type="button"
						style="font-size: 90%; background-color: rgb(255, 215, 0); border-width: 0.5px; padding: 5px">Add
						Student</button></a></td>
			<td><a href="/student-registration/logout"><button
						type="button"
						style="font-size: 85%; color: white; background-color: red; border-width: 0.5px; padding: 5.5px">LOGOUT</button></a>
			</td>
		</tr>
	</table>
	<br>
	<table border="1" align="center" style="width: 50%;">
		<thead
			style="font-size: 125%; background-color: limegreen; color: white;">
			<tr>
				<th>Student Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Course</th>
				<th>Country</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody style="font-size: 115%;">
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td align="center">${student.student_id}</td>
					<td align="center">${student.first_name}</td>
					<td align="center">${student.last_name}</td>
					<td align="center">${student.course}</td>
					<td align="center">${student.country}</td>
					<td align="center" style="padding: 3px;"><a
						href="/student-registration/students/update-student?student_id=${student.student_id}"><button
								type="button"
								style="font-size: 90%; background-color: rgb(0, 191, 255); border-width: 0.5px; width: 40%;">Update</button></a>
						<span>||</span> <a
						href="/student-registration/students/delete-student?student_id=${student.student_id}"
						onclick="return confirm('Are you sure you want to delete?')"><button
								type="button"
								style="font-size: 90%; background-color: rgb(178, 34, 34); color: white; border-width: 0.5px; width: 40%;">Delete</button></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
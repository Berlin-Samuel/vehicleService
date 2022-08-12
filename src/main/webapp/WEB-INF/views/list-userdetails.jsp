<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List User Details</title>
</head>
<body>
	<div id="table root">
		<table border='2' width='100' cellpadding='2'>
			<thead>
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>Aadhar Number</th>
					<th>Mobile Number</th>
					<th>User Email</th>
					<th>User Password</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="UserDetails" items="${alluserdetails}">
					<tr>
						<td>${UserDetails.userId}</td>
						<td>${UserDetails.userName}</td>
						<td>${UserDetails.aadharNumber}</td>
						<td>${UserDetails.mobileNumber}</td>
						<td>${UserDetails.userEmail}</td>
						<td>${UserDetails.userPassword}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
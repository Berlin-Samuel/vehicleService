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
		<table>
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
						<td>${UserDetails.user_id}</td>
						<td>${UserDetails.user_name}</td>
						<td>${UserDetails.aadhar_number}</td>
						<td>${UserDetails.mobile_number}</td>
						<td>${UserDetails.user_email}</td>
						<td>${UserDetails.user_password}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Service Centre</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Service Centre Id</th>
					<th>Centre Location</th>
					<th>Centre Phone Number</th>
					<th>Centre Email</th>
					<th>Centre Address</th>
					<th>Contact Person Name</th>
					<th>Contact Person Role</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ServiceCentre" items="${allservicecentre}">
					<tr>
						<td>${ServiceCentre.serviceCentreId}</td>
						<td>${ServiceCentre.centreLocation}</td>
						<td>${ServiceCentre.centrePhoneNumber}</td>
						<td>${ServiceCentre.centreEmail}</td>
						<td>${ServiceCentre.centreAddress}</td>
						<td>${ServiceCentre.contactPersonName}</td>
						<td>${ServiceCentre.contactPersonRole}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
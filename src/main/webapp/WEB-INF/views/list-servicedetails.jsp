<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Service Detail</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Service Detail Id</th>
					<th>Booking Id</th>
					<th>Service Charges</th>
					<th>Service Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ServiceDetails" items="${allservicedetails}">
					<tr>
						<td>${ServiceDetails.serviceDetailId}</td>
						<td>${ServiceDetails.bookingId}</td>
						<td>${ServiceDetails.serviceCharges}</td>
						<td>${ServiceDetails.serviceDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
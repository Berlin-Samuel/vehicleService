<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Book Service</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Booking Id</th>
					<th>Service Centre Id</th>
					<th>Vehicle Register Number</th>
					<th>User Id</th>
					<th>Service Date</th>
					<th>Return Date</th>
					<th>Service Estimate Amount</th>
					<th>Actual Service Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="BookService" items="${allbookservice}">
					<tr>
						<td>${BookService.booking_id}</td>
						<td>${BookService.service_centre_id}</td>
						<td>${BookService.vehicle_reg_number}</td>
						<td>${BookService.user_id}</td>
						<td>${BookService.service_date}</td>
						<td>${BookService.return_date}</td>
						<td>${BookService.service_estimate_amount}</td>
						<td>${BookService.actual_service_amount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
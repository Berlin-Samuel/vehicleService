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
		<table border='2' width='100' cellpadding='2'>
			<thead>
				<tr>
					<th>Booking Id</th>
					<th>Service Centre Id</th>
					<th>Vehicle Register Number</th>
					<th>User Id</th>
					<th>Service Date</th>
					<th>Return Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="BookService" items="${allbookservice}">
					<tr>
						<td>${BookService.bookingId}</td>
						<td>${BookService.serviceCentreId}</td>
						<td>${BookService.vehicleRegNumber}</td>
						<td>${BookService.userId}</td>
						<td>${BookService.serviceDate}</td>
						<td>${BookService.returnDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
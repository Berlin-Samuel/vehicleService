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
		<table border='2' width='1000' cellpadding='2'>
			<thead>
				<tr>
					<th>Service Type</th>
					<th>Service Charge</th>
					<th>Service Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Services" items="${allservice}">
					<tr>
						<td>${Services.serviceType}</td>
						<td>${Services.serviceCharge}</td>
						<td>${Services.serviceDescription}</td>
						<td><a href="/vehicleservicedetails/serviceDetailsAdd?id=${Services.serviceDetailId}&bookId=${bookId}"><button>Add Service</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div><a href="/vehiclepayment/addpayment?id=${bookId}"><button>payment</button></a></div>
	<div id="table root">
		<table border='2' width=1000' cellpadding='2'>
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
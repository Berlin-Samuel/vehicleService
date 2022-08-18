<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Service Detail</title>
<style type="text/css">
<%@include file="/WEB-INF/css/listservice.css"%>
</style>
</head>
<body>
	<div>
		<table>
			<caption></caption>
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
						<td><a
							href="/vehicleservicedetails/serviceDetailsAdd?id=${Services.serviceDetailId}&bookId=${bookId}">
							<button class="button" type="submit" name="submit">Add Service</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<table>
			<caption></caption>
			<thead>
				<tr>
					<th>Service Charges</th>
					<th>Service Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ServiceDetails" items="${allservicedetails}">
					<tr>
						<td>${ServiceDetails.serviceCharges}</td>
						<td>${ServiceDetails.serviceDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/vehiclepayment/addpayment?id=${bookId}">
		<button class="button" type="submit" name="submit">Payment</button></a>
	</div>
</body>
</html>
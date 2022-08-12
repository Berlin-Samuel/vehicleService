<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Payment</title>
</head>
<body>
	<div id="table root">
		<table border='2' width='100' cellpadding='2'>
			<thead>
				<tr>
					<th>Bill Number</th>
					<th>Booking Id</th>
					<th>Bill Amount</th>
					<th>Bill Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Payment" items="${allpayment}">
					<tr>
						<td>${Payment.billNumber}</td>
						<td>${Payment.bookingId}</td>
						<td>${Payment.billAmount}</td>
						<td>${Payment.billDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
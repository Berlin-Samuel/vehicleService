<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Payment</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getpayment">
				<div>
					<label for="billNumber">Bill Number</label>
					<div>
						<form:input path="billNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="billAmount">Bill Amount</label>
					<div>
						<form:input path="billAmount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate" readonly="true"/>
					</div>
				</div>
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
					<th>Service Estimate Amount</th>
					<th>Actual Service Amount</th>
				</tr>
			</thead>
			<tbody>

					<tr>
						<td>${bookservicelist.bookingId}</td>
						<td>${bookservicelist.serviceCentreId}</td>
						<td>${bookservicelist.vehicleRegNumber}</td>
						<td>${bookservicelist.userId}</td>
						<td>${bookservicelist.serviceDate}</td>
						<td>${bookservicelist.returnDate}</td>
					</tr>
			</tbody>
		</table>
	</div>
			</form:form>
		</div>
	</div>
</body>
</html>
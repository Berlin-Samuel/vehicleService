<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Type and Book Service</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getvehicletype">
				<div>
					<label for="vehicleRegNumber">Vehicle Register Number</label>
					<div>
						<form:input path="vehicleRegNumber" readonly="true" />
					</div>
				</div>
				<div>
					<label for="vehicleType">Vehicle Type</label>
					<div>
						<form:input path="vehicleType" readonly="true" />
					</div>
				</div>
				<div>
					<label for="vehicleColor">Vehicle Color</label>
					<div>
						<form:input path="vehicleColor" readonly="true" />
					</div>
				</div>
				<div>
					<label for="vehicleModel">Vehicle Model</label>
					<div>
						<form:input path="vehicleModel" readonly="true" />
					</div>
				</div>
				<div>
					<label for="vehicleDatePurchase">Vehicle Date Purchase</label>
					<div>
						<form:input path="vehicleDatePurchase" readonly="true" />
					</div>
				</div>
				<div>
					<label for="vehicleFcDate">Vehicle Fc Date</label>
					<div>
						<form:input path="vehicleFcDate" readonly="true" />
					</div>
				</div>
				<div>
					<label for="insuranceFrom">Insurance From</label>
					<div>
						<form:input path="insuranceFrom" readonly="true" />
					</div>
				</div>
				<div>
					<label for="insuranceTo">Insurance To</label>
					<div>
						<form:input path="insuranceTo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="insuranceCompanyName">Insurance Company Name</label>
					<div>
						<form:input path="insuranceCompanyName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
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
				<c:forEach var="BookService" items="${bookservicedetails}">
					<tr>
						<td>${BookService.bookingId}</td>
						<td>${BookService.serviceCentreId}</td>
						<td>${BookService.vehicleRegNumber}</td>
						<td>${BookService.userId}</td>
						<td>${BookService.serviceDate}</td>
						<td>${BookService.returnDate}</td>
						<td>${BookService.serviceEstimateAmount}</td>
						<td>${BookService.actualServiceAmount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Book Service</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="bookservice">
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="serviceCentreId">Service Centre Id</label>
					<div>
						<form:input path="serviceCentreId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="vehicleRegNumber">Vehicle Register Number</label>
					<div>
						<form:input path="vehicleRegNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="serviceDate">Service Date</label>
					<div>
						<form:input path="serviceDate" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="returnDate">Return Date</label>
					<div>
						<form:input path="returnDate" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
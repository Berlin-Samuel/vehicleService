<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Book Service</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="bookservice">
				<div>
					<label for="booking_id">Booking Id</label>
					<div>
						<form:input path="booking_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="service_centre_id">Service Centre Id</label>
					<div>
						<form:input path="service_centre_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="vehicle_reg_number">Vehicle Register Number</label>
					<div>
						<form:input path="vehicle_reg_number" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="user_id">User Id</label>
					<div>
						<form:input path="user_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="service_date">Service Date</label>
					<div>
						<form:input path="service_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="return_date">Return Date</label>
					<div>
						<form:input path="return_date" readonly="true" />
					</div>
				</div>
				<div>
					<label for="service_estimate_amount">Service Estimate Amount</label>
					<div>
						<form:input path="service_estimate_amount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="actual_service_amount">Actual Service Amount</label>
					<div>
						<form:input path="actual_service_amount" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
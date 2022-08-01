<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book Service</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updateservice" method="post" modelAttribute="updatebookservice">
				<div>
					<label for="booking_id">Booking Id</label>
					<div>
						<form:input path="booking_id" />
					</div>
				</div>
				<div>
					<label for="service_centre_id">Service Centre Id</label>
					<div>
						<form:input path="service_centre_id" />
					</div>
				</div>
				<div>
					<label for="vehicle_reg_number">Vehicle Register Number</label>
					<div>
						<form:input path="vehicle_reg_number" />
					</div>
				</div>
				<div>
					<label for="user_id">User Id</label>
					<div>
						<form:input path="user_id" />
					</div>
				</div>
				<div>
					<label for="service_date">Service Date</label>
					<div>
						<form:input path="service_date" />
					</div>
				</div>
				<div>
					<label for="return_date">Return Date</label>
					<div>
						<form:input path="return_date" />
					</div>
				</div>
				<div>
					<label for="service_estimate_amount">Service Estimate Amount</label>
					<div>
						<form:input path="service_estimate_amount" />
					</div>
				</div>
				<div>
					<label for="actual_service_amount">Actual Service Amount</label>
					<div>
						<form:input path="actual_service_amount" />
					</div>
				</div>
				<div>
					<form:button>Update Book Service</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
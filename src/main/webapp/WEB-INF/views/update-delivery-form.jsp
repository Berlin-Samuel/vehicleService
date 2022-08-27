<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Delivery</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form method="post" modelAttribute="updatedelivery">
				<div> 
					<label for="id">Delivery Id </label>
				</div>
				<div>
					<form:input path="id" />
				</div>
				<div>
					<label for="deliveryDate">Delivery Date </label>
				</div>
				<div>
					<form:input path="deliveryDate" />
				</div>
				<div>
					<label for="bookingId">Booking Id </label>
				</div>
				<div>
					<form:input path="bookingId" />
				</div>
				<div>
					<label for="deliveryTime">Delivery Time </label>
				</div>
				<div>
					<form:input path="deliveryTime" />
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
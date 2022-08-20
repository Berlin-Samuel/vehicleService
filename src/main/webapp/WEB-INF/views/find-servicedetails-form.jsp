<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find ServiceDetails</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="servicedetails">
				<div>
					<label for="serviceDetailId">Service Detail Id</label>
					<div>
						<form:input path="serviceDetailId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="serviceCharges">Service Charges</label>
					<div>
						<form:input path="serviceCharges"  readonly="true"/>
					</div>
				</div>
				<div>
					<label for="serviceDate">Service Date</label>
					<div>
						<form:input path="serviceDate" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
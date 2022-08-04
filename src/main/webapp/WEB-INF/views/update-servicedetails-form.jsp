<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update ServiceDetails</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updateservicedetails" method="post" modelAttribute="updateservicedetail">
				<div>
					<label for="serviceDetailId">Service Detail Id</label>
					<div>
						<form:input path="serviceDetailId" />
					</div>
				</div>
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" />
					</div>
				</div>
				<div>
					<label for="serviceCharges">Service Charges</label>
					<div>
						<form:input path="serviceCharges" />
					</div>
				</div>
				<div>
					<label for="serviceDate">Service Date</label>
					<div>
						<form:input path="serviceDate" />
					</div>
				</div>
				<div>
					<form:button>Update ServiceDetails</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
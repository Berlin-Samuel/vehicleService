<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add ServiceDetails</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="addservicedetail" method="post" modelAttribute="addservicedetails">
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
					<form:button>Add ServiceDetails</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
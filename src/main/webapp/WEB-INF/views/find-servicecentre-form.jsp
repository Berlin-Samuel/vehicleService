<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Service Centre</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form method="get" modelAttribute="servicecentre">
				<div>
					<label for="serviceCentreId">Service Centre Id</label>
					<div>
						<form:input path="serviceCentreId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="centreLocation">Centre Location</label>
					<div>
						<form:input path="centreLocation" readonly="true" />
					</div>
				</div>
				<div>
					<label for="centrePhoneNumber">Centre Phone Number</label>
					<div>
						<form:input path="centrePhoneNumber" readonly="true" />
					</div>
				</div>
				<div>
					<label for="centreEmail">Centre Email</label>
					<div>
						<form:input path="centreEmail" readonly="true" />
					</div>
				</div>
				<div>
					<label for="centreAddress">Centre Address</label>
					<div>
						<form:input path="centreAddress" readonly="true" />
					</div>
				</div>
				<div>
					<label for="contactPersonName">Contact Person Name</label>
					<div>
						<form:input path="contactPersonName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="contactPersonRole">Contact Person Role</label>
					<div>
						<form:input path="contactPersonRole" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
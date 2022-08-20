<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Vehicle Type</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updatevehicle" method="post" modelAttribute="updatevehicletype">
				<div>
					<label for="vehicleRegNumber">Vehicle Register Number</label>
					<div>
						<form:input path="vehicleRegNumber" />
					</div>
				</div>
				<div>
					<label for="vehicleType">Vehicle Type</label>
					<div>
						<form:input path="vehicleType" />
					</div>
				</div>
				<div>
					<label for="vehicleColor">Vehicle Color</label>
					<div>
						<form:input path="vehicleColor" />
					</div>
				</div>
				<div>
					<label for="vehicleModel">Vehicle Model</label>
					<div>
						<form:input path="vehicleModel" />
					</div>
				</div>
				<div>
					<label for="vehicleDatePurchase">Vehicle Date Purchase</label>
					<div>
						<form:input path="vehicleDatePurchase" />
					</div>
				</div>
				<div>
					<label for="vehicleFcDate">Vehicle Fc Date</label>
					<div>
						<form:input path="vehicleFcDate" />
					</div>
				</div>
				<div>
					<label for="insuranceFrom">Insurance From</label>
					<div>
						<form:input path="insuranceFrom" />
					</div>
				</div>
				<div>
					<label for="insuranceTo">Insurance To</label>
					<div>
						<form:input path="insuranceTo" />
					</div>
				</div><div>
					<label for="insuranceCompanyName">Insurance Company Name</label>
					<div>
						<form:input path="insuranceCompanyName" />
					</div>
				</div>
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				
				<div>
					<form:button>Update Vehicle Type</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
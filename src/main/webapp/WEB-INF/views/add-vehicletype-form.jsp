<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Vehicle Type</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="addvehicle" method="post" modelAttribute="addvehicletype">
				<div>
					<label for="vehicle_reg_number">Vehicle Register Number</label>
					<div>
						<form:input path="vehicle_reg_number" />
					</div>
				</div>
				<div>
					<label for="vehicle_type">Vehicle Type</label>
					<div>
						<form:input path="vehicle_type" />
					</div>
				</div>
				<div>
					<label for="vehicle_color">Vehicle Color</label>
					<div>
						<form:input path="vehicle_color" />
					</div>
				</div>
				<div>
					<label for="vehicle_model">Vehicle Model</label>
					<div>
						<form:input path="vehicle_model" />
					</div>
				</div>
				<div>
					<label for="vehicle_date_purchase">Vehicle Date Purchase</label>
					<div>
						<form:input path="vehicle_date_purchase" />
					</div>
				</div>
				<div>
					<label for="vehicle_fc_date">Vehicle Fc Date</label>
					<div>
						<form:input path="vehicle_fc_date" />
					</div>
				</div>
				<div>
					<label for="insurance_from">Insurance From</label>
					<div>
						<form:input path="insurance_from" />
					</div>
				</div>
				<div>
					<label for="insurance_to">Insurance To</label>
					<div>
						<form:input path="insurance_to" />
					</div>
				</div><div>
					<label for="insurance_company_name">Insurance Company Name</label>
					<div>
						<form:input path="insurance_company_name" />
					</div>
				</div>
				<div>
					<label for="user_id">User Id</label>
					<div>
						<form:input path="user_id" />
					</div>
				</div>
				
				<div>
					<form:button>Add Vehicle Type</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
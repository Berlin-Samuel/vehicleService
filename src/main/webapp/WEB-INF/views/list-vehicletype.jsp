<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Vehicle Type</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Vehicle Register Number</th>
					<th>Vehicle Type</th>
					<th>Vehicle Color</th>
					<th>Vehicle Model</th>
					<th>Vehicle Date Purchase</th>
					<th>Vehicle Fc Date</th>
					<th>Insurance From</th>
					<th>Insurance To</th>
					<th>Insurance Company Name</th>
					<th>User Id</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="VehicleType" items="${allvehicletype}">
					<tr>
						<td>${VehicleType.vehicle_reg_number}</td>
						<td>${VehicleType.vehicle_type}</td>
						<td>${VehicleType.vehicle_color}</td>
						<td>${VehicleType.vehicle_model}</td>
						<td>${VehicleType.vehicle_date_purchase}</td>
						<td>${VehicleType.vehicle_fc_date}</td>
						<td>${VehicleType.insurance_from}</td>
						<td>${VehicleType.insurance_to}</td>
						<td>${VehicleType.insurance_company_name}</td>
						<td>${VehicleType.user_id}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
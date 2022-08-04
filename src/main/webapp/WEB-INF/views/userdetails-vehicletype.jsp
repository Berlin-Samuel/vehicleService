<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails and VehicleType</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post"
				modelAttribute="getuserdetails">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="aadharNumber">Aadhar Number</label>
					<div>
						<form:input path="aadharNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="mobileNumber">Mobile Number</label>
					<div>
						<form:input path="mobileNumber" readonly="true" />
					</div>
				</div>
				<div>
					<label for="userEmail">User Email</label>
					<div>
						<form:input path="userEmail" readonly="true" />
					</div>
				</div>
				<div>
					<label for="userPassword">User Password</label>
					<div>
						<form:input path="userPassword" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
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
				<c:forEach var="VehicleType" items="${vehicletypedetails}">
					<tr>
						<td>${VehicleType.vehicleRegNumber}</td>
						<td>${VehicleType.vehicleType}</td>
						<td>${VehicleType.vehicleColor}</td>
						<td>${VehicleType.vehicleModel}</td>
						<td>${VehicleType.vehicleDatePurchase}</td>
						<td>${VehicleType.vehicleFcDate}</td>
						<td>${VehicleType.insuranceFrom}</td>
						<td>${VehicleType.insuranceTo}</td>
						<td>${VehicleType.insuranceCompanyName}</td>
						<td>${VehicleType.userId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>
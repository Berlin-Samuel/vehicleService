<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails and BookService</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post"
				modelAttribute="getuserdetail">
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
		<table border='2' width='100' cellpadding='2'>
			<thead>
				<tr>
					<th>Booking Id</th>
					<th>Service Centre Id</th>
					<th>Vehicle Register Number</th>
					<th>User Id</th>
					<th>Service Date</th>
					<th>Return Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="BookService" items="${bookservicedetails}">
					<tr>
						<td>${BookService.bookingId}</td>
						<td>${BookService.serviceCentreId}</td>
						<td>${BookService.vehicleRegNumber}</td>
						<td>${BookService.userId}</td>
						<td>${BookService.serviceDate}</td>
						<td>${BookService.returnDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
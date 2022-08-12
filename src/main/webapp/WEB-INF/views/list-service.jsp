<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Service</title>
</head>
<body>
	<div id="table root">
		<table border='2' width='100' cellpadding='2'>
			<thead>
				<tr>
					<th>Service Detail Id</th>
					<th>Service Type</th>
					<th>Service Charge</th>
					<th>Service Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Services" items="${allservice}">
					<tr>
						<td>${Services.serviceDetailId}</td>
						<td>${Services.serviceType}</td>
						<td>${Services.serviceCharge}</td>
						<td>${Services.serviceDescription}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
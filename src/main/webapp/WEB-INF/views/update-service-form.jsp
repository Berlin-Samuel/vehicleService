<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Service</title>
<style><%@include file="/WEB-INF/css/service.css"%></style>
</head>
<body>
	<div id="root">
		<div id="form">
			<h1>Update Your Service</h1>
			<form:form action="updateservices" method="post"
				modelAttribute="updateservice" name="form">
				<div>
					<label for="serviceDetailId"></label>
					<form:input path="serviceDetailId" type="hidden" />
				</div>
				<div class="form-control">
					<label for="serviceType">Service Type</label>
					<form:input path="serviceType" placeholder="Enter the Service Type"
						required="true" />
				</div>
				<div class="form-control">
					<label for="serviceCharge">Service Charge</label>
					<form:input path="serviceCharge"
						placeholder="Enter the Service Amount" required="true" />
				</div>
				<div class="form-control">
					<label for="serviceDescription">Service Description</label>
					<form:input path="serviceDescription"
						placeholder="Enter the Service Description" required="true" />
				</div>
				<div class="form-control">
					<form:button class="button">Update Service</form:button>
				</div>
			</form:form>
			<button class="back" onclick="history.back()">Back</button>
		</div>
	</div>
</body>
</html>
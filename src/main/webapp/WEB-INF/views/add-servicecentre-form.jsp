<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Service Centre</title>
<style><%@include file="/WEB-INF/css/form.css"%></style>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="addcentre" method="post" modelAttribute="addservicecentre" class="container" name="form">
				<div class="form-control">
					<label for="centreLocation">Centre Location</label>
						<form:input path="centreLocation" placeholder="Enter the Centre Location" required="true" />
				</div>
				<div class="form-control">
					<label for="centrePhoneNumber">Centre Phone Number</label>
						<form:input path="centrePhoneNumber" placeholder="Enter the Centre Phone Number" required="true" />
				</div> 
				<div class="form-control">
					<label for="centreEmail">Centre Email</label>
						<form:input path="centreEmail" placeholder="Enter the Centre Email" required="true" />
				</div>
				<div class="form-control">
					<label for="centreAddress">Centre Address</label>
						<form:input path="centreAddress" placeholder="Enter the Centre Address" required="true"/>
				</div>
				<div class="form-control">
					<label for="contactPersonName">Contact Person Name</label>
						<form:input path="contactPersonName" placeholder="Enter the Contact Person Name" required="true"/>
				</div>
				<div class="form-control">
					<label for="contactPersonRole">Contact Person Role</label>
						<form:input path="contactPersonRole" placeholder="Enter the Contact Person Role" required="true"/>
				</div>
				<br>
				<div>
					<form:button class="button">Add Service Centre</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
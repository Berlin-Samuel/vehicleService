<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add User Details</title>
<style type="text/css">
<%@ include file="/WEB-INF/css/forms.css"%>
</style>
<script type="text/javascript">
<%@include file="/WEB-INF/js/userdetails.js"%>
</script>
</head>
<body>
	<div class="form-userdetails">
		<h1>Create a New Account</h1>
		<form:form action="adduser" method="post"
			modelAttribute="adduserdetails" name="form">
			<div class="form-control-userdetails">
				<label for="userName">Name</label>
				<form:input path="userName" name="userName"
					placeholder="Enter Your Full Name" required="true"
					onblur="userNameCheck();" />
			</div>
			<form:errors path="userName" cssClass="text-danger" />
			<div class="form-control-userdetails">
				<label for="aadharNumber">Aadhar Number</label>
				<form:input path="aadharNumber"
					placeholder="Enter Your Aadhar Number" required="true"
					onblur="aadharNumberCheck();" />
			</div>
			<form:errors path="aadharNumber" cssClass="text-danger" />
			<div class="form-control-userdetails">
				<label for="mobileNumber">Mobile Number</label>
				<form:input path="mobileNumber"
					placeholder="Enter Your Mobile Number" required="true"
					onblur="mobileNumberCheck();" />
			</div>
			<form:errors path="mobileNumber" cssClass="text-danger" />
			<div class="form-control-userdetails">
				<label for="userEmail">Email</label>
				<form:input path="userEmail" placeholder="Enter Your Email"
					required="true" onblur="userEmailCheck();" />
			</div>
			<form:errors path="userEmail" cssClass="text-danger" />
			<div class="form-control-userdetails">
				<label for="userPassword">Password</label>
				<form:input path="userPassword" placeholder="Enter Your Password"
					required="true" onblur="userPasswordCheck();" />
			</div>
			<form:errors path="userPassword" cssClass="text-danger" />
			<div>
				<form:button class="button" type="submit" name="submit">Sign Up</form:button>
			</div>
		</form:form>
	</div>
	<br>
	<div>
	<button class="back" title="back"  onclick="history.back()">Back</button>
	</div>
</body>
</html>
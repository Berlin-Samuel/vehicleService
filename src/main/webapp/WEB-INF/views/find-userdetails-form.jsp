<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find User Details</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form method="get" modelAttribute="userdetails">
				<div>
					<label for="user_id">User Id</label>
					<div>
						<form:input path="user_id" readonly="true" />
					</div>
				</div>
				<div>
					<label for="user_name">User Name</label>
					<div>
						<form:input path="user_name" readonly="true" />
					</div>
				</div>
				<div>
					<label for="aadhar_number">Aadhar Number</label>
					<div>
						<form:input path="aadhar_number" readonly="true" />
					</div>
				</div>
				<div>
					<label for="mobile_number">Mobile Number</label>
					<div>
						<form:input path="mobile_number" readonly="true" />
					</div>
				</div>
				<div>
					<label for="user_email">User Email</label>
					<div>
						<form:input path="user_email" readonly="true" />
					</div>
				</div>
				<div>
					<label for="user_password">User Password</label>
					<div>
						<form:input path="user_password" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
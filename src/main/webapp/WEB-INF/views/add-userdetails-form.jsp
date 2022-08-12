<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User Details</title>
<style type="text/css">
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form" align="center">
			<h1>Create a new account</h1>
			<form:form action="adduser" method="post"
				modelAttribute="adduserdetails">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<form:errors path="userId" cssClass="text-danger" />
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" />
					</div>

				</div>
				<form:errors path="userName" cssClass="text-danger" />

				<div>
					<label for="aadharNumber">Aadhar Number</label>
					<div>
						<form:input path="aadharNumber" />
					</div>
				</div>
				<form:errors path="aadharNumber" cssClass="text-danger" />

				<div>
					<label for="mobileNumber">Mobile Number</label>
					<div>
						<form:input path="mobileNumber" />
					</div>
				</div>
				<form:errors path="mobileNumber" cssClass="text-danger" />

				<div>
					<label for="userEmail">User Email</label>
					<div>
						<form:input path="userEmail" />
					</div>
				</div>
				<form:errors path="userEmail" cssClass="text-danger" />

				<div>
					<label for="userPassword">User Password</label>
					<div>
						<form:input path="userPassword" />
					</div>
				</div>
				<form:errors path="userPassword" cssClass="text-danger" />
				<div>
					<form:button>Sign Up</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
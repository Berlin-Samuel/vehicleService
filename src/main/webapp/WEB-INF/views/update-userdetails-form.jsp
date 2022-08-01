<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Details</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updateuser" method="post" modelAttribute="updateuserdetails">
				<div>
					<label for="user_id">User Id</label>
					<div>
						<form:input path="user_id" />
					</div>
				</div>
				<div>
					<label for="user_name">User Name</label>
					<div>
						<form:input path="user_name" />
					</div>
				</div>
				<div>
					<label for="aadhar_number">Aadhar Number</label>
					<div>
						<form:input path="aadhar_number" />
					</div>
				</div>
				<div>
					<label for="mobile_number">Mobile Number</label>
					<div>
						<form:input path="mobile_number" />
					</div>
				</div>
				<div>
					<label for="user_email">User Email</label>
					<div>
						<form:input path="user_email" />
					</div>
				</div>
				<div>
					<label for="user_password">User Password</label>
					<div>
						<form:input path="user_password" />
					</div>
				</div>
				<div>
					<form:button>Update User</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
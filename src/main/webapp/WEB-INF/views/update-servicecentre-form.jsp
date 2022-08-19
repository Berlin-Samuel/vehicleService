<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Service Centre</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updatecentre" method="post" modelAttribute="updateservicecentre">
				<div>
					<label for="centreLocation">Centre Location</label>
					<div>
						<form:input path="centreLocation" />
					</div>
				</div>
				<div>
					<label for="centrePhoneNumber">Centre Phone Number</label>
					<div>
						<form:input path="centrePhoneNumber" />
					</div>
				</div>
				<div>
					<label for="centreEmail">Centre Email</label>
					<div>
						<form:input path="centreEmail" />
					</div>
				</div>
				<div>
					<label for="centreAddress">Centre Address</label>
					<div>
						<form:input path="centreAddress" />
					</div>
				</div>
				<div>
					<label for="contactPersonName">Contact Person Name</label>
					<div>
						<form:input path="contactPersonName" />
					</div>
				</div>
				<div>
					<label for="contactPersonRole">Contact Person Role</label>
					<div>
						<form:input path="contactPersonRole" />
					</div>
				</div>
				<div>
					<form:button>Update Service Centre</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
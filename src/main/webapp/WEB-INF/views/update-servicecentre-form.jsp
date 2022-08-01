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
					<label for="service_centre_id">Service Centre Id</label>
					<div>
						<form:input path="service_centre_id" />
					</div>
				</div>
				<div>
					<label for="centre_location">Centre Location</label>
					<div>
						<form:input path="centre_location" />
					</div>
				</div>
				<div>
					<label for="centre_phone_number">Centre Phone Number</label>
					<div>
						<form:input path="centre_phone_number" />
					</div>
				</div>
				<div>
					<label for="centre_email">Centre Email</label>
					<div>
						<form:input path="centre_email" />
					</div>
				</div>
				<div>
					<label for="centre_address">Centre Address</label>
					<div>
						<form:input path="centre_address" />
					</div>
				</div>
				<div>
					<label for="contact_person_name">Contact Person Name</label>
					<div>
						<form:input path="contact_person_name" />
					</div>
				</div>
				<div>
					<label for="contact_person_role">Contact Person Role</label>
					<div>
						<form:input path="contact_person_role" />
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
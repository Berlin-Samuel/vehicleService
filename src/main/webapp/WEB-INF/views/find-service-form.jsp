<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>View Service</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="vehicleservice">
				<div>
					<label for="serviceType">Service Type</label>
					<div>
						<form:input path="serviceType" readonly="true" />
					</div>
				</div>
				<div>
					<label for="serviceCharge">Service Charge</label>
					<div>
						<form:input path="serviceCharge" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="serviceDescription">Service Description</label>
					<div>
						<form:input path="serviceDescription" readonly="true"/>
					</div>
				</div>				
			</form:form>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Payment</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="addpayment">
				<div>
					<label for="billNumber">Bill Number</label>
					<div>
						<form:input path="billNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="billAmount">Bill Amount</label>
					<div>
						<form:input path="billAmount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
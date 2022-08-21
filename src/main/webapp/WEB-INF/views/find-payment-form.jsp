<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Payment</title>
<style type="text/css">
<%@include file="/WEB-INF/css/payment.css"%>
</style>
</head>
<body>
		<div class="form-payment">
		<h1>Your Service Bill</h1>
			<form:form action="" method="post" modelAttribute="addpayment">
				<div class="form-control-payment">
					<label for="billNumber">Bill Number</label>
						<form:input path="billNumber" readonly="true"/>
				</div>
				<%-- <div class="form-control-payment">
					<label for="bookingId">Booking Id</label>
						<form:input path="bookingId" readonly="true"/>
					</div> --%>
				<div class="form-control-payment">
					<label for="billAmount">Bill Amount</label>
						<form:input path="billAmount" readonly="true"/>
				</div>
				<div class="form-control-payment">
					<label for="billDate">Bill Date</label>
						<form:input path="billDate" readonly="true"/>
					</div>
			</form:form>
			<a href="/home/home"><Button>Logout</Button></a>
		</div>
</body>
</html>
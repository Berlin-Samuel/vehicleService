<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="addpayments" method="post" modelAttribute="addpayment">
				<div>
					<label for="billNumber">Bill Number</label>
					<div>
						<form:input path="billNumber" />
					</div>
				</div>
				<div>
					<label for="bookingId">Booking Id</label>
					<div>
						<form:input path="bookingId" />
					</div>
				</div>
				<div>
					<label for="billAmount">Bill Amount</label>
					<div>
						<form:input path="billAmount" />
					</div>
				</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate"  type="date" />
					</div>
				</div>
				<div>
					<form:button>Add Payment</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
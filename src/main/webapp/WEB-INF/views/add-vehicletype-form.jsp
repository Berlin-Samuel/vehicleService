<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Vehicle Type</title>
<style type="text/css">
<%@include file="/WEB-INF/css/addvehicle.css"%>
</style>
</head>
<body>
	<div class="form-vehicletype">
		<h1>Add Your Vehicle For Service</h1>
		<form:form action="addvehicle" method="post"
			modelAttribute="addvehicletype">
			<div class="form-control-vehicletype">
				<label for="vehicleRegNumber">Vehicle Register Number</label>
				<form:input path="vehicleRegNumber" name="vehicleRegNumber"
					placeholder="Enter Your Vehicle Register Number" required="true"
					pattern="^[A-Z]{2}\s[0-9]{2}\s[A-Z]{1,2}\s[0-9]{4}$"
					title="Register Number can't be empty" />
			</div>
			<div class="form-control-vehicletype">
				<label for="vehicleType">Vehicle Type</label>
				<form:input path="vehicleType" name="vehicleRegNumber"
					placeholder="Enter Your Vehicle Type" required="true"
					onblur="vehicleTypeCheck();" />
			</div>
			<div class="form-control-vehicletype">
				<label for="vehicleColor">Vehicle Color</label>
				<form:input path="vehicleColor" name="vehicleColor"
					placeholder="Enter Your Vehicle Color" required="true"
					onblur="vehicleColorCheck();" />
			</div>
			<div class="form-control-vehicletype">
				<label for="vehicleModel">Vehicle Model</label>
				<form:input path="vehicleModel" name="vehicleModel"
					placeholder="Enter Your Vehicle Model" required="true"
					onblur="vehicleModelCheck();" />
			</div>
			<div class="form-control-vehicletype">
				<label for="vehicleDatePurchase">Vehicle Date Purchase</label>
				<form:input path="vehicleDatePurchase" type="date"
					name="vehicleDatePurchase"
			placeholder="Enter Your Vehicle Date of Purchase" required="true" onblur="vehicleDatePurchaseCheck();"/>
			</div>
			<div class="form-control-vehicletype">
				<label for="insuranceTo">Insurance Valid To</label>
				<form:input path="insuranceTo" type="date" />
			</div>
			<div class="form-control-vehicletype">
				<label for="userId"></label>
				<form:input path="userId" type="hidden" />
			</div>
			<div>
				<form:button class="button" type="submit" name="submit">Add Vehicle</form:button>
			</div>
		</form:form>
	</div>
	<script type="text/javascript">
		var vehicleTypeCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleType.value.match(nameRegex)) {
				if (alert("Vehicle Type can't be empty and must contain only alphabets")) {
					document.form.vehicleType.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		var vehicleColorCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleColor.value.match(nameRegex)) {
				if (alert("Vehicle Color can't be empty and must contain only alphabets")) {
					document.form.vehicleColor.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		var vehicleModelCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleModel.value.match(nameRegex)) {
				if (alert("Vehicle Model can't be empty and must contain only alphabets")) {
					document.form.vehicleModel.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		function vehicleDatePurchaseCheck() {
		    let vehicleDatePurchase = document.getElementById('vehicleDatePurchase').value;
		    let now = new Date();
		    let dt1 = Date.parse(now),
		        dt2 = Date.parse(vehicleDatePurchase);
		    if (dt2 > dt1) {
		        alert("Date must be in the past or present");
		    }
		}
	</script>
</body>
</html>
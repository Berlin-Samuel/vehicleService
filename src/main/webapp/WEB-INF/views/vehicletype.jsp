<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Your Vehicle and Add BooK Service</title>
<script src='https://kit.fontawesome.com/a076d05399.js'>
</script>
<style>
<%@ include file="/WEB-INF/css/vehicletype-bookservice.css"%>
</style>
</head>
<body>
<a href="/vehicleuserdetails/userlogin"><button class="back-button">Go
			Back</button></a>
	<div class="form">
		<form:form action="index" method="post">
            <h1>Add Vehicle and Add BooK Service</h1>
			  <div class="layout">
				<div class="addvehicle">
					<div class='fas fa-car' style='font-size: 115px; color: red'></div>
					<h2>
						  <a href="/vehicletype/addvehicletype?userId=${userId}"
							style="text-decoration: none">Add New Vehicle</a>                
					</h2>
				</div>
				<div class="bookvehicle">
					<div class='fas fa-clipboard-list'
						style='font-size: 115px; color: red'></div>
					<h2>
						<a href="/vehiclebookservice/addbookservice?userId=${userId}"
							style="text-decoration: none">Add Book Service</a>
					</h2>
				</div>
			</div>
        </form:form>
	</div>
</body>
</html>


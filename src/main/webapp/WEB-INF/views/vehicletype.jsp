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
body {
	background-image:
		url("https://png.pngtree.com/png-clipart/20210312/original/pngtree-car-beauty-repair-service-png-image_6064174.jpg");
	background-width: 1366px;
	background-height: 768px;
	background-attachment: fixed;
	background-size: cover;
}

.form {
	text-align: center;
}

h1 {
	font-family: "Audiowide", sans-serif;
	font-color: white;
	font-style: oblique;
	font-variant: small-caps;
	font-size: 35px;
	font-style: oblique;
}

h2 {
	font-family: "Audiowide", sans-serif;
	font-color: white;
	font-style: oblique;
	font-variant: small-caps;
	font-size: 35px;
	font-style: oblique;
}

.form .layout {
	margin-left: 34%;
	width: 360px;
	height: 390px;
	padding: 50px;
	border: 6px solid black;
	background-attachment: fixed;
	
}

a {
	color: black;
}
</style>
</head>
<body>
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


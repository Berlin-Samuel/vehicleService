<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title> Login</title>
<style>
body {
	background-image:
		url(https://images.pexels.com/photos/162553/keys-workshop-mechanic-tools-162553.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1);
	background-repeat: no-repeat;
	background-size: 1366px 768px;
	text-align: center;
}

h1 {
	font-family: lucida Handwriting, Cursive;
	color: red;
}

label {
	font-family: Copperplate, Papyrus, fantasy;
	font-size: 20px;
	color: red;
}

.form #input {
	border-radius: 10px;
}

.login-form {
	width: 75px;
	height: 30px;
	font-size: 17px;
	background-color: red;
	border: 1px solid blue;
	border-radius: 20px;
	color: white;
}
</style>
</head>
<body>
	<div id="root" style="width: auto;">
		<div class="form">	
			<form:form action="checkuserlogin" method="post"
				modelAttribute="user">
				<h1>User Login</h1>
				<div style="margin: 14px 0px 14px 0px;">
					<strong><label for="email" style="font-size: 35px;">Email
							:</label></strong>
					<form:input path="userEmail" id="input"
						placeholder="Enter Your Email"
						style="width: 20%;height: 25px;font-size: 17px;" />
				</div>
				<div style="margin: 14px 0px 14px 0px;">
					<strong> <label class="pa" for="password"
						style="font-size: 35px;">Password :</label> <form:input
							path="userPassword" type="password" id="input"
							placeholder="Enter Your Password"
							style="width: 20%;height: 25px;font-size: 17px;" />
					</strong>
				</div>
				<div style="margin-top: 20px; margin-left: 30px;">
					<form:button class="login-form">Sign in</form:button>
					<form:button class="login-form" style="margin-left: 12px;">
						<a href="/vehicleuserdetails/adduserdetails"
							style="text-decoration: none; color: white;">Sign up</a>
					</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
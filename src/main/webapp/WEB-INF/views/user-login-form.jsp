<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
<%@ include file="/WEB-INF/css/user-login.css"%>
</style>
</head>
<body>
	<a href="/home/home"><button class="back-button">Go
			Back</button></a>
	<div id="root" style="width: auto;">
		<div class="form">
			<form:form action="checkuserlogin" method="post"
				modelAttribute="user">
				<h1>User Login</h1>
				<div class="useremail">
					<strong><label for="email">Email :</label></strong>
					<form:input path="userEmail" id="input"
						placeholder="Enter Your Email" />
				</div>
				<div class="userpass">
					<strong> <label class="pa" for="password">Password
							:</label> </strong> <form:input path="userPassword" type="password" id="input"
							placeholder="Enter Your Password" />
				</div>
				<div>
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
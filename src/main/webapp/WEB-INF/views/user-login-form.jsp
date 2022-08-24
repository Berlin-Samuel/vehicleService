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
			
		<div class="form">
			<form:form action="checkuserlogin" method="post"
				modelAttribute="user"  class="container" name="form">
				
				<h1>User Login</h1>
				
					<label for="email">Email :</label>
					<form:input path="userEmail" id="input"
						placeholder="Enter Your Email" required="true" />
						
					<label class="pa" for="password">Password
							:</label> <form:input path="userPassword" type="password" id="input"
							placeholder="Enter Your Password" required="true" />
				
					<form:button class="button">Sign in</form:button>
					<form:button class="button">
						<a href="/vehicleuserdetails/adduserdetails">Sign up</a>
					</form:button>
			</form:form>
		</div>
</body>
</html>
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
<%@include file="/WEB-INF/css/admin-login-form.css"%></s
</style>
</head>
<body>
<a href="/home/home"><button class="back-button">Go
			Back</button></a>
	<div id="root" style="width: auto;">
		<div class="form">
			<form:form action="checkadminlogin" method="post"
				modelAttribute="admin">
				<h1>****Hello Admin****</h1>
				<div class="adminemail">
					<strong><label for="adminEmail">Email :</label></strong>
					<form:input path="adminEmail" id="input"
						placeholder="Enter Your Email" />
				</div>
				<div class="adminpass">
					<strong> <label class="pa" for="adminPassword"
						style="font-size: 35px;">Password :</label> <form:input
							path="adminPassword" type="password" id="input"
							placeholder="Enter Your Password" />
					</strong>
				</div>
				<div class="error-msg">${result}
            	</div>
				<div style="margin-top: 20px; margin-left: 30px;">
					<form:button class="login-form">Login</form:button>
				</div>
			</form:form>
			
		</div>
	</div>
</body>
</html>
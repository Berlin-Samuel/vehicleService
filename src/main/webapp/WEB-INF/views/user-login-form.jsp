<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div id="root">
		<div id="form" align="center">
			<form:form action="checkuserlogin" method="post"
				modelAttribute="user">
				<h1 align="center">User Login</h1>

				<table>
					<tr>
						<td><label for="email">Email :</label></td>
						<td><form:input path="userEmail"
								placeholder="example@gmail.com" /></td>
					</tr>
					<tr>
						<td><label for="password">Password :</label></td>
						<td><form:input path="userPassword" type="password"
								placeholder="password" /></td>
					</tr>
				</table>
				<div>
					<table>
						<tr>
							<td><form:button>
									<a href="/vehiclebookservice/addbookservice">Sign in</a>
								</form:button></td>
							<td><form:button>
									<a href="/vehicleuserdetails/adduserdetails">Sign up</a>
								</form:button></td>
						</tr>
					</table>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
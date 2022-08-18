<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add User Details</title>
<style type="text/css">
<%@include file="/WEB-INF/css/forms.css"%>
</style>
</head>
<body>
		<div  class="form-userdetails">
			<h1>Create a New Account</h1>
			<form:form action="adduser" method="post"
				modelAttribute="adduserdetails" name="form">
				<div>
					<label for="userId">User Id</label>
					<form:input path="userId" />
				</div>
				<form:errors path="userId" cssClass="text-danger" />
				<div class="form-control-userdetails">
					<label for="userName">Name</label>
					<form:input path="userName"  name="userName" placeholder="Enter Your Full Name" required="true" onblur="userNameCheck();"/>
				</div>
				<form:errors path="userName" cssClass="text-danger" />
				<div class="form-control-userdetails">
					<label for="aadharNumber">Aadhar Number</label>
					<form:input path="aadharNumber" placeholder="Enter Your Aadhar Number" required="true" onblur="aadharNumberCheck();" />
				</div>
				<form:errors path="aadharNumber" cssClass="text-danger" />
				<div class="form-control-userdetails">
					<label for="mobileNumber">Mobile Number</label>
					<form:input path="mobileNumber" placeholder="Enter Your Mobile Number" required="true" onblur="mobileNumberCheck();"/>
				</div>
				<form:errors path="mobileNumber" cssClass="text-danger" />
				<div class="form-control-userdetails" >
					<label for="userEmail">Email</label>
					<form:input path="userEmail" placeholder="Enter Your Email" required="true" onblur="userEmailCheck();" />
				</div>
				<form:errors path="userEmail" cssClass="text-danger" />
				<div class="form-control-userdetails" >
					<label for="userPassword">Password</label>
					<form:input path="userPassword" placeholder="Enter Your Password" required="true" onblur="userPasswordCheck();" />
				</div>
				<form:errors path="userPassword" cssClass="text-danger" />
				<div>
					<form:button class="button" type="submit" name="submit">Sign Up</form:button>
				</div>
			</form:form>
		</div>
	<script type="text/javascript">
	var userNameCheck = function() {
		 var nameRegex = new RegExp("^[a-zA-Z\s]+$");
		 if(!document.form.userName.value.match(nameRegex)){
				if(alert("Name can't be empty and must contain only alphabets")){ 
					 document.form.userName.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	var aadharNumberCheck = function() {
		 var nameRegex = new RegExp("^[0-9]{4}[0-9]{4}[0-9]{4}$");
		 if(!document.form.aadharNumber.value.match(nameRegex)){
				if(alert("Aadhar Number can't be empty and must contain only Numbers")){ 
					 document.form.aadharNumber.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	var mobileNumberCheck = function() {
		 var nameRegex = new RegExp("[0-9]{10}");
		 if(!document.form.mobileNumber.value.match(nameRegex)){
				if(alert("Phone number must have 10 digits")){ 
					 document.form.mobileNumber.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	 }
	var userEmailCheck = function() {
		 var nameRegex = new RegExp("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		 if(!document.form.userEmail.value.match(nameRegex)){
				if(alert("Email not in the correct format")){ 
					 document.form.userEmail.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	var userPasswordCheck = function() {
		 var nameRegex = new RegExp("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
		 if(!document.form.userPassword.value.match(nameRegex)){
				if(alert("Password must begin with letter and must contain one number and must have atleast 8 characters")){ 
					 document.form.userPassword.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	</script>
</body>
</html>
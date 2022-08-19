<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Index</title>
<style><%@include file="/WEB-INF/css/styles.css"%></s
</style>
</head>
<body>
<div class="index" >
<br>
<br>
<br>
        <div><a href="/vehicleuserdetails/userlist"><button>User Details List</button></a></div><br>
        <div><a href="/vehicletype/vehicletypelist"><button>Vehicles Details</button></a></div><br>
        <div><a href="/vehicleservicecentre/servicecentrelist"><button>Service Centre List</button></a></div><br>
        <div><a href="/vehiclebookservice/bookservicelist"><button>Booked Services</button></a></div><br>
        <div><a href="/vehicleservice/servicelist"><button>Services List</button></a></div><br>
        <div><a href="/vehiclepayment/paymentlist"><button >Payments</button></a></div><br>
    <br>
    <div><a href="/admin/login"><button class="logout" title="log out">Log out</button></a></div></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Service Centre</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
<%@include file ="/WEB-INF/css/style.css"%>
 .table-size{
 border:2px ;
 width:100%;
 cellpadding:2px;
 }
  body {
    background-image:
        url(https://img.freepik.com/free-vector/clean-medical-patterned-background-vector_53876-140867.jpg?w=826&t=st=1660760346~exp=1660760946~hmac=94b2f8a92cea8e0c6b1bcc857e0bcb539b3a9dba8ad36e03082ab462c68d2837);
}
</style>
</head>
<body>
  <div>
    <button style="    font-size: 12px;
    background-color: #f44336;
    color: black;
    float: left;" onclick="history.back()"><span class="fa fa-home" style="font-size:38px;"></span></button>
        <h1>SERVICE CENTRE</h1>

        <div id="table root">
            <table class="table-size">
            <caption></caption>
                <colgroup>
                    <col span="10" style="background-color: #ff9999">
                    <col span="4" style="background-color: white">
                </colgroup>
                	<thead>
				<tr>
					<th>Service Centre Id</th>
					<th>Centre Location</th>
					<th>Centre Phone Number</th>
					<th>Centre Email</th>
					<th>Centre Address</th>
					<th>Contact Person Name</th>
					<th>Contact Person Role</th>
					<th>Edit</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ServiceCentre" items="${allservicecentre}">
					<tr>
						<td>${ServiceCentre.serviceCentreId}</td>
						<td>${ServiceCentre.centreLocation}</td>
						<td>${ServiceCentre.centrePhoneNumber}</td>
						<td>${ServiceCentre.centreEmail}</td>
						<td>${ServiceCentre.centreAddress}</td>
						<td>${ServiceCentre.contactPersonName}</td>
						<td>${ServiceCentre.contactPersonRole}</td>
						<td><a href="updateservicecentre?centreid=${ServiceCentre.serviceCentreId}">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	   <div style="margin-top: 25px;">
            <a href="addservicecentre"><button class="button">Add New
                    Service Centre</button></a>
        </div>
	</div>
</body>
</html>
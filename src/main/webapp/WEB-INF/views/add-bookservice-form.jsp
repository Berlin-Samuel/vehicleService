<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Book Service</title>
<style type="text/css">
<%@include file="/WEB-INF/css/bookservice.css"%>
</style>
</head>
<body>
		<div class="form-bookservice">
		<h1> Book Your Service </h1>
			<form:form action="addservice" method="post"
				modelAttribute="addbookservice">
				<div class="form-control-bookservice">
					<label for="serviceCentreId">Service Centre Location</label>
					<form:select path="serviceCentreId">
						<c:forEach var="servicecentre" items="${centrelocation}">
							<form:option value="${servicecentre.serviceCentreId}"
								label="${servicecentre.centreLocation}" />
						</c:forEach>
					</form:select>
				</div>
				<div class="form-control-bookservice">
				 <label for="vehicleRegNumber">Vehicle Register Number : </label> <form:select
                                path="vehicleRegNumber">
                                <c:forEach var="vehicleType" items="${vehicleTypeList}">
                                    <form:option value="${vehicleType.vehicleRegNumber}"
                                        label="${vehicleType.vehicleRegNumber}" />
                                </c:forEach>
                            </form:select>
                  </div>
				<div >
					<label for="userId"></label>
						<form:input path="userId" type="hidden"/>
				</div >
				<div class="form-control-bookservice">
					<label for="serviceDate">Service Date</label>
						<form:input path="serviceDate" type="date" />
				</div>
				<div class="form-control-bookservice">
					<label for="returnDate">Return Date</label>
					<div>
						<form:input path="returnDate" type="date" />
					</div>
				</div>
				<div>
					<form:button class="button" type="submit" name="submit">Add Book Service</form:button>
				</div>
			</form:form>
		</div>
	<%-- <div><a href="/vehicleservicedetails/servicedetailslist?id=${bookId}"><button class="button" type="submit" name="submit">Go To Service</button></a></div> --%>
</body>
</html>
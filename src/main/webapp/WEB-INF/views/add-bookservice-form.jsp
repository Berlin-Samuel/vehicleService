<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book Service</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addservice" method="post"
				modelAttribute="addbookservice">
				<div>
					<label for="serviceCentreId">Service Centre Location</label>
					<form:select path="serviceCentreId">
						<c:forEach var="servicecentre" items="${centrelocation}">
							<form:option value="${servicecentre.serviceCentreId}"
								label="${servicecentre.centreLocation}" />
						</c:forEach>
					</form:select>
				</div>
				
				<div>
				 <label for="vehicleRegNumber">Vehicle Register Number : </label> <form:select
                                path="vehicleRegNumber">
                                <c:forEach var="vehicleType" items="${vehicleTypeList}">
                                    <form:option value="${vehicleType.vehicleRegNumber}"
                                        label="${vehicleType.vehicleRegNumber}" />
                                </c:forEach>
                            </form:select>
                  </div>
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="serviceDate">Service Date</label>
					<div>
						<form:input path="serviceDate" type="date" />
					</div>
				</div>
				<div>
					<label for="returnDate">Return Date</label>
					<div>
						<form:input path="returnDate" type="date" />
					</div>
				</div>
				<div>
					<form:button>Add Book Service</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div><a href="/vehicleservicedetails/servicedetailslist?id=${bookId}"><button>goto Service</button></a></div>
</body>
</html>
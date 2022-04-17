<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<br>
	<!--Add code here  -->
	<sf:form id="searchResult">
	<c:if test="${carList.isEmpty()==false}">
		<h3>Here are cars matching your search criteria: </h3>
		<table border="1">
			<tr>
				<th>Brand Name</th>
				<th>Model Name</th>
				<th>Price in lakh</th>
				<th>Fuel/Transmission</th>
				<th>Mileage</th>
				<th>Seating Capacity</th>
			</tr>
			<c:forEach items="${carList}" var="car">
				<tr>
					<td>${car.brandName}</td>
					<td>${car.modelName}</td>
					<td>${car.price}</td>
					<td>${car.fuelType}</td>
					<td>${car.mileage}</td>
					<td>${car.seatingCapacity}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${carList.isEmpty()==true}">
		<h3 id="noResult">Sorry,No car available matching your profile.</h3>
	</c:if>
	</sf:form>
	<br/>
	<a href="showCarSearchForm" id="searchCars">Search Cars</a>
</body>
</html>
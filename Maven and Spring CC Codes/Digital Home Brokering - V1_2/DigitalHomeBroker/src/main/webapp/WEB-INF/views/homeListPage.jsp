<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<body bgcolor="lavender">
	<h1>
		<center>Digital Home Broker</center>
	</h1>
	<h2>
		<center>Search homes|Apartments !!!</center>
	</h2>
	
	<c:if test="${fn:length(homes) == 0}">
		<h2>
			<center>No home/Apartment found for this search</center>
		</h2>
	</c:if>
	
	<c:if test="${fn:length(homes) > 0}">
	<table>
		<thead>
			<tr>
				<td>Location</td>
				<td>BhkType</td>
				<td>Address</td>
				<td>ContactPerson</td>
				<td>ContactNumber</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${homes}" var="home">
				<tr>
					<td>${home.location}</td>
					<td>${home.bhkType}</td>
					<td>${home.address}</td>
					<td>${home.contactPerson}</td>
					<td>${home.contactNumber}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</c:if>

</body>
</html>
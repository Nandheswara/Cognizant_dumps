<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<!-- Add code here.. -->
	<h1 id="heading">Windsor Car Showroom</h1>
	
	<h3 style="align:center">Search Cars</h3>
	<sf:form name="form" action="getCarSearchResultPage" 
						modelAttribute="carSearch" method="post">
		<sf:label path="customerName">Customer Name:</sf:label>
		<sf:input path="customerName" id="customerName" />
		<sf:errors path="customerName" cssStyle="color:red;"/>
		<br />
		<sf:label path="mobileNumber">Mobile Number:</sf:label>
		<sf:input path="mobileNumber" id="mobileNumber" />
		<sf:errors path="mobileNumber" cssStyle="color:red;" />
		<br />
		<sf:label path="gender">Gender:</sf:label>
		<sf:radiobutton path="gender" value="Male" />Male
 		<sf:radiobutton path="gender" value="Female" />Female
 		<sf:errors path="gender" cssStyle="color:red;"/>
		<br />
		<sf:label path="customerCity">Customer City:</sf:label>
		<sf:select path="customerCity" id="customerCity">
			<sf:options items="${cities}" />
		</sf:select>
		<br />
		<sf:label path="brand">Brand:</sf:label>
		<sf:select path="brand" id="brand">
			<sf:options items="${brands}" />
		</sf:select>
		<br />
		<sf:label path="fuelType">Fuel Type:</sf:label>
		<sf:select path="fuelType" id="fuelType">
			<sf:options items="${fuelTypes}" />
		</sf:select>
		<br />
		<sf:label path="budgetUpto">Budget Upto:</sf:label>
		<sf:select path="budgetUpto" id="budgetUpto">
			<sf:options items="${budgetUpto}" />
		</sf:select>
		<br />
		<input type="submit" value="CarSearch" />
		<input type="reset" value="Clear" />
	</sf:form>

</body>
</html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Digital Home Broker</center>
	</h1>
	<h2>
		<center>Search homes|Apartments !!!</center>
	</h2>
	<center>
		<table>
			<form:form action="homeList" modelAttribute="homeBean" method="post">
				<tr>
					<td><form:label path="location">Search location</form:label></td>
					<td><form:input path="location" id="location" name="location" />
					</td>
				</tr>
				<tr>
					<td><form:label path="bhkType">Search BHK Type</form:label></td>
					<td><form:input path="bhkType" id="bhkType" name="bhkType" />
					</td>
				</tr>
				<tr>
					<td><form:label path="rent">Preferred Rent</form:label></td>
					<td><form:input path="rent" id="rent" name="rent" />
					<form:errors path="rent" />
					</td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" name="submit" value="Search" /></td>
				</tr>
			</form:form>
		</table>
	</center>
</body>
</html>

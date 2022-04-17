
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Snap Fitness Center </center></h1>
    <form:form modelAttribute="snap" method="post" action="/packEstimation">
	 <center>
		<table>
			<tr>
				<td><form:label path="preferredPackage">Select Package</form:label></td>
				<td><form:select path="preferredPackage" id="preferredPackage"
						name="preferredPackage" items="${packageList}" required="required" /></td>
			</tr>
			<tr>
				<td><form:label path="numberOfMonths">Package duration (In months)</form:label></td>
				<td><form:input path="numberOfMonths" id="numberOfMonths"
						name="numberOfMonths" required="required" /><label>${messege}</label></td>
			</tr>
			<tr>
				<td><input type="submit" id="submit(Name)" name="submit"
					value="Package Cost" /></td>
				<td></td>
			</tr>

		</table>
		</center>
	</form:form>


</body>
</html>	 
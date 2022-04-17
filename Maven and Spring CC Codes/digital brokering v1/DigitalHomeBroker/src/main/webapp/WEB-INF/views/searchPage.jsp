<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Digital Home Broker </center></h1>
<h2><center>Search homes|Apartments !!!  </center></h2>
<form action="#" th:action="@{/homeList}" th:object="${home}"
			method="post">

			<table border="0" cellpadding="10">
				<tr>
					<td>Search Location:</td>
					<td><input name="location" id="location" type="text" th:field="*{location}" /></td>
				</tr>
				<tr>
					<td>Search BHK Type:</td>
					<td><input name="bhkType" id="bhkType" type="text" th:field="*{bhkType}" /></td>
				</tr>
				<tr>
					<td>Preferred Rent:</td>
					<td><input min="5000" name="rent" id="rent" type="number" th:field="*{rent}" /></td>
				</tr>								
				<tr>
					<td><button type="submit">Search</button> </td>
				</tr>
			</table>
		</form>


</body>
</html>	 	  	    	    	     	      	 	

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Delivery Agency</center>
	</h1>
	<center>
		<sf:form action="orderList" name="form" modelAttribute="orderBean"
			method="POST">

			<fieldset>
				<label for='deliveryDate'>Search Delivery Date</label>
				<sf:input path="deliveryDate" id="deliveryDate" name="deliveryDate"
					placeholder="dd/mm/yyyy" />
				<sf:errors path="deliveryDate" />
				<br /> 
				<label for='deliveryStatus'>Select Delivery Status</label>
				<sf:select path="deliveryStatus" id="deliveryStatus" name="deliveryStatus">
					<sf:option label="delivered" value="delivered"/>
					<sf:option label="pending" value="pending"/>
				</sf:select>
			</fieldset>
			<input type="submit" id="submit" value="Search" name="submit" />
		</sf:form>
	</center>
</body>
</html>

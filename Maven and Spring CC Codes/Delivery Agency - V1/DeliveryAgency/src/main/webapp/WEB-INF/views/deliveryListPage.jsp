<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body bgcolor="lavender">
	<h1>
		<center>Delivery Agency</center>
	</h1>

	<table>
		<tr>
			<td>OrderId</td>
			<td>Order From</td>
			<td>Delivery To</td>
			<td>Delivery Date</td>
			<td>Status</td>
		</tr>
		<c:forEach items="${orders}" var="order">
			<tr>
				<td>${order.orderId}</td>
				<td>${order.orderFrom}</td>
				<td>${order.deliveryTo}</td>
				<td>${order.deliveryDate}</td>
				<td>${order.deliveryStatus}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
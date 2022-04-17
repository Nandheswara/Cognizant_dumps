<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body bgcolor="lavender">
<h1><center> Digital Home Broker </center></h1>
<h2><center>Search homes|Apartments !!!  </center></h2>
<table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Location</th>
                <th>BhkType</th>
                <th>Address</th>
                <th>Contact Person</th>
                <th>Contact Number</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="home : ${listHome}">
            	<td th:text="${home.location}">Location</td>
                <td th:text="${home.bhkType}">BhkType</td>
                <td th:text="${home.address}">Address</td>
                <td th:text="${home.contactPerson}">Contact Person</td>
                <td th:text="${home.contactNumber}">Contact Number</td>
                
            </tr>
        </tbody>
    </table>

</body>
</html>
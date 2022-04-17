<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender"> <center>
<h2>Farm Fresh - A natural farm store!!</h2>
					
			<table  >			
					<tr>
				 <td>Product Name  <td>${name}</td>
				 </tr>
				 <tr>
				  <td>Quantity  <td>${quantity}</td>
				  </tr>
				  <tr>
				  <td>Cost Per Kg  <td>${costPerKg}</td>
				  </tr>
				  <tr>
				  <td>Total cost Rs  <td>${cost}</td>
				</tr>
		</table>
	</center>	
	
	</body>
</html>
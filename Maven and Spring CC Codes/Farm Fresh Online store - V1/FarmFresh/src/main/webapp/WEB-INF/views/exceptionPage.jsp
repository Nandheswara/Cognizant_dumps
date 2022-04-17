<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender">

<center> <h2>Farm Fresh - A natural farm store!!</h2>
				<h3>
			<%
				if (request.getAttribute("message") != null) {
			%>
			<%=request.getAttribute("message")%>
			<%
				}
			%>
		</h3>
		<div>
		<center>	<a href="showPage"> Home</a></center>
		</div>
		</center>
		
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of car</title>
</head>
<body>
	<h1>This will contain the list of cars</h1>
	<table class="table">
	<c:if test="${message!=null}">
		<h1> ${message}</h1>
	</c:if>
	<br>
			<thead>
				<tr>
					<th>S.N</th>
					<th>Category</th>
					<th>Name of the vehicle</th>
				</tr>
			</thead>
			<c:forEach items="${vehicles}" var="vehicle" varStatus="count">
				<tbody>
					<tr>
						<td>${count.index+1}</td>
						<td>${vehicle.vehicleCategory}</td>
						<td>${vehicle.make}</td>
						<td></td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
</body>
</html>
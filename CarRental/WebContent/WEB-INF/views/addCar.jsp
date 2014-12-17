<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="?language=en" >English</a>|<a href="?language=german" >German</a>
	<h1>Add car reach</h1>
	<form:form modelAttribute="newVehicle" method="post">
	<fieldset>
	<legend>Add new vehicle</legend>
	<form:label path="registrationNumber"><spring:message code="addProduct.form.productId.label"/></form:label>
	<form:input path="registrationNumber" id="registrationNumber"/>
	<form:errors path="registrationNumber"></form:errors>
	<br>
	<form:label path="make">Registration Number:</form:label>
	<form:input path="make" id="make"/>
	<form:errors path="make" class="error"></form:errors>	
	<br>
	<form:label path="currentMileage">Current Mileage:</form:label>
	<form:input path="currentMileage" id="currentMileage"/>
	<form:errors path="currentMileage"></form:errors>
	<br>
	<form:label path="engineSize">engine Size:</form:label>
	<form:input path="engineSize" id="engineSize"/>
	<form:errors path="engineSize"></form:errors>
	<br>
	<form:label path="dailyHireRate">Rate per day:</form:label>
	<form:input path="dailyHireRate" id="dailyHireRate"/>
	<form:errors path="dailyHireRate"></form:errors>
	<br>
	<form:select path="category_vehicleCatgeoryCode" cssClass="textArea">
     <option value="Select" label=" - Select - " ></option>
     <c:forEach items="${Categories}" var="category">
     	<form:option value="${category.name}"></form:option>
     </c:forEach>
	</form:select>
	<form:errors path="category_vehicleCategoryCode"></form:errors>
	<br>
		<input type="submit" value="add"/>
	</fieldset>
	</form:form>
</body>
</html>
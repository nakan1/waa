<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="resource/css/main.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<a href="?language=en" >English</a>|<a href="?language=german" >German</a>
	
	<div id="contenair">
		<div id="header">
			<h1>SINKA</h1>
			Time : ${serverTime} <a href="j_spring_security_logout">logout</a>

		</div>

		<div id="content">
			<div id="nav">
				<%@ include file="menu.jsp"%>
			</div>
			<div id="main">
					<h1>Add car</h1>
	<form:form modelAttribute="newVehicle" method="post" enctype="multipart/form-data">
	<fieldset>
	<legend>Add new vehicle</legend>
	<form:label path="registrationNumber"><spring:message code="addCar.Form.vehicleRegistrationNumber.Label"/></form:label>
	<form:input path="registrationNumber" id="registrationNumber"/>
	<form:errors path="registrationNumber"></form:errors>
	<br>
	<form:label path="make"><spring:message code="addCar.Form.make.Label"/></form:label>
	<form:input path="make" id="make"/>
	<form:errors path="make" class="error"></form:errors>	
	<br>
	<form:label path="curentMileage"><spring:message code="addCar.Form.currentMileage.Label"/></form:label>
	<form:input path="curentMileage" id="currentMileage"/>
	<form:errors path="curentMileage"></form:errors>
	<br>
	<form:label path="engineSize"><spring:message code="addCar.Form.engineSize.Label"/></form:label>
	<form:input path="engineSize" id="engineSize"/>
	<form:errors path="engineSize"></form:errors>
	<br>
	<form:label path="dailyHireRate"><spring:message code="addCar.Form.dailyHireRate.Label"/></form:label>
	<form:input path="dailyHireRate" id="dailyHireRate"/>
	<form:errors path="dailyHireRate"></form:errors>
	<br>
	
	<form:label path="categoryvehicleCategoryCode.vehicleCategoryCode"><spring:message code="addCar.Form.category.Label"/></form:label>	
	<form:select path="categoryvehicleCategoryCode.vehicleCategoryCode" >
     <option value="Select" label=" - Select - " ></option>
     <c:forEach items="${Categories}" var="category">
     	<form:option value="${category.vehicleCategoryCode}">${category.vehicleCategoryDescription}</form:option>
     	
     </c:forEach>
	</form:select>
	<form:errors path="categoryvehicleCategoryCode"></form:errors>
	<form:input id="imageFile" path="imageFile" type="file"/>
	<br>
		<input type="submit" value="add" class="button tiny"/>
	</fieldset>
	</form:form>
			</div>
		</div>

		<div id="footer">Copyright &copy; 2014 SpringChampions.</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add user for</h1>
	<form:form  modelAttribute="newUser" action="users/addUser" method="post">
		<fieldset>
			<legend>Add new User</legend>
			${insertionMessage}
		<table>
		<tr>
			<td><spring:message code="addUser.form.username.label"/></td> <td><form:input type="text" path="username"/></td> <td><form:errors path="username"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.password.label"/></td> <td><form:input type="password" path="password"/></td> <td><form:errors path="password"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.email.label"/></td> <td><form:input type="text" path="email"/></td> <td><form:errors path="email"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.firstName.label"/></td> <td><form:input type="text" path="firstName"/></td> <td><form:errors path="firstName"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.lastName.label"/></td> <td><form:input type="text" path="lastName"/></td> <td><form:errors path="lastName"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.gender.label"/></td> <td><form:input type="text" path="gender"/></td> <td><form:errors path="gender"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.phone.label"/></td> <td><form:input type="text" path="phone"/></td> <td><form:errors path="phone"/></td>
		</tr>
		<tr>
 			<td><spring:message code="addUser.form.addressLine1.label"/></td> <td><form:input type="text" path="addressLine1"/></td> <td><form:errors path="addressLine1"/></td>
		</tr>
		<tr>
 			<td><spring:message code="addUser.form.addressLine2.label"/></td> <td><form:input type="text" path="addressLine2"/></td> <td><form:errors path="addressLine2"/></td>
 		</tr>
		<tr>
			<td><spring:message code="addUser.form.city.label"/></td> <td><form:input type="text" path="city"/></td> <td><form:errors path="city"/></td>
		</tr>
		<%-- <tr>
			<td><form:input type="hidden" path="userRolesCollection" value="ROLE_USER"/>
				<form:select  path="userRolesCollection">
					<form:option value="ROLE_USER">User</form:option>
					<form:option value="ROLE_ADMIN">ADMIN</form:option>
				</form:select>
			</td>
		</tr> --%>
		
		</table>
		<input type="submit" value="Add User">
		</fieldset>
	</form:form>
	
	
		
</body>
</html>
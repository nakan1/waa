<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<link href="${pageContext.servletContext.contextPath}/resource/css/main.css" rel="stylesheet">
<title>Registration</title>
</head>
<body>

	<div id="contenair">
		<div id="header">
			<h1>SINKA</h1>
			Time : ${serverTime} <a href="/j_spring_security_logout">logout</a>

		</div>

		<div id="content">
			<div id="nav">
				<%@ include file="menu.jsp"%>
			</div>
			<div id="main">
				<h1>Register</h1>
				 <form:form modelAttribute="newUser"
					action="/CarRental/users/addUser" method="post">
					<fieldset>
						<legend>Add new User</legend>
						${insertionMessage}
						<table>
							<tr>
								<td><spring:message code="addUser.form.username.label" /></td>
								<td><form:input type="text" path="username" /></td>
								<td><form:errors path="username" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.password.label" /></td>
								<td><form:input type="password" path="password" /></td>
								<td><form:errors path="password" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.email.label" /></td>
								<td><form:input type="text" path="email" /></td>
								<td><form:errors path="email" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.firstName.label" /></td>
								<td><form:input type="text" path="firstName" /></td>
								<td><form:errors path="firstName" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.lastName.label" /></td>
								<td><form:input type="text" path="lastName" /></td>
								<td><form:errors path="lastName" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.gender.label" /></td>
								<td><form:input type="text" path="gender" /></td>
								<td><form:errors path="gender" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.phone.label" /></td>
								<td><form:input type="text" path="phone" /></td>
								<td><form:errors path="phone" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.addressLine1.label" /></td>
								<td><form:input type="text" path="addressLine1" /></td>
								<td><form:errors path="addressLine1" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.addressLine2.label" /></td>
								<td><form:input type="text" path="addressLine2" /></td>
								<td><form:errors path="addressLine2" /></td>
							</tr>
							<tr>
								<td><spring:message code="addUser.form.city.label" /></td>
								<td><form:input type="text" path="city" /></td>
								<td><form:errors path="city" /></td>
							</tr>
							<tr>
								<td><form:input type="hidden"
										path="userrolesuserRolesId.userRolesId" deseable="true"
										value="1" />
								</td>
							</tr>

						</table>
						<input type="submit" value="Add User">
					</fieldset>
				</form:form>
			</div>
		</div>

		<div id="footer">Copyright &copy; 2014 SpringChampions.</div>
	</div>

</body>
</html>
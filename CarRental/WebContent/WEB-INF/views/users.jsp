<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  modelAttribute="newUser" action="/CarRental/users/addUser" method="post">
<fieldset>
	<legend>Edit User</legend>
	<table>
		<tr>
			<td><spring:message code="addUser.form.username.label"/></td> <td><form:input type="text" path="username" value="${user.username}"/></td> <td><form:errors path="username"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.password.label"/></td> <td><form:input type="password" path="password" value="${user.password}"/></td> <td><form:errors path="password"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.email.label"/></td> <td><form:input type="text" path="email" value="${user.email}"/></td> <td><form:errors path="email"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.firstName.label"/></td> <td><form:input type="text" path="firstName" value="${user.firstName}"/></td> <td><form:errors path="firstName"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.lastName.label"/></td> <td><form:input type="text" path="lastName" value="${user.lastName}"/></td> <td><form:errors path="lastName"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.gender.label"/></td> <td><form:input type="text" path="gender" value="${user.gender}"/></td> <td><form:errors path="gender"/></td>
		</tr>
		<tr>
			<td><spring:message code="addUser.form.phone.label"/></td> <td><form:input type="text" path="phone" value="${user.phone}"/></td> <td><form:errors path="phone"/></td>
		</tr>
		<tr>
 			<td><spring:message code="addUser.form.addressLine1.label"/></td> <td><form:input type="text" path="addressLine1" value="${user.addressLine1}"/></td> <td><form:errors path="addressLine1"/></td>
		</tr>
		<tr>
 			<td><spring:message code="addUser.form.addressLine2.label"/></td> <td><form:input type="text" path="addressLine2" value="${user.addressLine2}"/></td> <td><form:errors path="addressLine2"/></td>
 		</tr>
		<tr>
			<td><spring:message code="addUser.form.city.label"/></td> <td><form:input type="text" path="city" value="${user.city}"/></td> <td><form:errors path="city"/></td>
		</tr>
		</table>
		<input type="submit" value="Valid"/>
</fieldset>
</form:form>
<fieldset>
<legend>List of all users</legend>
<table>
<th>UserName</th>
	 <c:forEach items="${listUsers}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.firstName}</td>
            <td><a href="<c:url value='/users/edit/${user.username}' />" >Edit</a></td>
            <td><a href="<c:url value='/users/remove/${user.username}' />" >Delete</a></td>
        </tr>
    </c:forEach>
  </table>  
 </fieldset>   

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.servletContext.contextPath}/resource/css/main.css" rel="stylesheet">
<link href="<c:url value="resource/css/login.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
		<a href="?language=en" >English</a>|<a href="?language=fr" >French</a>
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
					<form name='loginForm'
			action="<c:url value='/j_spring_security_check' />" method='POST'>
			<fieldset>
				<legend>Connection</legend>

				<c:if test="${not empty error}">
					<div class="error">${error}</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="msg">${msg}</div>
				</c:if>

				<table>
					<tr>
						<td>User:</td>
						<td><input type='text' name='j_username'></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type='password' name='j_password' /></td>
					</tr>
					<tr>
						<td colspan='2'><input name="submit" type="submit"
							value="submit" /></td>
						<td><a href="/CarRental/users/addUser">SingUP</a></td>
					</tr>
				</table>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</fieldset>
		</form>
			</div>
		</div>

		<div id="footer">Copyright &copy; 2014 SpringChampions.</div>
	</div>
</body>
</html>
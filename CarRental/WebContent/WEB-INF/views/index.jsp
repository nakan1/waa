<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head> 
	<link href="<c:url value="resource/css/main.css" />" rel="stylesheet">
<title>Home</title>
</head>
<body>
	
	<div id="contenair">
		<div id="header">
			<h1>SINKA</h1>
			Time : ${serverTime}
			<a href="/j_spring_security_logout">logout</a>
			
			</div>
		
		<div id="content">
			<div id="nav">
				<%@ include file="menu.jsp" %>
			</div>
			<div id="main">
				<p> the  listOfcars should be include here </p>
			</div>
		</div>
		
		<div id="footer">
			Copyright &copy; 2014 SpringChampions.
		</div>
	</div>

</body>
</html>

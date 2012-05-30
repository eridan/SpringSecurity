<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>IDMR</title>
</head>

<body>
	<h1>
		Welcome,
		<security:authentication property="principal.username" />
		to IDMR Application!
	</h1>
	<h3>Message : ${message}</h3>
	<h3>Username : ${username}</h3>

	<security:authorize access="hasRole('SUPER_USER')">
		<h3>Delete all users ability!!!</h3>
		<input name="commit" type="submit" value="Delete All" />
	</security:authorize>

	<security:authorize url="/admin/**">
		<spring:url value="/admin" var="admin_url"></spring:url>
		<a href="${admin_url}">Administration</a>
	</security:authorize>

	<a href="<c:url value="/j_spring_security_logout" />"> Logout</a>

</body>
</html>
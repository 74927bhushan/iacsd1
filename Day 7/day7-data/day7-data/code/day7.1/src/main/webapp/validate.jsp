<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%--WC tries to invoke setEmail n setPassword on the JB instance --%>
<jsp:setProperty property="*" name="user" />
<body>
	<%--B.L method  session.getAttribute("user").validateUser()--%>
	<%-- <h5> ${sessionScope.user.validateUser()}</h5> --%>
	<%--response.sendRedirect(response.encodeRedirectURL(session.getAttribute("user").validateUser().concat(".jsp"));--%>
	<c:redirect url="${sessionScope.user.validateUser()}.jsp" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--Hello user name , you have looged in under role of .... --%>
	<%--WC session.getAttribute("user").getUserDetails().getFirstName() sent to clnt --%>
	<h5 align="center" style="color: green;">${sessionScope.user.message}</h5>

	<h5>Hello , ${sessionScope.user.userDetails.firstName}
		${sessionScope.user.userDetails.lastName}</h5>
	<h6>You have logged in under ${sessionScope.user.userDetails.role}
		role</h6>
	<%--Display top 2 candidates in tabular manner --%>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Top 2 Candidates</caption>
		<tr>
			<th>Candidate ID</th>
			<th>Candidate Name</th>
			<th>Candidate's Party</th>
			<th>Candidate's Votes</th>
		</tr>
		<c:forEach var="can" items="${sessionScope.candidate.top2Candidates}">
			<tr>
				<td>${can.candidateId}</td>
				<td>${can.candidateName}</td>
				<td>${can.party}</td>
				<td>${can.votes}</td>
			</tr>
		</c:forEach>
	</table>
	<%--Display party wise votes in tabular manner --%>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Partywise Votes</caption>
		<tr>
			<th>Party Name</th>
			<th>Total Votes</th>
		</tr>
		<c:forEach var="entry" items="${sessionScope.candidate.partyVotes}">
			<tr>
				<td>${entry.key}</td>
				<td>${entry.value}</td>
			</tr>
		</c:forEach>
	</table>
	<%--invalidate HttpSession --%>
	${pageContext.session.invalidate()}
	<h5>Admin logged out...</h5>
	<a href="login.jsp">Visit Again</a>

</body>
</html>
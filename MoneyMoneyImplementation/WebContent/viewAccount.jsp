<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="align: center;">
		<h1>VIEW ACCOUNTS</h1>
		
			<table>
				<tr>
					<th>ACCOUNT NUMBER </th>
					<th>CUSTOMER NAME </th>
					<th>CUSTOMER ID</th>
					<th>ACCOUNT TYPE</th>
					<th>ACCOUNT BALANCE</th>
					<th>OVERDRAFT LIMIT</th>
					<th>SALARY ACCOUNT</th>
					
				</tr>
				<jstl:forEach var="search" items="${sessionScope.search}">
					<tr>
						<td>${search.accountNumber}</td>
						<td>${search.accountHolder.customerName}</td>
						<td>${search.accountHolder.customerId}</td>
						<td>${search.accountType}</td>
						<td>${search.accountBalance}</td>
						
						<jstl:choose>
						<jstl:when
							test='${search.accountType.equals("currentAccount")}'>
							<td align="center">${search.odLimit}</td>
							<td align="center">NA</td>
						</jstl:when>
						<jstl:otherwise>
							<td align="center">NA</td>
							<td align="center">${search.salary}</td>
						</jstl:otherwise>
					</jstl:choose>
					</tr>
			<tr>	<th colspan="9"  height="40"><input type="submit" value="Home"></th>
					</tr>		
						
						
						
						
						
						
						
						
					
				</jstl:forEach>
			</table>

	
	</div>

</body>
</html>
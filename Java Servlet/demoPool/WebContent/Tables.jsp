<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/new">Add new student</a>
	<a href="<%=request.getContextPath()%>/list" class="nav-link"></a>	
	<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="lst" items="${list}">
						<tr>
							<td><c:out value="${lst.getId()}" /></td>
							<td><c:out value="${lst.getFirstName()}" /></td>
							<td><c:out value="${lst.getLastName()}" /></td>
							<td><c:out value="${lst.getEmail()}" /></td>
							<td>
								<a href="edit?id=<c:out value='${lst.id}' />">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp; 
								<a href="delete?id=<c:out value='${lst.id}' />">Delete</a>
							</td>
								
						</tr>
					</c:forEach>
				</tbody>

			</table>
</body>
</html>
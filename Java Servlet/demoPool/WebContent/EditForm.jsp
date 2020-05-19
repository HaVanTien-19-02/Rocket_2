<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>
	<form style="text-align: center" action="update" method="post">
		<h1> Edit Form</h1>
		<input type="hidden" name="id" value="<c:out value='${student.id}' />" />
		First Name: <input type="text" name=firstName value="<c:out value='${student.firstName}' />" > </br></br>
		Last Name: <input type="text" name=lastName value="<c:out value='${student.lastName}' />" > </br></br> 
		Email: <input type="text" name=email value="<c:out value='${student.email}' />" > </br></br>
		<input type="submit" name=submit value="Save">	
	</form>
</body>
</html>
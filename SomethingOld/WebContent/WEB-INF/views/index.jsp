<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Work It Out</title>
</head>
<body>
	<h1 align="center">Work it out</h1>

		<c:forEach var="e" items="${exercise}">
			<ul>
				<li><a href="getExercise.do?fid=${e.id}">${e.name }</a></li>

			</ul>
		</c:forEach>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WorkItOut</title>
</head>
<body>
<div>
<form action="findExercise.do" method="GET">
  <input type="text" name="keyword"/>
  <input type="submit" value="Find Exercise"/>
</form>
</div>
<div></div>
</body>
</html>
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
  <h3>${exercise.name}</h3> <h5><p>${exercise.skillLevel}</p></h5>
  <h6>${exsercise.category}</h6>
  <p>${exercise.description}</p>
  
  <h2>Update This Exercise!</h2>
				<form action="update.do" name="update" method="POST">
				<input type="hidden" value="${exercise.id }" name="id">
		
				
					<input label="Name" type="text" palceholder="Name" value="${exercise.name }" name="name">
						<select>
						  <option name="skill_level" value="BEGINNER">Beginner</option>
						  <option name="skill_level" value="INTERMEDIATE">Intermediate</option>
						  <option name="skill_level" value="EXPERT">Expert</option>
						</select>	
						<select>
						  <option name="category" value="BODYWEIGHT">Bodyweight</option>
						  <option name="category" value="WEIGHTS">Weights</option>
						  <option name="category" value="YOGA">Yoga</option>
						  <option name="category" value="FUN">Fun</option>
						</select>	
					<textarea  palceholder="Description" value="${exercise.description }" name="description"></textarea>
				
				
		
					
						<input type="submit" value="UPDATE"><br>
				</form>
  
  <p>Delete This Exercise!</p>
  
			<form action="deleteExercise.do" name="delete" method="POST">
			<input type="hidden" value="${exercise.id }" name="id">
			<input type="submit" value="DELETE">
			 <h6>Don't do it!</h6>
			</form>
</div>
<div></div>
</body>
</html>
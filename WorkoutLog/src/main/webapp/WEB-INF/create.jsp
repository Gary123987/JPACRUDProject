<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="/createdWorkout.do">
Date of the Workout:<input type="date" name="date"/><br>
Muscle Group: <select name="muscleGroup">
	<option value="Legs">Legs</option>
	<option value="Chest and Arms">Chest and Arms</option>
	<option value="Back and Core">Back and Core</option>
	<option value="Cardio">Cardio</option>
</select>
Intensity:<select name="intensity">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
</select>
Length(in minutes):<input type="text" name="length"/><br>


<input type="submit"/>


</form>

</body>
</html>
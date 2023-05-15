<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello!</h1>
<a href="/createWorkout.do">Log a new Workout</a>   


<table style="border: 1px solid;">
<tr>
<th style="border: 1px solid;">Date</th>
<th style="border: 1px solid;">Muscle Group</th>
<th style="border: 1px solid;">Intensity</th>
<th style="border: 1px solid;">Length</th>
<th style="border: 1px solid;">Update</th>
<th style="border: 1px solid;">Delete</th>
</tr>

<c:forEach items="${workouts}" var="w">
<tr>
<td style="border: 1px solid;">${w.date}</td>
<td style="border: 1px solid;">${w.muscleGroup}</td>
<td style="border: 1px solid;">${w.intensity}</td>
<td style="border: 1px solid;">${w.length}</td>
<td style="border: 1px solid;"><a href="/updateForm.do?id=${w.id }">Update</a></td>
<td style="border: 1px solid;"><a href="/delete.do?id=${w.id }">Delete</a></td>
</tr>
</c:forEach>
</table>












</body>
</html>
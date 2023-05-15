<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Workout Updated!</h1>

<table style="border: 1px solid;">
<tr>
<th style="border: 1px solid;">Date</th>
<th style="border: 1px solid;">Muscle Group</th>
<th style="border: 1px solid;">Intensity</th>
<th style="border: 1px solid;">Length</th>
<th style="border: 1px solid;">Update</t h>
<th style="border: 1px solid;">Delete</th>
</tr>


<tr>
<td style="border: 1px solid;">${workout.date}</td>
<td style="border: 1px solid;">${workout.muscleGroup}</td>
<td style="border: 1px solid;">${workout.intensity}</td>
<td style="border: 1px solid;">${workout.length}</td>
<td style="border: 1px solid;"><a href="/updateForm.do?id=${w.id }">Update</a></td>
<td style="border: 1px solid;"><a href="/delete.do?id=${w.id }">Delete</a></td>
</tr>

</table>

<a href="/index">Back to home</a>

</body>
</html>
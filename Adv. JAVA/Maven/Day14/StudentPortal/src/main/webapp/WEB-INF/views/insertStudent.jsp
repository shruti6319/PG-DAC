<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertStudent" method="post">
Student Id : <input type="text" name="sid" id="sid" ><br>
Student Name :<input type="text" name="sname" id="sname" ><br>
Email :<input type="email" id="email" name="email" ><br>
DOB : <input type="date" id="dob" name="dob" ><br>
Address : <input type="text" name="addr" id="addr" ><br>
<button type="submit" name="btn" id="add" value="add">ADD Student </button>
</form>

</body>
</html>
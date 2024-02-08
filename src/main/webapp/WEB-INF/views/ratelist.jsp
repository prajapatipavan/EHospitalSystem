<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

          <h1>Add Department</h1>
    <form action="saveDepartment" method="post">
        Department Name: <input type="text" name="departmentName"><br>
        Active:<input type="checkbox" name="active"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
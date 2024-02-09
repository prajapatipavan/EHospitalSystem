<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Add Doctor Document</h1>
    <form action="addDoctorDocument" method="post">
        <label for="documentName">Document Name:</label><br>
        <input type="text" id="documentName" name="documentName"><br>
        
        <label for="doctorId">Doctor ID:</label><br>
        <input type="text" id="doctorId" name="doctorId"><br>
        
        <label for="documentPath">Document Path:</label><br>
        <input type="text" id="documentPath" name="documentPath"><br>
        
        <input type="submit" value="Submit">
        
        
    </form>
</body>
</html>
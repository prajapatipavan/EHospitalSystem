<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                  <h2>Employee Registration</h2>

<form action="saveEmployee" method="post">
    <input type="text" name="firstName" placeholder="First Name" required>
    <br><br>

    <input type="text" name="lastName" placeholder="Last Name" required>
    <br><br>

    <input type="text" name="titleName" placeholder="Title">
    <br><br>

    <input type="text" name="gender" placeholder="Gender">
    <br><br>

    <input type="email" name="email" placeholder="Email" required>
    <br><br>

    <input type="password" name="password" placeholder="Password" required>
    <br><br>

    <input type="date" name="dateOfJoining" placeholder="Date of Joining">
    <br><br>

    <input type="text" name="qualification" placeholder="Qualification">
    <br><br>

   <input type="text" name="roleId" placeholder="role">
    <br><br>

    <input type="text" name="aadharCardPath" placeholder="Aadhar Card Path">
    <br><br>

    <input type="text" name="panCardPath" placeholder="Pan Card Path">
    <br><br>

    <input type="text" name="qualificationDocPath" placeholder="Qualification Doc Path">
    <br><br>

    <input type="checkbox" name="activeInd" value="true">
    <br><br>

    <input type="text" name="contactNum" placeholder="Contact Number">
    <br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
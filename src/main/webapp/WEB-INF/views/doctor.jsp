<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Add Doctor</h1>
    <form action="addDoctor" method="post">
        <input type="text" name="firstName" placeholder="First Name"><br>
        <input type="text" name="lastName" placeholder="Last Name"><br>
        <input type="text" name="titleName" placeholder="Title Name"><br>
        <input type="text" name="qualification" placeholder="Qualification"><br>
        <input type="text" name="specialization" placeholder="Specialization"><br>
        <input type="text" name="email" placeholder="Email"><br>
        <input type="password" name="password" placeholder="Password"><br>
        <input type="text" name="contactNum" placeholder="Contact Number"><br>
        <input type="text" name="gender" placeholder="Gender"><br>
        <input type="text" name="activeInd" placeholder="Active Indicator"><br>
        <input type="text" name="joinDate" placeholder="Join Date"><br>
        <input type="text" name="serviceTypeId" placeholder="Service Type"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
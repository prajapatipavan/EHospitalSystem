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
     FirstName:   <input type="text" name="firstName" placeholder="First Name"><br>
     LastName:   <input type="text" name="lastName" placeholder="Last Name"><br>
     TitalName:   <input type="text" name="titleName" placeholder="Title Name"><br>
     Qualification:  <input type="text" name="qualification" placeholder="Qualification"><br>
     Specialization:   <input type="text" name="specialization" placeholder="Specialization"><br>
     Email:   <input type="text" name="email" placeholder="Email"><br>
     Password:   <input type="password" name="password" placeholder="Password"><br>
     Contact Number:   <input type="text" name="contactNum" placeholder="Contact Number"><br>
     Gender:   <input type="text" name="gender" placeholder="Gender"><br>
      Active Indicator:  <input type="text" name="activeInd" placeholder="Active Indicator"><br>
      Join Date:  <input type="text" name="joinDate" placeholder="Join Date"><br>
     Service Type:   <input type="text" name="serviceTypeId" placeholder="Service Type"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
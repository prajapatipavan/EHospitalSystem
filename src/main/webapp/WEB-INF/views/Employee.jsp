<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                  <h2>Employee Registration</h2>

<form action="saveEmployee" method="post">
   First Name: <input type="text" name="firstName" placeholder="First Name" required>
    <br><br>

 Last Name:  <input type="text" name="lastName" placeholder="Last Name" required>
    <br><br>

  Title:  <input type="text" name="titleName" placeholder="Title">
    <br><br>

  Gender: MALE <input type="radio" name="gender" value="male">
         FEMALE <input type="radio" name="gender" value="female">
    <br><br>
 
   Email: <input type="email" name="email" placeholder="Email" required>
    <br><br>

   Password: <input type="password" name="password" placeholder="Password" required>
    <br><br>

  Date of Joining:  <input type="date" name="dateOfJoining" placeholder="Date of Joining">
    <br><br>

  Qualification:  <input type="text" name="qualification" placeholder="Qualification">
    <br><br>

   Role:
             <select name="roleId">
             
                <option value="-1">----select Role ----</option>
                
                 <c:forEach items="${rolename}" var="r">
                           
                           <option value="${r.roleId}"> ${r.rolename} <option>
                           
                           </c:forEach>  
                
             </select>
    <br><br>

  Aadhar Card Path:  <input type="text" name="aadharCardPath" placeholder="Aadhar Card Path">
    <br><br>

   Pan Card Path: <input type="text" name="panCardPath" placeholder="Pan Card Path">
    <br><br>

   Qualification Doc Path: <input type="text" name="qualificationDocPath" placeholder="Qualification Doc Path">
    <br><br>
    
  Contact Number:  <input type="text" name="contactNum" placeholder="Contact Number"><br><br>

  activeInd:<input type="checkbox" name="activeInd" value="true">
    <br><br>

    
    

    <input type="submit" value="Submit">
</form>
</body>
</html>
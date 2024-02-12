<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            
                 <table border="1">
   
   
    <tr>
        
        <td>firstname</td>
        <td>middlename</td>
        <td>lastname</td>
        <td>email</td>
        <td>password</td>
        <td>gender</td>
        <td>dateOfBirth</td>
        <td>contactNum</td>
        <td>bloodgrp</td>
        <td>address</td>
        <td>referredBy</td>
        <td>country</td>
        <td>city</td>
        <td>state</td>
        <td>pincode</td>
        <td>Diseases</td>
        <td>diabetes</td>
        <td>Registrationtype</td>
        <td>docType</td>
        <td>roleid</td>
        
        </tr>
   
       <c:forEach items="${patient}" var="p">
        
        <tr>
        <td>p.patientId</td>
        <td>p.firstname</td>
        <td>p.middlename</td>
        <td>p.lastname</td>
        <td>p.email</td>
        <td>p.password</td>
        <td>p.gender</td>
        <td>p.dateOfBirth</td>
        <td>p.contactNum</td>
        <td>p.bloodgrp</td>
        <td>p.address</td>
        <td>p.refferdBy</td>
        <td>p.country</td>
        <td>p.city</td>
        <td>p.state</td>
        <td>p.pincode</td>
        <td>p.Diseases</td>
        <td>p.diabetes</td>
        <td>p.Registrationtype</td>
        <td>p.docType</td>
        <td>p.roleid</td>
          

        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
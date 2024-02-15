<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            
                 <table border="1">
   
   
    <tr>
        
     <td>patientId</td>
    <td>firstName</td>
    <td>middleName</td>
    <td>lastName</td>
    <td>email</td>
    <td>password</td>
    <td>gender</td>
    <td>dob</td>
    <td>contactNum</td>
    <td>bloodGrp</td>
    <td>maritialStatus</td>
    <td>address</td>
    <td>refferdBy</td>
    <td>country</td>
    <td>city</td>
    <td>state</td>
    <td>pincode</td>
    <td>diseases</td>
    <td>registrationType</td>
    <td>docType</td>
    <td>remark</td>
    <td>docPath</td>
    <td>roleId</td>
        
        </tr>
   
   <c:forEach items="${patient}" var="p">
        
        <tr>
    <td>${p.patientId}</td>
    <td>${p.firstName}</td>
    <td>${p.middleName}</td>
    <td>${p.lastName}</td>
    <td>${p.email}</td>
    <td>${p.password}</td>
    <td>${p.gender}</td>
    <td>${p.dob}</td>
    <td>${p.contactNum}</td>
    <td>${p.bloodGrp}</td>
    <td>${p.maritialStatus}</td>
    <td>${p.address}</td>
    <td>${p.refferdBy}</td>
    <td>${p.country}</td>
    <td>${p.city}</td>
    <td>${p.state}</td>
    <td>${p.pincode}</td>
    <td>${p.diseases}</td>
    <td>${p.registrationType}</td>
    <td>${p.docType}</td>
    <td>${p.remark}</td>
    <td>${p.docPath}</td>
    <td>${p.roleId}</td> 
    <td><a href="deletepatient?id=${p.patientId}">DELETE</a></td>         

        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
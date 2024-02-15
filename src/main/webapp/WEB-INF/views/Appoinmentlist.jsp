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
              <table border="1">
   
   
    <tr>
        
        
        <td>  appoinmentId </td>
         <td>  doctorId </td>
         <td>  patientId </td>
         <td>  ratelistId </td>
         <td>  appoinmentDate </td>
         <td>  createdDate</td>
         <td>  employeeId </td>
         <td>  appoinmentStatusId </td>
         <td>  Action</td>
         
        
        
        </tr>
   
        <c:forEach items="${appoinment}" var="p">
        
              <tr>
        
        
        <td> ${p.appoinmentId } </td>
         <td> ${p.doctorId } </td>
          <td> ${p.patientId } </td>
           <td> ${p.ratelistId} </td>
            <td> ${p.appoinmentDate} </td>
             <td> ${p.createdDate} </td>
             <td> ${p.employeeId} </td>
             <td> ${p.appoinmentStatusId} </td>
             <td><a href="deleteAppoinment?id=${p.appoinmentId}">DELETE</a></td> 
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
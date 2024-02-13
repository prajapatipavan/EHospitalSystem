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
      
       
        <td>  employeeId </td>
         <td> firstName </td>
         <td> lastName </td>
          <td>  titleName </td>
         <td>  gender </td>
         <td> email </td>
          <td>  password </td>
         <td>  dateOfJoining </td>
         <td> qualification </td>
          <td>  role</td>
         <td> aadharCardPath </td>
         <td> panCardPath </td>
          <td>  qualificationDocPath </td>
         <td> activeInd </td>
          <td>  contactNum</td>
         
        </tr>
   
       <c:forEach items="${employee}" var="p">
        
        <tr>
         <td> ${p.employeeId} </td>
         <td> ${p.firstName } </td>
         <td> ${p.lastName } </td>
         <td> ${p.titleName } </td>
         <td> ${p.gender } </td>
         <td> ${p.email } </td>
         <td> ${p. password} </td>
         <td> ${p.dateOfJoining  } </td>
         <td> ${p.qualification } </td>
         <td> ${p. roleId } </td>
         <td> ${p.aadharCardPath } </td>
         <td> ${p. panCardPath } </td>
         <td> ${p.qualificationDocPath } </td>
         <td> ${p.activeInd } </td>
         <td> ${p.contactNum } </td>
  
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
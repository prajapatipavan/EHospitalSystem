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
        
        <td>  doctorId </td>
         <td>  firstName </td>
         <td> lastName </td>
         <td>  titleName </td>
         <td>  qualification </td>
         <td> specialization </td>
         <td>  email </td>
         <td>  password</td>
         <td> contactNum </td>
         <td>  gender </td>
         <td> activeInd </td>
         <td> joinDate </td>
           <td> serviceType </td>
        
        </tr>
   
       <c:forEach items="${doctor}" var="p">
        
        <tr>
        <td> ${p.doctorId } </td>
         <td> ${p.firstName } </td>
          <td> ${p.lastName } </td>
          
           <td> ${p.titleName } </td>
         <td> ${p.qualification } </td>
          <td> ${p. specialization } </td>
          
           <td> ${p.email } </td>
         <td> ${p.password } </td>
          <td> ${p.contactNum } </td>
          
           <td> ${p.gender } </td>
         <td> ${p.activeInd } </td>
          <td> ${p.joinDate  } </td>
          <td> ${p.serviceType  } </td>
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
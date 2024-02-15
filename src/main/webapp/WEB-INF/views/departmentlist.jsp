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
        
        <td>  departmentId </td>
         <td>  departmentName </td>
         <td> active </td>
          
           <td> ACtion </td>
        
        </tr>
   
       <c:forEach items="${depart}" var="p">
        
        <tr>
        <td> ${p.departmentId } </td>
         <td> ${p.departmentName } </td>
          <td> ${p.active } </td>
          <td><a href="deletedepartment?id=${p.departmentId}">DELETE</a></td>
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
 
</body>
</html>
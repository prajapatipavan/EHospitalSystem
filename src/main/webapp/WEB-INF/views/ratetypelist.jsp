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
        
        <td>  ratetypeId </td>
         <td>  type </td>
        
        
        </tr>
   
       <c:forEach items="${ratetype}" var="p">
        
        <tr>
        <td> ${p.ratetypeId } </td>
         <td> ${p.type } </td>
         <td><a href="deleteratetype?id=${p.ratetypeId}">DELETE</a></td>
         
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
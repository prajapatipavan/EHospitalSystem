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
        
        <td>packageiteamId</td>
         <td> packageId </td>
         <td>itemId </td>
        
   </tr>
   
       <c:forEach items="${piteam}" var="p">
        
        <tr>
        <td> ${p.packageiteamId} </td>
         <td> ${p.packageId} </td>
          <td> ${p.itemId} </td>
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
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
        
        <td>ratelistId</td>
        <td>name</td>
        <td>amount</td>
        <td>ratetypeId</td>
        <td>departmentid</td>
        
        </tr>
   
       <c:forEach items="${ratelist}" var="p">
        
        <tr>
        <td>p.ratelistId</td>
        <td>p.name</td>
        <td>p.amount</td>
        <td>p.ratetypeId</td>
        <td>p.departmentid</td>
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
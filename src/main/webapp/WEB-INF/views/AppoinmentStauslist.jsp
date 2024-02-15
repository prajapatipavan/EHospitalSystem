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
        
       
        <td>  appoinmentStatusId </td>
        <td>  statusName </td>
          <td>  ACTION </td>
        
        
        </tr>
   
        <c:forEach items="${apstatus}" var="p">
        
              <tr>
        
        <td> ${p.appoinmentStatusId } </td>
        <td> ${p.statusName } </td>
        <td><a href="deleteappoinmentstatus?id=${p.appoinmentStatusId}">DELETE</a></td>
        
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
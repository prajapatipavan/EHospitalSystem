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
   
     <thead>
    <tr>
       
       
        <td>  appoinmentStatusId </td>
        <td>  statusName </td>
          <td>  ACTION </td>
     
        
        </tr>
        
           </thead>
   
        <c:forEach items="${apstatus}" var="p">
        
        <tbody>
        
              <tr>
        
        <td> ${p.appoinmentStatusId } </td>
        <td> ${p.statusName } </td>
        <td><a href="deleteappoinmentstatus?id=${p.appoinmentStatusId}">DELETE</a></td>
        
        
        </tr>
        </tbody>
        
        </c:forEach>
     
     </table>
</body>
</html>
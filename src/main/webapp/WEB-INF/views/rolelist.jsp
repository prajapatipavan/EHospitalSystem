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

  <h1>role</h1>
  
                
                 <table border="1">
   
   
    <tr>
        
        <td>  roleId </td>
         <td> rolename </td>
         
        
        </tr>
   
       <c:forEach items="${roles}" var="p">
        
        <tr>
        <td> ${p.roleId } </td>
         <td> ${p.rolename} </td>
        <td><a href="deleterole?id=${p.roleId}">DELETE</a></td>
          
           
        
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
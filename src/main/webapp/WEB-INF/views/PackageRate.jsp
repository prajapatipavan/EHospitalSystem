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

         <form action="savepackageratelist" method="post">
      
    
        
         rateList:<input type="text" name="ratelistId"> 
         
         
         
          package:
         
         <select name="packageId">
        
                <option value="-1">----select Package Name----</option>
                
                 <c:forEach items="${pName}" var="r">
                           
                           <option value="${r.packageId}"> ${r.name} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
         iteam:
         
         <select name="ratelistId">
        
                <option value="-1">----select RateList Name----</option>
                
                 <c:forEach items="${rName}" var="i">
                           
                           <option value="${ratelistId}"> ${i.name} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
         
         <input type="submit">
      
      
      </form>
</body>
</html> 
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
    
          <h1>Add Package</h1>
    <form action="savePackage" method="post">
        Package Name: <input type="text" name="name"><br><br>
        Amount:<input type="text" name="amount"><br><br>
        Rate Type: <select name="ratetypeId">
        
                <option value="-1">----select Rate Type----</option>
                
                 <c:forEach items="${ratetype}" var="r">
                           
                           <option value="${r.ratetypeId}"> ${r.type} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        Package Type: <input type="text" name="packageType"><br><br>
        <input type="submit" value="Submit">
    </form>
    
</body>
</html>
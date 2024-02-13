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
        <h1>Add Doctor Document</h1>
    <form action="addDoctorDocument" method="post">
        <label for="documentName">Document Name:</label><br>
        <input type="text" id="documentName" name="documentName"><br>
        
        <label for="doctorId">Doctor Name:</label><br>
       
        <select name="doctorId">
        
                <option value="-1">----select Doctor Name----</option>
                
                 <c:forEach items="${dname}" var="r">
                           
                           <option value="${r.doctorId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
        <label for="documentPath">Document Path:</label><br>
        <input type="text" id="documentPath" name="documentPath"><br>
        
        <input type="submit" value="Submit">
        
        
    </form>
</body>
</html>
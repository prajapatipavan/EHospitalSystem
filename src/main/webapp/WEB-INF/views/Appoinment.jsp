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
                   <h2>Appointment Form</h2>
    <form action="saveappointment" method="post">
        Doctor : 
        
             <select name="doctorId">
        
                <option value="-1">----select Doctor Name----</option>
                
                 <c:forEach items="${dname}" var="r">
                           
                           <option value="${r.doctorId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
        
        Patient : 
        
        <select name="patientId">
        
                <option value="-1">----select Patient Name----</option>
                
                 <c:forEach items="${pname}" var="r">
                           
                           <option value="${r.patientId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        Rate List : 
        
        <select name="ratelistId">
        
                <option value="-1">----select RateList Name----</option>
                
                 <c:forEach items="${ratelistname}" var="r">
                           
                           <option value="${r.ratelistId}"> ${r.name} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
        
        Appointment Date: <input type="text" name="appoinmentDate"><br>
        Created Date: <input type="text" name="createdDate"><br>
        Created BY Employee Name: <input type="text" name="employeeId"><br>
        
         <select name="employeeId">
        
                <option value="-1">----select Employee Name----</option>
                
                 <c:forEach items="${eName}" var="r">
                           
                           <option value="${r.employeeId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
                </select><br><br>
        
        
        Appointment Status : <input type="text" name="appoinmentStatusId"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
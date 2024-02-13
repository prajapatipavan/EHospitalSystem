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
 
   <form action="ratelists" method="post">
              
                  Name:<input type="text" name="name">
                   Amount:<input type="text" name="amount">
                   RateType:<select name="ratetypeId">
                   
                    <option value="-1">------select RateType-------- <option>
                           <c:forEach items="${ratetype}" var="r">
                           
                           <option value="${r.ratetypeId}"> ${r.type} <option>
                           
                           </c:forEach>   
                   
                             </select>
              
               <input type="submit" >
               
              </form>
                   
</body>
</html>
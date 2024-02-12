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
        
         <td>  itemId </td>
         <td>  materialId </td>
         <td> MaterialGroupName </td>
         <td>  itemCode </td>
         <td>  itemName </td>
         <td> alternateName </td>
         <td>  shortName </td>
         <td>  gstRate </td>
         <td> HsnCode </td>
          <td> price </td>
        
        </tr>
   
       <c:forEach items="${iteam}" var="p">
        
        <tr>
        <td> ${p.itemId} </td>
         <td> ${p.materialId } </td>
          <td> ${p.MaterialGroupName} </td>
          <td> ${p.itemCode } </td>
         <td> ${p.itemName } </td>
          <td> ${p.alternateName } </td>
          <td> ${p.shortName } </td>
         <td> ${p.gstRate  } </td>
          <td> ${p. HsnCode } </td>
          <td> ${p.price} </td>
         
          
           
    
        </tr>
        
        </c:forEach>
     
     </table>
</body>
</html>
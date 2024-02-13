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
         <h1>Add Item</h1>
    <form action="addItem" method="post">
      MaterialGroupName:  <input type="text" name="materialgName"><br><br>
      
      MaterialNAME:<select name="materialId">
        
                <option value="-1">----select Material NAme----</option>
                
                 <c:forEach items="${materialName}" var="r">
                           
                           <option value="${r.materialId}"> ${r.materialName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
      
       
       ItemCode: <input type="text" name="itemCode" ><br><br> 
      ItemName:  <input type="text" name="itemName" ><br><br> 
       AlternateName: <input type="text" name="alternateName"><br><br> 
      ShortName:  <input type="text" name="shortName" ><br><br> 
      GstRate:  <input type="text" name="gstRate" ><br><br> 
      HsnCode : <input type="text" name="hsnCode" ><br>
       Price: <input type="text" name="price"><br><br> 
        <input type="submit" value="Submit">
    </form>
</body>
</html>
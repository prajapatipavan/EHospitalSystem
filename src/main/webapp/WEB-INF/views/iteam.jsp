<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h1>Add Item</h1>
    <form action="addItem" method="post">
      MaterialGroupName:  <input type="text" name="materialGroupName"><br>
      MaterialId:  <input type="text" name="materialId"><br>
       ItemCode: <input type="text" name="itemCode" ><br>
      ItemName:  <input type="text" name="itemName" ><br>
       AlternateName: <input type="text" name="alternateName"><br>
      ShortName:  <input type="text" name="shortName" ><br>
      GstRate:  <input type="text" name="gstRate" ><br>
      HsnCode : <input type="text" name="hsnCode" ><br>
       Price: <input type="text" name="price"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
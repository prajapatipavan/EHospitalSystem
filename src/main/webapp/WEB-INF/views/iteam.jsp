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
        <input type="text" name="materialGroupName" value="PHARMACY"><br>
        <input type="text" name="materialId"><br>
        <input type="text" name="itemCode" value="ITEM_06930"><br>
        <input type="text" name="itemName" value="OLOPAT MAX Eye Drop"><br>
        <input type="text" name="alternateName"><br>
        <input type="text" name="shortName" value="Olopatadine 0.7"><br>
        <input type="text" name="gstRate" value="0%"><br>
        <input type="text" name="hsnCode" value="30042039"><br>
        <input type="text" name="price" value="1000"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
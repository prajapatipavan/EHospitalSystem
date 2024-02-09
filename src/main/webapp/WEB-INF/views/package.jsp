<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
          <h1>Add Package</h1>
    <form action="savePackage" method="post">
        Package Name: <input type="text" name="packageName"><br>
        Amount:<input type="text" name="amount"><br>
        Rate Type: <input type="text" name="rateTypeId"><br>
        Package Type: <input type="text" name="packageType"><br>
        <input type="submit" value="Submit">
    </form>
    
</body>
</html>
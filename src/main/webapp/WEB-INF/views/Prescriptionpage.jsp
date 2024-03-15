<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Prescription</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        label {
            font-weight: bold;
        }
        input[type="text"],
        textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="text-center">Create Prescription</h2>
    <form action="savePrescription" method="post">
        <div class="form-group">
            <label for="patientName">Patient Name:</label>
             <select name="appoinmentId" class="form-group">
        
                <option value="z">----select Patient Id----</option>
                  
                
                 <c:forEach items="${appoinment}" var="r">
                           
                       <option value="${r.appoinmentId}"> ${r.patientId} <option>
                         
                    
                 </c:forEach>  
 
                </select><br><br>
        </div>
        <div class="form-group">
            <label for="medicine">Medicine:</label>
            <input type="text" id="medicine" name="medicine" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="dosage">Dosage:</label>
            <input type="text" id="dosage" name="dosage" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="instructions">Instructions:</label>
            <textarea id="instructions" name="instructions" class="form-control" rows="3" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Create Prescription</button>
    </form>
</div>

<!-- Bootstrap JS (optional, for Bootstrap components that require JavaScript) -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

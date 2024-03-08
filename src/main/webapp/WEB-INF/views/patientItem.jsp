<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Record</title>
<!-- Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        padding: 20px;
    }
    form {
        max-width: 400px;
        margin: 0 auto;
    }
    label {
        margin-bottom: 0.5rem;
    }
    input[type="text"],
    input[type="number"],
    select {
        width: 100%;
        padding: 0.375rem 0.75rem;
        font-size: 1rem;
        line-height: 1.5;
        color: #495057;
        background-color: #fff;
        background-clip: padding-box;
        border: 1px solid #ced4da;
        border-radius: 0.25rem;
        transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
    }
    input[type="submit"] {
        width: 100%;
        padding: 0.75rem 1.5rem;
        font-size: 1rem;
        font-weight: 400;
        line-height: 1.5;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        cursor: pointer;
        background-color: #007bff;
        border: 1px solid transparent;
        border-radius: 0.25rem;
        color: #fff;
        transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
    }
</style>
</head>
<body>

<div class="container">
   <center> <h2 class="mt-4">Add Patient_Item</h2></center>
    <form action="savepatientiem" method="post" id="patientItemForm">
        <div class="form-group">
            <label for="patientId">Patient:</label>
            <select class="form-control" name="patientId" id="patientId">
                <option value="-1">----Patient----</option>
                <c:forEach items="${patient}" var="p">
                    <option value="${p.patientId}">${p.firstName} ${p.lastName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="itemId">Item:</label>
            <select class="form-control" name="itemId" id="itemId">
                <option value="-1">----Items----</option>
                <c:forEach items="${item}" var="p">
                    <option value="${p.itemId}">${p.materialgName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="date">Date:</label>
            <input type="date" class="form-control" id="date" name="date">
        </div>
        <div class="form-group">
            <label for="price">Price:</label>
            <input type="text" class="form-control" id="price" name="price" oninput="calculateTotal()">
        </div>
        <div class="form-group">
            <label for="qty">Quantity:</label>
            <input type="text" class="form-control" id="qty" name="qty" oninput="calculateTotal()">
        </div>
        <div class="form-group">
            <label for="totalPrice">Total Price:</label>
            <input type="text" class="form-control" id="totalPrice" name="totalPrice" readonly>
        </div>
        <input type="submit" class="btn btn-primary" value="Add PatientIteam" onclick="calculateTotal()">
    </form>
</div>

<script>
function calculateTotal() {
    var price = document.getElementById("price").value;
    var qty = document.getElementById("qty").value;
    var totalPrice = price * qty;
    document.getElementById("totalPrice").value = totalPrice.toFixed(1);
}
</script>

</body>
</html>

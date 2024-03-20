<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment Success</title>
 <link rel="stylesheet" type="text/css" href="css11.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 0;
    }

    .container {
        max-width: 600px;
        margin: 20px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
        text-align: center;
        color: #4CAF50;
    }

    .patient-details {
        margin-bottom: 20px;
    }

    .patient-details h2 {
        margin-bottom: 10px;
        color: #333;
    }

    .receipt {
        border-collapse: collapse;
        width: 100%;
    }

    .receipt th, .receipt td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }

    .receipt th {
        background-color: #f2f2f2;
    }

    .total {
        font-weight: bold;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Payment Successful</h1>
    <div class="patient-details">
        <h2>Patient Details</h2>
        <p><strong>Patient ID:</strong>${patients.patientId}</p>
        <p><strong>Name:</strong>${patients.firstName}${patients.lastName} </p>
        <p><strong>Gender:</strong>${patients.gender}</p>
        <p><strong>Date of Birth:</strong>${patients.dob}</p>
        <p><strong>Email:</strong> ${patients.email}</p>
    </div>
    
        
    
  
   
    
    
      
    <table class="receipt">
        <thead>
            <tr>
                <th>Date</th>
                <th>Description</th>
                <th>Amount</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                 <td></td>
                <td>Amount</td>
                <td id="amount"></td>
                
            </tr>
            <tr>
                <td></td>
                <td>Discount</td>
                <td id="discount"> </td>
            </tr>
           
            <tr class="total">
                <td> ${dates.date} </td>
                <td>Total</td>
                <td  id="actualAmount"></td>
            </tr>
        </tbody>
    </table>
</div>

<script>

              let amount = parseInt(sessionStorage.getItem('amount'));
              let discount = parseInt(sessionStorage.getItem('discount'));
             let actualAmount = parseInt(sessionStorage.getItem('actualAmount'));
              
               
      	 	


                    document.getElementById('amount').innerText = amount;
                    document.getElementById('discount').innerText = discount;
                    document.getElementById('actualAmount').innerText = actualAmount;

        
    </script>
</body>
</html>
    
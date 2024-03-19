<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment Page</title>
     <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
           
        }

        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
        }

        input[type="text"],
        select,
        input[type="submit"],
         input[type="date"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        select {
           
           
           /* background: url('down-arrow.png') no-repeat right;*/ /* Replace 'down-arrow.png' with your arrow image */
             /* Adjust the padding to fit the arrow image */
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Payment Page</h1>
        <form action="processPayment?id=${patients.patientId}" method="post">
           
            <div class="form-group">
                <label for="patientId">Patient ID:</label>
                <input type="text" id="patientId" name="patientId" value="${patients.patientId}">
            </div>
             <div class="form-group">
                <label for="patientId">Patient Name:</label>
                <input type="text" id="patient" name="patientName" value="${patients.firstName}">
            </div>
            <div class="form-group">
                <label for="amount">DATE:</label>
                <input type="date" id="date" name="date" >
            </div>
            
              <div class="form-group">
                <label for="ratelistId">Rate List:</label>
                <select id="ratelistId" name="ratelistId">
                    <option value="-1">---Rate List Item---</option>
                    
                     <c:forEach items="${ratelist}" var="p">
                     
                          <option value="${p.ratelistId}">${p.name}</option> 
                     
                     
                     </c:forEach>
                   
                </select>
            </div>
            
             <div class="form-group">
                <label for="Payments">Payments:</label>
                <select id="Paymets" name="paymetType">
                    <option value="-1">---Type Of Payments---</option>
                    
                    
                     
                          <option value="cash">CASH</option> 
                           <option value="upi">UPI</option> 
                            <option value="card">Debit card </option> 
                     
                     
                   
                   
                </select>
            </div>
            <div class="form-group">
                <label for="amount">Amount:</label>
                <input type="text" id="amount" name="amount" oninput="calculateTotal()">
            </div>
           
            <div class="form-group">
                <label for="discount">Discount:</label>
               <input type="text" id="discount" name="discount" oninput="calculateTotal()">
            </div>
            <div class="form-group">
                <label for="actualAmount">Actual Amount:</label>
              <input type="text" id="actualAmount" name="actualAmount" readonly>
                
            </div>
            <div class="form-group">
                <label for="reasonDiscount">Reason for Discount:</label>
                <input type="text" id="reasonDiscount" name="reasonDiscount" >
            </div>
            <div class="form-group">
               <input type="submit" value="Submit">
            </div>
        </form>
    </div>
    
    <script type="text/javascript">
    
    function calculateTotal() {
 
          
          
          
          let amount  = parseInt(document.getElementById('amount').value);
          let discount =   parseInt(document.getElementById('discount').value);
     	 	   let actualAmount = amount - discount;
     	 	   
     	 	 document.getElementById('actualAmount').value =actualAmount;  
     	 	
     	 	 sessionStorage.setItem('amount', amount);
     	 	sessionStorage.setItem('discount', discount);
     	 	sessionStorage.setItem('actualAmount', actualAmount);
     	 	
     	 		        
    }
    
    </script>
    
</body>
</html>

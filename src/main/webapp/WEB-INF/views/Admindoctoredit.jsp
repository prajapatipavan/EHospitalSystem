<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Doctor</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
    }

    .container {
      max-width: 800px;
      margin: 50px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    .form-group {
      margin-bottom: 20px;
    }

    label {
      font-weight: bold;
    }

    input[type="text"],
    input[type="password"],
    select,
    input[type="email"],
    input[type="date"] {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    /* Style for the checkbox */
    .custom-checkbox {
      display: inline-block;
      position: relative;
      padding-left: 25px;
      margin-bottom: 0;
      cursor: pointer;
      font-size: 18px;
    }

    .custom-checkbox input[type="checkbox"] {
      position: absolute;
      opacity: 0;
      cursor: pointer;
      height: 0;
      width: 0;
    }

    .checkmark {
      position: absolute;
      top: 0;
      left: 0;
      height: 20px;
      width: 20px;
      background-color: #fff;
      border: 1px solid #ccc;
      border-radius: 3px;
    }

    .custom-checkbox input[type="checkbox"]:checked + .checkmark {
      background-color: #007bff;
    }

    .checkmark:after {
      content: "";
      position: absolute;
      display: none;
    }

    .custom-checkbox input[type="checkbox"]:checked + .checkmark:after {
      display: block;
    }

    .custom-checkbox .checkmark:after {
      left: 7px;
      top: 3px;
      width: 5px;
      height: 10px;
      border: solid white;
      border-width: 0 3px 3px 0;
      transform: rotate(45deg);
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
  <h2 class="text-center">Edit Doctor</h2>
   <form action="addDoctors" method="post">
    <div class="row">
      <div class="col-md-6">
        <div class="form-group">
          <label for="firstName">First Name:</label>
          <input type="text" id="firstName" name="firstName" value="${doctors.firstName}">
        </div>
      </div>
      <div class="col-md-6">
        <div class="form-group">
          <label for="lastName">Last Name:</label>
          <input type="text" id="lastName" name="lastName" value="${doctors.lastName}">
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6">
        <div class="form-group">
          <label for="titleName">Title Name:</label>
          <input type="text" id="titleName" name="titleName" value="${doctors.titleName}">
        </div>
      </div>
      <div class="col-md-6">
        <div class="form-group">
          <label for="qualification">Qualification:</label>
          <input type="text" id="qualification" name="qualification" value="${doctors.qualification}">
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6">
        <div class="form-group">
          <label for="specialization">Specialization:</label>
          <input type="text" id="specialization" name="specialization" value="${doctors.specialization}">
        </div>
      </div>
      <div class="col-md-6">
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" value="${doctors.email}" >
        </div>
      </div>
    </div>

    <div class="row">
       <div class="col-md-6">
        <div class="form-group">
          <label for="joinDate">Join Date:</label>
          <input type="date" id="joinDate" name="joinDate" value="${doctors.joinDate}">
        </div>
      </div>
      <div class="col-md-6">
        <div class="form-group">
          <label for="contactNum">Contact Number:</label>
          <input type="text" id="contactNum" name="contactNum" value="${doctors.contactNum}">
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6">
        <div class="form-group">
          <label for="gender">Gender:</label>
          <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
          </select>
        </div>
      </div>
      <div class="col-md-6">
        <div class="form-group">
          <label for="serviceTypeId">Service Type:</label>
            <select name="serviceTypeId">
        
                <option value="-1">----select Service Type----</option>
                
                 <c:forEach items="${servicetype}" var="r">
                           
                           <option value="${r.serviceTypeId}" ${r.serviceTypeId == doctors.serviceTypeId?"selected":""} > ${r.type} <option>
                           
                           </c:forEach>  
        
                </select><br><br>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6">
        <div class="form-group">
          <label for="activeInd">Active:</label>
          <label class="custom-checkbox">
            <input type="checkbox" id="activeInd" name="activeInd" value="${doctors.activeInd}" >
            <span class="checkmark"></span>
          </label>
        </div>
      </div>
     
    </div>

    <button type="submit">Update Doctor</button>
  </form>
</div>

<!-- Bootstrap JS (optional, for Bootstrap components that require JavaScript) -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

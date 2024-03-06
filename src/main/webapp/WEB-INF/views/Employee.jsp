<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
</head>
<body>
                 <div class="page-wrapper">
            <div class="content">
                <div class="row">
                   
                   
                </div>
                <div class="row">
                    <div class="col-lg-8 offset-lg-2">
                        <h1>Add Employee</h1>
                        
                        <form action="saveEmployee" method="post">
   First Name: <input type="text" name="firstName" class="form-control"  placeholder="First Name" required>
    

 Last Name:  <input type="text" name="lastName" class="form-control"  placeholder="Last Name" required>
    

  Title:  <input type="text" name="titleName" class="form-control"  placeholder="Title">

  Gender: MALE <input type="radio" name="gender" value="male">
         FEMALE <input type="radio" name="gender" value="female">
    
 
   Email: <input type="email" name="email"  class="form-control" placeholder="Email" required>
    

   Password: <input type="password" name="password" class="form-control"  placeholder="Password" required>
    

  Date of Joining:  <input type="date" name="dateOfJoining" class="form-control"  placeholder="Date of Joining">
    

  Qualification:  <input type="text" name="qualification"  class="form-control"  placeholder="Qualification">
    

   Role:
             <select name="roleId" class="select">
             
                <option value="-1">----select Role ----</option>
                
                 <c:forEach items="${rolename}" var="r">
                           
                           <option value="${r.roleId}"> ${r.rolename} <option>
                           
                           </c:forEach>  
                
             </select>
    

  Aadhar Card Path:  <input type="text" class="form-control"  name="aadharCardPath" placeholder="Aadhar Card Path">
    

   Pan Card Path: <input type="text" class="form-control"  name="panCardPath" placeholder="Pan Card Path">
    

   Qualification Doc Path: <input type="text" class="form-control"  name="qualificationDocPath" placeholder="Qualification Doc Path">
    
    
  Contact Number:  <input type="text" class="form-control"  name="contactNum" placeholder="Contact Number"><br><br>

  activeInd:<br><input type="checkbox"  name="activeInd" value="true">
    

    
    <div class="m-t-20 text-center">
                                <button type="submit" class="btn btn-primary submit-btn">ADD Employee</button>
                            </div>   

 
</form>
   
                    </div>
                </div>
            </div>
			        </div>
   
    <div class="sidebar-overlay" data-reff=""></div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/select2.min.js"></script>
	<script src="assets/js/moment.min.js"></script>
	<script src="assets/js/bootstrap-datetimepicker.min.js"></script>
    <script src="assets/js/app.js"></script>
	<script>
            $(function () {
                $('#datetimepicker3').datetimepicker({
                    format: 'LT'

                });
            });
     </script>
</body>


<!-- add-appointment24:07-->
</html>
                
</body>
</html>
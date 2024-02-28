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
                    <div class="col-lg-8 offset-lg-2">
                        <h4 class="page-title">Add Appointment</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 offset-lg-2">
                        <form action="saveappointment" method="post">
                            Doctor : 
        
             <select name="doctorId" class="select">
        
                <option value="z">----select Doctor Name----</option>
                  
                
                 <c:forEach items="${dname}" var="r">
                           
                           <option value="${r.doctorId}"> ${r.firstName} <option>
                         
                           
                           </c:forEach>  
 
                </select><br><br>
        
        
        Patient : 
        
        <select name="patientId" class="select">
        
                <option value="-1">----select Patient Name----</option>
                
                 <c:forEach items="${pname}" var="r">
                           
                           <option value="${r.patientId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        Rate List : 
        
        <select name="ratelistId" class="select">
        
                <option value="-1">----select RateList Name----</option>
                
                 <c:forEach items="${ratelistname}" var="r">
                           
                           <option value="${r.ratelistId}"> ${r.name} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
        
        Appointment Date: <input type="text" class="form-control" name="appoinmentDate"><br>
        Created Date: <input type="text"  class="form-control" name="createdDate"><br>
        Created BY Employee Name: <input type="text" class="form-control" name="employeeId"><br>
        
         <select name="employeeId" class="select">
        
                <option value="-1">----select Employee Name----</option>
                
                 <c:forEach items="${eName}" var="r">
                           
                           <option value="${r.employeeId}"> ${r.firstName} <option>
                           
                           </c:forEach>  
        
                </select><br><br>
                
                 <div class="m-t-20 text-center">
                                <button type="submit" class="btn btn-primary submit-btn">Create Appointment</button>
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
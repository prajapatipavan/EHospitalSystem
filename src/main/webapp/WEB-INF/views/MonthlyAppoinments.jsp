<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">



<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>EHOSPITALSYSTEM</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
     <link rel="stylesheet" type="text/css" href="css11.css">
 
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>

</head>

<body>
    <div class="main-wrapper">
  
      
     <%@include file="Clerknavbar.jsp" %>
      
      <jsp:include page="Clerksidebar.jsp"></jsp:include>
      
      
        <div class="page-wrapper">
            <div class="content">
            
            <div class="col-sm-14 col-18 text-right m-b-90">
             
            </div>
            
            <h4>Monthly APPOINMENTS</h4>
            
                <table border="1"  class="table table-striped table-hover">
   
   
    <tr>
         <td>  appoinmentId </td>
         <td>  doctorId </td>
         <td>  patientId </td>
         <td> ratelistId </td>
         <td>  appoinmentDate </td>
         <td>  createdDate </td>
         <td> employeeId </td>
         <td>  appoinmentStatusId </td>
          <td>  Action </td>
       
        
        </tr>
   
       <c:forEach items="${appoinmentlist}" var="p">
        
        <tr>
                             <td>${p.appoinmentId}</td>
                           
                             <td>${p.firstName1} ${p.lastName}</td>
								<td>${p.firstName}</td>
								<td>${p.name}</td>
								<td>${p.appoinmentDate}</td>
								<td>${p.createdDate}</td>
          <td> ${p.appoinmentStatusId } </td>
        
          <td><a href="deleteAppoinmentMontly?id=${p.appoinmentId}">DELETE</a></td>
         
          
           
    
        </tr>
        
        </c:forEach>
     
     </table>

            
        
                </div>
				
				<div class="row">
					<div class="col-12 col-md-6 col-lg-8 col-xl-8">
						<div class="card">
							
							<div class="card-body p-0">
								<div class="table-responsive">
									
								</div>
							</div>
						</div>
					</div>
                    <div class="col-12 col-md-6 col-lg-4 col-xl-4">
                     
				</div>
				<div class="row">
					<div class="col-12 col-md-6 col-lg-8 col-xl-8">
						<div class="card">
							
							
								</div>
							</div>
						</div>
					</div>
					
				</div>
            </div>
           
        </div>
   
    <div class="sidebar-overlay" data-reff=""></div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/Chart.bundle.js"></script>
    <script src="assets/js/chart.js"></script>
    <script src="assets/js/app.js"></script>

</body>



</html>
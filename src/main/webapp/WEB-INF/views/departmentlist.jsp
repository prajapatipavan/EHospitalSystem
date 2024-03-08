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
 
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>

</head>

<body>
    <div class="main-wrapper">
      
   <c:if test="${!empty doctor}">
      
      <jsp:include page="AdminNavbar.jsp"></jsp:include>
      
      </c:if>
      
      <c:if test="${!empty clerk}">
      
      <jsp:include page="Clerknavbar.jsp"></jsp:include>
      
      </c:if>
      
  <c:if test="${!empty doctor}">
      
      <jsp:include page="AdminSidebar.jsp"></jsp:include>
      
      </c:if>
      
      <c:if test="${!empty clerk}">
      
      <jsp:include page="Clerksidebar.jsp"></jsp:include>
      
      </c:if>
      
      
        <div class="page-wrapper">
            <div class="content">
            
            <div class="col-sm-14 col-18 text-right m-b-90">
             <a href="department" class="btn btn-primary btn-rounded float-right" ><i class="fa fa-plus"></i> Add Department</a>
            </div>
            
            <h4>DEPARTMENTS</h4>
            
            
                     <table border="2"  class="table table-striped table-hover">
                     
                     
           <thead>           
   
   
    <tr>
        
        <td>  DepartmentId </td>
         <td>  DepartmentName </td>
         <td> active </td>
          
           <td> ACtion </td>
        
        </tr>
        
        </thead>
   
       <c:forEach items="${depart}" var="p">
       
       
       <tbody>
        
        <tr>
        <td> ${p.departmentId } </td>
         <td> ${p.departmentName } </td>
         
         <td>
           <c:if test="${p.active==false}">

	        <span class="custom-badge status-red">Inactive</span>
	        
           </c:if>
           
            <c:if test="${p.active==true}">

	        <span class="custom-badge status-green">Active</span>
	        
           </c:if>
          
          </td>
          <td><a href="deletedepartment?id=${p.departmentId}">DELETE</a></td>
          
           
        
        </tr>
        
        </tbody>
        
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
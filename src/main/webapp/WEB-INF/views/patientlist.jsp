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
		
		<style>
		
		    .scroll{
		    
		          overflow-y:scroll;
		    
		    }
		
		</style>

</head>

<body>
    <div class="main-wrapper">
      
      <jsp:include page="AdminNavbar.jsp"></jsp:include>
      
      <jsp:include page="AdminSidebar.jsp"></jsp:include>
      
        <div class="page-wrapper">
            <div class="content">
                <div class="row" >
                    
                  
                  <div class="scroll">
                  
                   <table border="1"  class="table table-striped table-hover">
   
   
    <tr>
 
     <td>patientId</td>
    <td>firstName</td>
    <td>middleName</td>
    <td>lastName</td>
    <td>email</td>
    <td>password</td>
    <td>gender</td>
    <td>dob</td>
    <td>contactNum</td>
    <td>bloodGrp</td>
    <td>maritialStatus</td>
    <td>address</td>
    <td>refferdBy</td>
    <td>country</td>
    <td>city</td>
    <td>state</td>
    <td>pincode</td>
    <td>diseases</td>
    <td>registrationType</td>
    <td>docType</td>
 
    <td>docPath</td>
    <td>roleId</td>
        
        </tr>
   
   <c:forEach items="${patient}" var="p">
        
        <tr>
    <td>${p.patientId}</td>
    <td>${p.firstName}</td>
    <td>${p.middleName}</td>
    <td>${p.lastName}</td>
    <td>${p.email}</td>
    <td>${p.password}</td>
    <td>${p.gender}</td>
    <td>${p.dob}</td>
    <td>${p.contactNum}</td>
    <td>${p.bloodGrp}</td>
    <td>${p.maritialStatus}</td>
    <td>${p.address}</td>
    <td>${p.refferdBy}</td>
    <td>${p.country}</td>
    <td>${p.city}</td>
    <td>${p.state}</td>
    <td>${p.pincode}</td>
    <td>${p.diseases}</td>
    <td>${p.registrationType}</td>
    <td>${p.docType}</td>
  
    <td>${p.docPath}</td>
    <td>${p.roleId}</td> 
    <td><a href="deletepatient?id=${p.patientId}">DELETE</a></td>         

        </tr>
        
        </c:forEach>
     
     </table>
     </div>
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
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
 
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		
		<style>
		
		    
		         table.center {
                  margin-left: auto;
                  margin-right: auto;
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
                    
                  
                  <div >
                  
                   <table border="4"  class="table table-striped table-hover" class="center">
   
   
    <tr>
 
     <td>PatientId</td>
    <td>FirstName</td>
    <td>MiddleName</td>
    <td>LastName</td>
    <td>Email</td>
    <td>Mobile No</td>
    <td>ACTION</td>
    <td>STATUS</td>
   
    
        
        </tr>
   
   <c:forEach items="${patient}" var="p">
        
        <tr>
    <td>${p.patientId}</td>
    <td>${p.firstName}</td>
    <td>${p.middleName}</td>
    <td>${p.lastName}</td>
    <td>${p.email}</td>
    <td>${p.contactNum}</td>
   
    <td><a href="deletepatient?id=${p.patientId}" class="btn btn-danger">DELETE</a> |
          
   <a href="viewpatient?id=${p.patientId}" class="btn btn-primary">Profile</a></td>    
   
  
   
   
    <td> 
    
   
      <a> <button id="myButton" class="btn btn-secondary">Waiting</button></a> 
 
    
    </td>

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
     <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   
   
    <script>
        // JavaScript to change button color and text permanently
        document.getElementById('myButton').addEventListener('click', function() {
            // Add the 'btn-success' class to change color
            this.classList.add('btn-success');
            // Change the button text to 'Clicked!'
            this.innerHTML = 'onProgress!';
            // Disable the button to prevent further clicks
            this.disabled = true;
        });
    </script>
    
    
    
   

</body>



</html>
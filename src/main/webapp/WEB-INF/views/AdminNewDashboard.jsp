<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
        <%@include file="AdminNewnavbar.jsp" %>
        <jsp:include page="AdminNewsidebar.jsp"></jsp:include>
        <div class="page-wrapper">
            <div class="content">
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <a href="Admindoctor">
                            <div class="dash-widget">
                                <span class="dash-widget-bg1"><i class="fa fa-stethoscope" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${doctor.size() }</h3>
                                    <span class="widget-title1">Doctors <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <a href="Adminpatients">
                            <div class="dash-widget">
                                <span class="dash-widget-bg2"><i class="fa fa-user-o"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${patients.size()}</h3>
                                    <span class="widget-title2">Patients<i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <a href="Adminpharmacist">
                            <div class="dash-widget">
                                <span class="dash-widget-bg3"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${pharmacist.size()}</h3>
                                    <span class="widget-title3">Pharmacists<i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <a href="AdminPayments">
                            <div class="dash-widget">
                                <span class="dash-widget-bg4"><i class="fa fa-money" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${paymets.size()}</h3>
                                    <span class="widget-title4">Payments<i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <a href="Adminitems">
                            <div class="dash-widget">
                                <span class="dash-widget-bg4"><i class="fa fa-list-alt" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${items.size()}</h3>
                                    <span class="widget-title4">Items<i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-5 col-lg-6 col-xl-6">
                        <div class="chart">
                            <canvas id="myChart1"></canvas> <!-- Unique id for the first chart -->
                        </div>
                    </div>
                    <div class="col-12 col-md-5 col-lg-6 col-xl-6">
                        <div class="chart">
                            <canvas id="myChart2"></canvas> <!-- Unique id for the second chart -->
                        </div>
                    </div>
                    
                  
                </div>
                
                
                
               <hr>
               
               
                 
            
            <h4> NEW Patient</h4>
            
            <div class="col-md-4 col-sm-4 col-lg-4 col-xl-3">   
        
                   <table border="4"  id="listtable"  class="table table-striped table-hover" class="center">
      <thead>
   
    <tr>
 
     
    <td>FirstName</td>
    <td>MiddleName</td>
    <td>LastName</td>
    <td>Email</td>
    <td>Mobile No</td>
    <td>ACTION</td>
    
    
        
        </tr>
   </thead>
   <tbody>
   <c:forEach items="${patients}" var="p">
        
        <tr>
    
    <td>${p.firstName}</td>
    <td>${p.middleName}</td>
    <td>${p.lastName}</td>
    <td>${p.email}</td>
    <td>${p.contactNum}</td>
   
    <td><a href="deletepatient?id=${p.patientId}" class="btn btn-danger">DELETE</a> 
          
   
        </tr>
        
        </c:forEach>
        </tbody>
     
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
    </div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/Chart.bundle.js"></script>
    <script src="assets/js/chart.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="assets/js/app.js"></script>
    <script>
        // Function to generate label for the current month
        function getCurrentMonthLabel() {
            const currentDate = new Date();
            return currentDate.toLocaleString('default', { month: 'long' });
        }
        
        function getCurrentDateLabel() {
            const currentDate = new Date();
            // Format the date as 'Month Day, Year' (e.g., 'April 1, 2024')
            return currentDate.toLocaleDateString('en-US', { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' });
        }

        // Sample data for the first chart
        const label1 = getCurrentMonthLabel(); // Get label for the current month
        const data1 = [${appoinmentcount.size()}]; // Sample data

        // Get the canvas element for the first chart
        const ctx1 = document.getElementById('myChart1').getContext('2d');

        // Create the first chart
        new Chart(ctx1, {
            type: 'bar',
            data: {
                labels: [label1],
                datasets: [{
                    label: 'Current Appointments',
                    data: data1,
                    backgroundColor: 'rgba(54, 162, 235, 0.2)',
                    borderColor: 'rgba(54, 162, 235, 1)',
                    borderWidth: 2
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        stepSize: 4
                    }
                },
                plugins: {
                    title: {
                        display: true,
                        text: 'Monthly Appointments',
                        font: {
                            size: 18
                        }
                    },
                    legend: {
                        position: 'top'
                    }
                },
                responsive: true,
                indexAxis: 'y', // Display bars vertically
                barPercentage: 0.3 // Decrease bar width
            }
        });

        // Sample data for the second chart
        const label2 = getCurrentDateLabel(); // Get label for the current month
        const data2 = [${appoinmentcounttoday.size()}]; // Sample data

        // Get the canvas element for the second chart
        const ctx2 = document.getElementById('myChart2').getContext('2d');

        // Create the second chart
        new Chart(ctx2, {
            type: 'bar',
            data: {
                labels: [label2],
                datasets: [{
                    label: 'Today Appointments',
                    data: data2,
                    backgroundColor: 'rgba(255, 99, 132, 0.2)',
                    borderColor: 'rgb(255, 99, 132)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        stepSize: 4
                    }
                },
                plugins: {
                    title: {
                        display: true,
                        text: 'Today\'s Appointments',
                        font: {
                            size: 18
                        }
                    },
                    legend: {
                        display: false
                    }
                },
                
                responsive: true,
                indexAxis: 'x', // Display bars vertically
                barPercentage: 0.4 
            }
        });
    </script>
</body>
</html>

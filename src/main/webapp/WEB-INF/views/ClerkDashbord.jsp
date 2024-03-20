<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

      
      
      
     <%@include file="Clerknavbar.jsp" %>
      
      <jsp:include page="Clerksidebar.jsp"></jsp:include>
      
        <div class="page-wrapper">
            <div class="content">
                <div class="row">
                
                 <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                 <a href="Appoinmentlist">
                        <div class="dash-widget">
							<span class="dash-widget-bg3"><i class="fa fa-stethoscope" aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
							    
								<h3>${appoinmets.size()}</h3>
								<span class="widget-title3"> Total Appoinments <i class="fa fa-check" aria-hidden="true"></i></span>
							</div>
						
                        </div>
                       </a>
                    </div>
                
                 <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                 <a href="todayAppoinments">
                        <div class="dash-widget">
							<span class="dash-widget-bg2"><i class="fa fa-stethoscope" aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
							    
								<h3>${curruntdayAppoinmet }</h3>
								<span class="widget-title2"> Today Appoinments <i class="fa fa-check" aria-hidden="true"></i></span>
							</div>
						
                        </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                     <a href="MonthlyAppoinments">
                        <div class="dash-widget">
							<span class="dash-widget-bg1"><i class="fa fa-stethoscope" aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
								<h3>${curruntMonthAppoinmet}</h3>
								<span class="widget-title1">Months'Appoinments <i class="fa fa-check" aria-hidden="true"></i></span>
							</div>
                        </div>
                        </a>
                    </div>
                      
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                    <a href="patientlists">
                        <div class="dash-widget">
                            <span class="dash-widget-bg2"><i class="fa fa-user-o"></i></span>
                            <div class="dash-widget-info text-right">
                                <h3>${patients.size()}</h3>
                                <span class="widget-title2">Patients <i class="fa fa-check" aria-hidden="true"></i></span>
                            </div>
                        </div>
                        </a>
                    </div>
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                        <div class="dash-widget">
                            <span class="dash-widget-bg4"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                            <div class="dash-widget-info text-right">
                                <h3>${items.size() }</h3>
                                <span class="widget-title4">Product<i class="fa fa-check" aria-hidden="true"></i></span>
                            </div>
                        </div>
                    </div>
                   
                    <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                     <a href="UpcomingExpireditem">
                        <div class="dash-widget">
                            <span class="dash-widget-bg1"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                            <div class="dash-widget-info text-right">
                                <h3>${nextmonthexpireiteams }</h3>
                                <span class="widget-title1">Upcoming Expired<i class="fa fa-check" aria-hidden="true"></i></span>
                            </div>
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
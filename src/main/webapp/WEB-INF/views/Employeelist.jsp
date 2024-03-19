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
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.1/css/dataTables.dataTables.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.1/css/dataTables.bootstrap5.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/3.0.0/css/buttons.dataTables.css">

    
 
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>

</head>

<body>
    <div class="main-wrapper">
    
     
      
   
     <c:if test="${!empty clerk}">
        <jsp:include page="Clerknavbar.jsp"></jsp:include>
    </c:if>
    
      <c:if test="${!empty admin}">
         <%@include file="AdminNewnavbar.jsp" %>
    </c:if>
   
    <c:if test="${!empty clerk}">
        <jsp:include page="Clerksidebar.jsp"></jsp:include>
         
      
    </c:if>
    
     <c:if test="${!empty admin}">
       
         <jsp:include page="AdminNewsidebar.jsp"></jsp:include>
      
    </c:if>
      
        <div class="page-wrapper">
            <div class="content">
            
            <div class="col-sm-14 col-18 text-right m-b-90">
             <a href="Employee" class="btn btn-primary btn-rounded float-right" ><i class="fa fa-plus"></i> Add Employee</a>
            </div>
            
            <h4>Doctors</h4>
            
            
                     <table border="1"  id="listtable"  class="table table-striped table-hover">
   
    <thead>
    <tr>
      
       
        <td>  employeeId </td>
         <td> firstName </td>
         <td> lastName </td>
          <td>  titleName </td>
         <td>  gender </td>
         <td> email </td>
          <td>  password </td>
         <td>  dateOfJoining </td>
         <td> qualification </td>
          <td>  role</td>
         <td> aadharCardPath </td>
         <td> panCardPath </td>
          <td>  qualificationDocPath </td>
         <td> activeInd </td>
          <td>  contactNum</td>
          <td>Action</td>
         
        </tr>
        
        </thead>
        
           <tbody>
   
       <c:forEach items="${employee}" var="p">
       
    
        
        <tr>
         <td> ${p.employeeId} </td>
         <td> ${p.firstName } </td>
         <td> ${p.lastName } </td>
         <td> ${p.titleName } </td>
         <td> ${p.gender } </td>
         <td> ${p.email } </td>
         <td> ${p. password} </td>
         <td> ${p.dateOfJoining  } </td>
         <td> ${p.qualification } </td>
         <td> ${p. roleId } </td>
         <td> ${p.aadharCardPath } </td>
         <td> ${p. panCardPath } </td>
         <td> ${p.qualificationDocPath } </td>
         <td> ${p.activeInd } </td>
         <td> ${p.contactNum } </td>
         <td><a href="deleteemployee?id=${p.employeeId}">DELETE</a></td>
  
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
    <script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/Chart.bundle.js"></script>
    <script src="assets/js/chart.js"></script>
    <script src="assets/js/app.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.datatables.net/2.0.1/js/dataTables.js"></script>
    <script src="https://cdn.datatables.net/2.0.1/js/dataTables.bootstrap5.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/dataTables.buttons.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.dataTables.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.print.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.2.7/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.2.7/vfs_fonts.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.10.1/jszip.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.html5.min.js"></script>
    
    <script type="text/javascript">
        new DataTable('#listtable', {
            layout: {
                bottomStart: {
                    buttons: [
                        {
                            extend: 'print',
                            text: 'Print',
                            exportOptions: {
                                columns: ':visible'
                            }
                        },
                        {
                            extend: 'csv',
                            text: 'CSV',
                            exportOptions: {
                                columns: ':visible'
                            }
                        },
                        {
                            extend: 'pdf',
                            text: 'PDF',
                            exportOptions: {
                                columns: ':visible'
                            }
                        }
                    ]
                }
            }
        });
    </script>

</body>



</html>
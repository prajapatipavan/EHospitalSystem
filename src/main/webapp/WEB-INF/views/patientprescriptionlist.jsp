<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.1/css/dataTables.dataTables.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.1/css/dataTables.bootstrap5.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/3.0.0/css/buttons.dataTables.css">

    <style type="text/css">
        /* CSS to position the print, CSV, and PDF buttons */
        #listtable_wrapper .dt-buttons {
            position: relative;
            float: right;
            margin-right: 10px; /* Adjust the spacing between buttons */
        }

        #listtable_wrapper .dt-buttons button {
            margin-right: 5px; /* Adjust the spacing between buttons */
        }
    </style>
</head>
<body>
<div class="main-wrapper">

       <%@include file="userNavbar.jsp" %>
      
      <jsp:include page="usersidebar.jsp"></jsp:include>
      
    <div class="page-wrapper">
        <div class="content">
            <h4>Prescription</h4>
            <table border="3" id="listtable" class="table table-striped table-hover tab" >
                <thead>
                    <tr>
                       
                        <td>PatientName</td>
                        <td>Medicine Details</td>
                      
                        <td>Instructions</td>
                        
                     
                       
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${prescription}" var="p">
                    
                        <tr>
                        
                         
                           <th>${p.firstName} ${p.lastName}</th>
                            <th>${p.medicine}</th>
                             <th>${p.instructions}</th>
                        
                        
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

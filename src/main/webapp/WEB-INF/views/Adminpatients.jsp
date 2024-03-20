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
        /* Custom Styles */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f7fa;
        }
        .main {
            padding: 20px;
            border: 1px solid #ddd; /* Add border */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); /* Add shadow */
        }
        .page-title {
            margin-bottom: 20px;
        }
        .btn-add-doctor {
            margin-bottom: 20px;
            float: right;
        }
        .table-wrapper {
            margin-bottom: 30px;
        }
    </style>
</head>
<body>
    <div class="main-wrapper">
        <!-- Sidebar and Navbar Includes -->
        <c:if test="${!empty admin}">
            <jsp:include page="AdminNewnavbar.jsp"></jsp:include>
            <jsp:include page="AdminNewsidebar.jsp"></jsp:include>
        </c:if>
        <div class="main">
            <div class="page-wrapper">
                <div class="content">
                    <div class="page-title">
                        <h4>Patients</h4>
                    </div>
                    <div class="btn-add-doctor">
                        <a href="patientprofile" class="btn btn-primary btn-rounded">
                            <i class="fa fa-plus"></i> Add Patient
                        </a>
                    </div>
                    <div class="table-wrapper">
                        <table id="listtable" class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>Patient ID</th>
                                    <th>First Name</th>
                                    <th>Middle Name</th>
                                    <th>Last Name</th>
                                    <th>Email</th>
                                    <th>Mobile No</th>
                                    <th>Action</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${patients}" var="p">
                                    <tr>
                                        <td>${p.patientId}</td>
                                        <td>${p.firstName}</td>
                                        <td>${p.middleName}</td>
                                        <td>${p.lastName}</td>
                                        <td>${p.email}</td>
                                        <td>${p.contactNum}</td>
                                        <td>
                                            <a href="deletepatient?id=${p.patientId}" class="btn btn-danger">DELETE</a>
                                            <a href="viewpatient?id=${p.patientId}" class="btn btn-primary">Profile</a>
                                        </td>
                                        <td>
                                            <button id="myButton" class="btn btn-secondary">Waiting</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
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
    <script src="assets/js/app.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.datatables.net/2.0.1/js/dataTables.js"></script>
    <script src="https://cdn.datatables.net/2.0.1/js/dataTables.bootstrap5.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/dataTables.buttons.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.dataTables.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.print.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#listtable').DataTable({
                // Your DataTables initialization options here
            });
        });
    </script>
</body>
</html>

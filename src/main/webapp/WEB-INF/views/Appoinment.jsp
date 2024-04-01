<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Appointment</title>
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <style type="text/css">
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
        }
        input[type="text"], select, input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        select {
            background-size: 20px;
            padding-right: 30px;
        }
    </style>
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
                        Doctor : <select name="doctorId" class="form-control">
                            <option value="z">----select Doctor----</option>
                            <c:forEach items="${dname}" var="r">
                                <option value="${r.doctorId}">${r.firstName} ${r.lastName} -- (${r.specialization})</option>
                            </c:forEach>
                        </select><br><br> 
                        Patient : <select name="patientId" class="form-control">
                           
                            <c:forEach items="${pname}" var="r">
                                <option value="${r.patientId}">${r.firstName} ${r.lastName}</option>
                            </c:forEach>
                        </select><br><br> 
                        Rate List : <select name="ratelistId" class="form-control">
                            <option value="-1">----select RateList Name----</option>
                            <c:forEach items="${ratelistname}" var="r">
                                <option value="${r.ratelistId}">${r.name}</option>
                            </c:forEach>
                        </select><br><br> 
                        Appointment Date: <input type="date" class="form-control" name="appoinmentDate" id="datepicker" id="datepicker"><br>
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
        $(function() {
            $('#datetimepicker3').datetimepicker({
                format : 'LT'
            });

            // Get today's date
            var today = new Date();
            var lastDayOfMonth = new Date(today.getFullYear(), today.getMonth() + 1, 24);

            // Set the min attribute to today's date in the format YYYY-MM-DD
            var datePickerInput = document.getElementById("datepicker");
            datePickerInput.setAttribute("min", today.toISOString().split('T')[0]);
            datePickerInput.setAttribute("max", lastDayOfMonth.toISOString().split('T')[0]);
        });
    </script>
</body>
</html>

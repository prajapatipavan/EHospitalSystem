<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
      <style type="text/css">
      
       .container{
       
              position:relative;
              top:60px;
          }
      
      </style>
    
<title>Insert title here</title>


</head>
<body>

<c:if test="${!empty clerk}">
			<jsp:include page="Clerknavbar.jsp"></jsp:include>
		</c:if>

		<c:if test="${!empty admin}">
			<%@include file="AdminNewnavbar.jsp"%>
		</c:if>

		<c:if test="${!empty clerk}">
			<jsp:include page="Clerksidebar.jsp"></jsp:include>


		</c:if>

		<c:if test="${!empty admin}">

			<jsp:include page="AdminNewsidebar.jsp"></jsp:include>

		</c:if>

	<div class="container">
	
	
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="mt-3 mb-4">Appointment Status</h2>
				<form action="saveappoimentstatus" method="post">
					<div class="form-group">
						<label for="statusName">Status Name:</label> <input type="text"
							class="form-control" id="statusName" name="statusName" required>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
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
	
</body>
</html>

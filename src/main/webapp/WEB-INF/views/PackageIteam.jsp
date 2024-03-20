<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
     <link rel="stylesheet" type="text/css" href="css11.css">
</head>
<body>
                 <div class="page-wrapper">
                 
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
            <div class="content">
                <div class="row">
                   
                   
                </div>
                <div class="row">
                    <div class="col-lg-8 offset-lg-2">
                        <h1>Add PackageItem</h1>
    <form action="savepackageiteam" method="post">
      
         package:
         
         <select name="packageId" class="select">
        
                <option value="-1">----select Package Name----</option>
                
                 <c:forEach items="${pName}" var="r">
                           
                           <option value="${r.packageId}"> ${r.name} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
         iteam:
         
         <select name="itemId" class="select">
        
                <option value="-1">----select Iteam Name----</option>
                
                 <c:forEach items="${iName}" var="i">
                           
                           <option value="${iteamid}"> ${i.itemName} <option>
                           
                           </c:forEach>  
        
        
                </select><br><br>
        
       
         <div class="m-t-20 text-center">
                                <button type="submit" class="btn btn-primary submit-btn">ADD PackageItem</button>
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
            $(function () {
                $('#datetimepicker3').datetimepicker({
                    format: 'LT'

                });
            });
     </script>
</body>


<!-- add-appointment24:07-->
</html>
                
</body>
</html>
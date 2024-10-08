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
</head>
<body>
                 <div class="page-wrapper">
            <div class="content">
                <div class="row">
                   
                   
                </div>
                <div class="row">
                    <div class="col-lg-8 offset-lg-2">
                        <h1>Edit Ratelist</h1>
   
    <form action="ratelists" method="post">
              
                  Name:<input type="text" name="name" class="form-control" value=${ratelist.name}>
                   Amount:<input type="text" name="amount" class="form-control" value=${ratelist.amount}>
                   RateType:<select name="ratetypeId" class="select">
                   
                    <option value="-1">------select RateType-------- <option>
                           <c:forEach items="${ratetype}" var="r">
                           
                           <option value="${r.ratetypeId}"  ${r.ratetypeId== ratelist.ratetypeId?"selected":""}> ${r.type} <option>
                           
                           </c:forEach>   
                   
                             </select>
                             
                     Department:<select name="departmentId" class="select">
                   
                    <option value="-1">------select Department-------- <option>
                           <c:forEach items="${department}" var="r">
                           
                           <option value="${r.departmentId}" ${r.departmentId == ratelist.departmentId?"selected":""}> ${r.departmentName} <option>
                           
                           </c:forEach>   
                   
                             </select>   
                             
                              <input type="hidden" name="ratelistId" value="${ratelist.ratelistId }"/>      
              
              <div class="m-t-20 text-center">
                                <button type="submit" class="btn btn-primary submit-btn">Update RateList</button>
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
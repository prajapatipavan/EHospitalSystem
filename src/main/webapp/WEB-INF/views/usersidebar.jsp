<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                          <div class="sidebar" id="sidebar">
            <div class="sidebar-inner slimscroll">
                <div id="sidebar-menu" class="sidebar-menu">
                    <ul>
                        <li class="menu-title">Main</li>
                        <li class="active">
                            <a href="Admindashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                        </li>
						
                     
                        <li>
                            <a href="patientAppoinmentlist"><i class="fa fa-calendar"></i> <span>Appointment</span></a>
                        </li>
                        
                        
                        
                        <li>
                            <a href="patientprescriptionlist?id=${user.patientId}"><i class="fa fa-calendar"></i> <span>Prescription</span></a>
                        </li>
                       
                       
                        
                       
                       
                      
                    </ul>
                </div>
            </div>
        </div>
</body>
</html>
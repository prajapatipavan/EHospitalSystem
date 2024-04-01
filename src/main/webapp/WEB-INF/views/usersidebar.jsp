<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" integrity="sha384-7BVBj0SFV5shDRnQzrsgh5LyTBMwg4LSKDB9fFX+iytcKg+6alrwX+zKMTQ8/ry" crossorigin="anonymous">
</head>

<body>
                          <div class="sidebar" id="sidebar">
            <div class="sidebar-inner slimscroll">
                <div id="sidebar-menu" class="sidebar-menu">
                    <ul>
                        <li class="menu-title">Patient Dashboard</li>
                      
						
                     
                        <li>
                            <a href="patientAppoinmentlist"><i class="fa fa-calendar"></i> <span>Appointment</span></a>
                        </li>
                        
                        
                        
                        <li>
                            <a href="patientprescriptionlist?id=${user.patientId}"><i class="fa fa-medkit"></i> <span>Prescription</span></a>
                        </li>
                       
                       
                        
                       
                       
                      
                    </ul>
                </div>
            </div>
        </div>
</body>
</html>
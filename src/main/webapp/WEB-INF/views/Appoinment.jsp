<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                   <h2>Appointment Form</h2>
    <form action="saveappointment" method="post">
        Doctor : <input type="text" name="doctorId"><br>
        Patient : <input type="text" name="patientId"><br>
        Rate List : <input type="text" name="ratelistId"><br>
        Appointment Date: <input type="text" name="appoinmentDate"><br>
        Created Date: <input type="text" name="createdDate"><br>
        Employee : <input type="text" name="employeeId"><br>
        Appointment Status : <input type="text" name="appoinmentStatusId"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
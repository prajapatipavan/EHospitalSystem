<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doctor Details</title>
    <!-- Add your CSS stylesheets or link to external stylesheets here -->
    <style>
        /* Add your CSS styles here */
        /* This is just an example */
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .field {
            margin-bottom: 15px;
        }
        .field label {
            display: block;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Doctor Details</h1>
        <div class="field">
            <label for="firstName">First Name:</label>
            <span>${doctors.firstName}</span>
        </div>
        <div class="field">
            <label for="lastName">Last Name:</label>
            <span>${doctors.lastName}</span>
        </div>
        <div class="field">
            <label for="titleName">Title:</label>
            <span>${doctors.titleName}</span>
        </div>
        <div class="field">
            <label for="qualification">Qualification:</label>
            <span>${doctors.qualification}</span>
        </div>
        <div class="field">
            <label for="specialization">Specialization:</label>
            <span>${doctors.specialization}</span>
        </div>
        <div class="field">
            <label for="email">Email:</label>
            <span>${doctors.email}</span>
        </div>
        <div class="field">
            <label for="contactNum">Contact Number:</label>
            <span>${doctors.contactNum}</span>
        </div>
        <div class="field">
            <label for="gender">Gender:</label>
            <span>${doctors.gender}</span>
        </div>
        <div class="field">
            <label for="activeInd">Active:</label>
            <span>${doctors.activeInd ? 'Yes' : 'No'}</span>
        </div>
        <div class="field">
            <label for="joinDate">Join Date:</label>
            <span>${doctors.joinDate}</span>
        </div>
    </div>
</body>
</html>
    
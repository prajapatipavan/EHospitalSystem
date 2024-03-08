<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pharmacist Signup</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <style>
        /* Add custom styles here */
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
            padding-bottom: 50px;
        }
        .form-signup {
            max-width: 400px;
            padding: 15px;
            margin: auto;
        }
        .form-signup .form-control {
            position: relative;
            box-sizing: border-box;
            height: auto;
            padding: 10px;
            font-size: 16px;
        }
        .form-signup .form-control:focus {
            z-index: 2;
        }
        .form-signup input[type="text"],
        .form-signup input[type="email"],
        .form-signup input[type="password"],
        .form-signup input[type="tel"],
        .form-signup input[type="date"] {
            margin-bottom: 10px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signup button[type="submit"] {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
    <div class="container">
        <form class="savepharmacist" action="savepharmacist" method="post">
            <h1 class="h3 mb-3 font-weight-normal"> ADD Pharmacist </h1>
            <div class="form-group">
                <label for="pharmacistName" class="sr-only">Name</label>
                <input type="text" id="pharmacistName" name="pharmacistName" class="form-control" placeholder="Name" required autofocus>
            </div>
            <div class="form-group">
                <label for="email" class="sr-only">Email address</label>
                <input type="email" id="email" name="email" class="form-control" placeholder="Email address" required>
            </div>
            <div class="form-group">
                <label for="password" class="sr-only">Password</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
            </div>
            <div class="form-group">
                <label for="mobileNo" class="sr-only">Mobile Number</label>
                <input type="tel" id="mobileNo" name="mobileNo" class="form-control" placeholder="Mobile Number" required>
            </div>
            <div class="form-group">
                <label for="dateOfBirth" class="sr-only">Date of Birth</label>
                <input type="date" id="dateOfBirth" name="dateOfBirth" class="form-control" placeholder="Date of Birth" required>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">ADD Pharmacist</button>
        </form>
    </div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">


<!-- register24:03-->
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0">
<link rel="shortcut icon" type="image/x-icon"
	href="assets/img/favicon.ico">
<title>Update password</title>
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
	<div class="main-wrapper  account-wrapper">
		<div class="account-page">
			<div class="account-center">
				<div class="account-box">


					<div class="account-logo">
						<a href="index-2.html"><img src="assets/img/logo-dark.png"
							alt=""></a>

					</div>



					<form action="updatepassword" method="post" class="form-signin">

						<span style="color: red"> ${oeerror}</span> <br> <br>
						<div class="form-group">
							<label>Email</label> <input type="text" class="form-control"
								name="email">
						</div>
						<div class="form-group">
							<label>OTP</label> <input type="password" class="form-control"
								name="otp">
						</div>
						<div class="form-group">
							<label>Password</label> <input type="password"
								class="form-control" name="password">
						</div>
						<div class="form-group">
							<label>Confirm Password</label> <input type="password"
								class="form-control" name="comfirmPassword">
						</div>

						<span style="color: red"> ${error}</span> <br> <br>


						<div class="form-group text-center">
							<button class="btn btn-primary account-btn" type="submit">Update</button>
							|
							<button class="btn btn-danger account-btn" type="button">
								<a href="login"> Cancel </a>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/app.js"></script>
</body>


</html>
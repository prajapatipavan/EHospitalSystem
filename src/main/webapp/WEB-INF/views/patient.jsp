<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">


<!-- register24:03-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
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
                
                <form action="savepatient" method="post" class="form-signin">
    <div class="account-logo">
        <a href="index-2.html"><img src="assets/img/logo-dark.png" alt=""></a>
    </div>
    <div class="form-group">
        <label>First Name</label>
        <input type="text" class="form-control" name="firstName">
    </div>
    <div class="form-group">
        <label>Middle Name</label>
        <input type="text" class="form-control" name="middleName">
    </div>
    <div class="form-group">
        <label>Last Name</label>
        <input type="text" class="form-control" name="lastName">
    </div>
    <div class="form-group">
        <label>Email</label>
        <input type="text" class="form-control" name="email">
    </div>
    <div class="form-group">
        <label>Password</label>
        <input type="password" class="form-control" name="password">
    </div>
    <span style="color:red"> ${passerror }</span> 
    
    <div class="form-group">
        <label> Comfirm-Password</label>
        <input type="password" class="form-control" name="comfirmPassword">
    </div>
    <div class="form-group">
        <label>Gender</label><br>
        <label><input type="radio" name="gender" value="male"> Male</label>&nbsp&nbsp
        <label><input type="radio" name="gender" value="female"> Female</label>
    </div>
    <div class="form-group">
        <label>Date Of Birth</label>
        <input type="date" class="form-control" name="dob">
    </div>
    <div class="form-group">
        <label>Contact Number</label>
        <input type="text" class="form-control" name="contactNum">
    </div>
    <div class="form-group">
        <label>Blood Group:</label><br>
        
        <select name="bloodGrp" class="form-control">
                 
                             <option value="-1">----select your BloodGroup-----</option>
                             <option value="A+">A+</option>
                             <option value="A-">A-</option>
                               <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                 <option value="o+">o+</option>
                                 <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                                 <option value="o-">o-</option>
                                 
                             
                 
                               </select>
    </div>
    <div class="form-group">
        <label>Marital Status</label>
        
        <select name="maritialStatus" class="form-control">
                 
                             <option value="-1">----select your Maritial Status -----</option>
                             <option value="Married">Married</option>
                              <option value="Unmarried">UNmarried</option>
                              </select>
    </div>
    <div class="form-group">
        <label>Address</label>
        <input type="text" class="form-control" name="address">
    </div>
    <div class="form-group">
        <label>Referred By</label>
        <input type="text" class="form-control" name="refferdBy">
    </div>
    <div class="form-group">
        <label>Country</label>
        <input type="text" class="form-control" name="country">
    </div>
    <div class="form-group">
        <label>City</label>
        <input type="text" class="form-control" name="city">
    </div>
    <div class="form-group">
        <label>State</label>
        <input type="text" class="form-control" name="state">
    </div>
    <div class="form-group">
        <label>Pincode</label>
        <input type="text" class="form-control" name="pincode">
    </div>
    <div class="form-group">
        <label>Diseases</label>
        
        
        <select name="diseases" class="form-control">
                 
                             <option value="-1">----Any Diseases You To Select-----</option>
                             <option value="Hypertension">Hypertension</option>
                             <option value="Diabetes">Diabetes</option>
                              <option value="Cancer">Cancer</option>
                             <option value="Depression">Depression</option>
                             <option value="Migraine">Migraine</option>
                             <option value="No ">No diseases </option>
                              
                                
                               </select>
    </div>
    <div class="form-group">
        <label>Registration Type</label>
        <select name="registrationType" class="form-control">
                 
                             <option value="-1">----select your Registration  TYPE-----</option>
                             <option value="Private">Private</option>
                             <option value="Public">Public</option>
                              
                                
                               </select>
    </div>
    
    <div class="form-group">
        <label>DocType</label>
        <select name="docType" class="form-control">
                 
                             <option value="-1">----select your Document TYPE-----</option>
                             <option value="Aadharcard">Aadhar Card</option>
                             <option value="pancard">Pan Card</option>
                               <option value="voterid">Voter id</option>
                                <option value="driving">Driving Licence</option>
                                 <option value="passport">Passport</option>
                                
                               </select>
    </div>
    <div class="form-group">
        <label>Document Number</label>
        <input type="text" class="form-control" name="docPath">
    </div>
    
    <div class="form-group text-center">
        <button class="btn btn-primary account-btn" type="submit">Signup</button>
    </div>
    <div class="text-center login-link">
        Already have an account? <a href="login">Login</a>
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


<!-- register24:03-->
</html>
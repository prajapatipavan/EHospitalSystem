<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
  
  .container2 {
  width: 80%;
  margin: 0 auto;
}

/* Section Titles */
h2 {
  margin-top: 20px;
}

.pd { color: blue; }
.ad { color: green; }
.cd { color: orange; }
.od { color: purple; }

/* Separator */
.seperator {
  border-top: 1px solid #ccc;
  margin-top: 20px;
}

/* Form Layout */
.row {
  display: flex;
  margin-bottom: 10px;
}

.col {
  flex: 1;
  margin-right: 10px;
}

/* Field Styles */
.field {
  margin-bottom: 10px;
}

.detailField {
  background-color: #f7f7f7;
  padding: 5px;
  border-radius: 5px;
}

/* Submit Button */
.submitData {
  margin-top: 20px;
  text-align: center;
}
  
  
  </style>

</head>
<body>
 <div class="container2">
    <h1>Your profile:- ${patiente.firstName}</h1>
    <form action="" class="patientRegistration">
        <!-- Personal Details -->
        <div class="personal-details">
           <h2 class="pd">Personal Details:</h2>
        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="firstName">First Name:</label>
                    <div class="detailField">${patiente.firstName}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="middleName">Middle Name:</label>
                    <div class="detailField">${patiente.middleName}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="lastName">Last Name:</label>
                    <div class="detailField">${patiente.lastName}</div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="email">Email:</label>
                    <div class="detailField">${patiente.email}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="password">Password:</label>
                    <div class="detailField">********</div> <!-- Passwords should not be displayed -->
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="gender">Gender:</label>
                    <div class="detailField">${patiente.gender}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="dob">DOB:</label>
                    <div class="detailField">${patiente.dob}</div>
                </div>
            </div>
        </div>

        <hr class="seperator">
        <h2 class="ad">Address Details:</h2>
        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="address">Address:</label>
                    <div class="detailField">${patiente.address}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="city">City:</label>
                    <div class="detailField">${patiente.city}</div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="state">State:</label>
                    <div class="detailField">${patiente.state}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="country">Country:</label>
                    <div class="detailField">${patiente.country}</div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="pincode">Pincode:</label>
                    <div class="detailField">${patiente.pincode}</div>
                </div>
            </div>
        </div>

        <hr class="seperator">
        <h2 class="cd">Contact Details:</h2>
        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="contactNum">Contact Number:</label>
                    <div class="detailField">${patiente.contactNum}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="referredBy">Referred By:</label>
                    <div class="detailField">${patiente.refferdBy}</div>
                </div>
            </div>
        </div>

        <hr class="seperator">
        <h2 class="od">Other Details:</h2>
        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="bloodGrp">Blood Group:</label>
                    <div class="detailField">${patiente.bloodGrp}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="maritalStatus">Marital Status:</label>
                    <div class="detailField">${patiente.maritialStatus}</div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="diseases">Diseases:</label>
                    <div class="detailField">${patiente.diseases}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="registrationType">Registration Type:</label>
                    <div class="detailField">${patiente.registrationType}</div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="field">
                    <label for="docType">Document Type:</label>
                    <div class="detailField">${patiente.docType}</div>
                </div>
            </div>
            <div class="col">
                <div class="field">
                    <label for="docPath">Document Path:</label>
                    <div class="detailField">${patiente.docPath}</div>
                </div>
            </div>
        </div>

       
        </div>
    </form>
</div>
</body>
</html>
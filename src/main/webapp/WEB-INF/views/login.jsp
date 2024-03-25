<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Helth Hub Login Form</title>
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/blurred-abstract-background-interior-view-looking-out-toward-empty-office-lobby-entrance-doors-glass-curtain-wall-with-frame_1339-6363.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        .account-page {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .account-box {
            width: 400px;
            background: rgba(255, 255, 255, 0.7);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
            border: 2px solid #000;
        }
    </style>
</head>

<body>
    <div class="account-page">
        <div class="account-box">
            <div class="account-logo text-center">
                <img src="assets/img/logo-dark.png" alt="">
            </div>
            <form action="Athenticate" method="post" >
                <div class="form-group">
                    <label>Email</label>
                    <input type="text" class="form-control" name="email">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" name="password">
                </div>
                <div class="form-group text-center">
                    <button class="btn btn-primary btn-block" type="submit">Login</button>
                </div>
            </form>
                <div class="text-center login-link">
        Already have an account? <a href="patientprofile">Signup</a>
    </div><br>
     <div class="text-center login-link">
       <a href="forgetpassword" style="color:blue">Forget Password?</a>
    </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>

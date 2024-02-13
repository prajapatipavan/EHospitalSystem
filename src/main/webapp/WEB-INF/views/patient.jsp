<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action="savepatient" method="post">
         
                 firstName:<input type="text" name="firstName">	<br><br>
                 				
                 middleName:<input type="text" name="middleName"><br><br>	
                 				
                 lastName:<input type="text" name="lastName">	<br><br>
                 				
                 email	:<input type="text" name="email">	<br><br>	
                 		
                 password:<input type="text" name="password">	<br><br>	
                 			
                 gender	:MALE:<input type="radio" name="gender" value="male">
                         FEMALE:<input type="radio" name="gender" value="female">	
                 
                 
                 <br><br>			
                 DateOFBirth:<input type="date" name="dob">	<br><br>
                 
                 			
                 bloodGroup	:<select name="bloodGrp">
                 
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
                 
                 		
                 maritalStatus:<input type="text" name="maritialStatus"><br><br>				
                 address	:<input type="text" name="address">	<br><br>			
                 referredBy	:<input type="text" name="refferdBy"><br><br>				
                 country	:<input type="text" name="country">		<br><br>		
                 state		:<input type="text" name="state">	<br><br>		
                 city		:<input type="text" name="city">	<br><br>		
                 pincode	:<input type="text" name="pincode">	<br><br>			
                 contactNum	:<input type="text" name="contactNum">	<br><br>
                 
                 
                 						
                 diseases:<input type="text" name="diseases"><br><br>
                 
                 
                  RegistrationType	:<input type="text" name="registrationType"><br><br>	
                  
                  	
                  docType	:<select name="docType">
                 
                             <option value="-1">----select your Document TYPE-----</option>
                             <option value="Aadharcard">Aadhar Card</option>
                             <option value="pancard">Pan Card</option>
                               <option value="voterid">Voter id</option>
                                <option value="driving">Driving Licence</option>
                                 <option value="passport">Passport</option>
                                
                               </select>
                  
                  
                  remark	:<input type="text" name="remark">	<br><br>
                  docPath:<input type="text" name="docPath">	<br><br>
                  role:<input type="text" name="roleId">	<br><br> 	
                  
               <input type="submit" >
              </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<style>
        /* style.css */
       
         
body { 
	 
	flex-direction: column; 
	margin: 0; 
    background-image: url(https://www.teamhealth.com/wp-content/uploads/2022/06/TH-13654-World-Blood-Donor-Day-Social-Graphics_ForApproval_Blog.jpg);
	background-size: cover;
} 

.main { 
	background-color: white; 
	border-radius: 15px; 
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.2); 
	padding: 10px 20px; 
	
	width: 500px; 
	text-align: center;
	backdrop-filter: blur(5px); 
	background: transparent;

} 

h1 { 
	color: black; 
} 

label { 
	display: block; 
	width: 100%; 
	margin-top: 10px; 
	margin-bottom: 5px; 
	text-align: left; 
	color: gold; 
	font-weight: bold; 
} 

#pass { 
	color: red; 
	font-size: 12px; 
} 

input { 
	display: block; 
	width: 100%; 
	margin-bottom: 15px; 
	padding: 10px; 
	box-sizing: border-box; 
	border: 1px solid #ddd; 
	border-radius: 5px; 
} 

select { 
	display: block; 
	width: 100%; 
	margin-bottom: 15px; 
	padding: 10px; 
	box-sizing: border-box; 
	border: 1px solid #ddd; 
	border-radius: 5px; 
} 



.wrap { 
	display: flex;
	background-color : gold; 
	justify-content: center; 
	align-items: center; 
	color: black;
	font-size: large;
	cursor: pointer;
}


    </style> 
</head>
<body>
<br><br><br>
   <center>
	<div class="main"> 
		<h1> Registration</h1> 
		<form action="regForm"method="post"> 
			<label > Name</label> 
			<input id="name" type="text" 
				name="name1"
				placeholder="Enter your name" required> 
            <label for="bloodGroup">Select your blood group:</label>
                <select id="bloodGroup" name="bloodgroup">
                    <option value="A+">A+</option>
                    <option value="A-">A-</option>
                    <option value="B+">B+</option>
                    <option value="B-">B-</option>
                    <option value="AB+">AB+</option>
                    <option value="AB-">AB-</option>
                    <option value="O+">O+</option>
                    <option value="O-">O-</option>
                </select>

			<label for="email">Email:</label> 
			<input type="email" id="email"
				name="email"
				placeholder="Enter your email" required> 


			<label for="mobile">Contact:</label> 
			<input type="text" id="mobile"
				name="mobile"
				placeholder="Enter your Mobile Number" required 
				maxlength="10"> 

			<label for="gender">Gender:</label> 
			<select id="gender" name="gender" required> 
				<option value="male">Male</option> 
				<option value="female">Female</option> 
				<option value="other">Other</option> 
			</select> 
    
                        <label for="password">Password</label>
                         <input type="password" name="pass" placeholder="Enter password"required>
 
			<br><br>

			
				<input type="submit"value="register"class="wrap"> <br>
				 <div >already have an account ? <a href="login.jsp">Login here</a></div>
			 
		</form> 
	</div> 
	<script src="script.js"></script> 
	</center>

</body>
</html>
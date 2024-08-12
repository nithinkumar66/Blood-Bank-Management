<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
    body{
        background-image: url(https://imgs.search.brave.com/Cm3zqpIYEKVXLD99CvHY1VDARK5bpLY916evI0XwMas/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9jMS53/YWxscGFwZXJmbGFy/ZS5jb20vcHJldmll/dy8yODkvOTMvMzIw/L2Jsb29kLWJsb29k/LWRvbmF0aW9uLWhl/YWx0aC1kb25hdGlv/bi5qcGc);
        background-size: cover;
        }
      .wrapper{
        background: yellow;
        padding: 10px 20px;
        width: 400px;
        height: 400px;
        border-color:red;
        border-radius:50px;
        background: transparent;
        border: 2px solid;
        backdrop-filter:blur(5px);
      
      }
     
       button{
        background-color: blue ;
        color: white;
        padding: 8px 10px;
        border: black 2px solid;
        cursor: pointer;
        border-radius:7px;
        
        font-size:16px;
       
       
       }
       label { 
	display: block; 
	width: 100%; 
	margin-top: 10px; 
	margin-bottom: 5px; 
	text-align: left; 
	color: black; 
	font-weight: bold; 
}
      
      .wrapper h2{
      color: red;
      font-style: Arial;
      font-size:30px;
      text-align: center;
      text-decoration:underline;
      }
      .input-box input::placeholder {
      color: grey;
      }
     
      .wrapper i{
      color:blue;
      }
      select { 
	display: block; 
	width: 100%; 
	margin-bottom: 15px; 
	padding: 10px; 
	box-sizing: border-box; 
	border: 1px solid #ddd; 
	border-radius: 5px;
	cursor:pointer; 
} 
      .account{
      font-weight:bold;
      font-size:20px;
      }
</style>    
<title>RED Prime</title>

</head>
<body><br>
<br><br>
<br><br> 
<br>
<br>
<center>
<div class="wrapper">
<form action="SearchForm"method="post">
<h2>Search Engine</h2>
<br><div class="input-box">
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

</div>
<br><br>

<br>
<br>
    <button type="submit" value="search" >search</button>

<br>
 
</form>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
    body{
        background-image: url(https://img.freepik.com/free-photo/3d-render-blood-cells-abstract-background_1048-6338.jpg?w=740&t=st=1699776979~exp=1699777579~hmac=5537553e596c46b1e5f45aae8d3f0cb77c87aae9e6fb1f2580bc8d45755e03ea);
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
      .input-box input{
        width:175px;
         height:40px;
       font-size:15px;
       outline:none;
       color:blue;
       border-radius:40px;
       padding:10px 10px;
       }
       button{
        background-color: red;
        color: white;
        padding: 8px 10px;
        border: black 2px solid;
        cursor: pointer;
        margin: 5px;
        border-radius: 20px ;
        font-size:16px;
       }
      
      .wrapper h2{
      color: black;
      font-style: Arial;
      font-size:30px;
      text-align: center;
      }
      .input-box input::placeholder {
      color: grey;
      }
      .wrapper .btn{
      border-radius:40px;
      cursor: pointer; 
      width:250%;
      height:250%;
      
      }
      .wrapper i{
      color:blue;
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
<form action="LoginForm"method="post">
<h2>RED PRIME</h2>
<br><div class="input-box">
<input type="text"name="email" placeholder=" email"required>
<i class='bx bxs-phone' ></i>
</div>
<br><br>
<div class="input-box">
<input type="password"name="pass" placeholder="Password"required>
<i class='bx bx-comment-dots'></i>
</div>

<br>
<br><div>
    <button id="myButton" value="submit" >Sign Up</button>
</div>
<br>
 <div class="account">Don't have account ? <a href="reg.jsp">Register</a></div>
</form>
</center>
</body>
</html>
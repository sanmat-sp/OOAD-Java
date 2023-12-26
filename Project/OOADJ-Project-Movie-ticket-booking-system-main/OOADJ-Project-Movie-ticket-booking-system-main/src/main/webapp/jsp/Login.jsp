<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
   
    <div class="right">
        <ul class="navbar">
            <li><a  href="./registerUser">REGISTER</a></li>
        </ul>
    </div>
    <div class="container6" >
        <h1 style="text-align:center;padding:2%">LOGIN</h1>
        <form:form action="/loginUser" method="post" modelAttribute="login">
            
            <div class="form-data">
                <label class="h" for="email">Email : </label>
                <form:input type="text" path="email" id="email" class="input1" placeholder="Enter your email" required="required"/>
            </div>
            <br>
            <div class="form-data">
                <label class="h" for="password">Password: </label>
                <form:input type="text" path="password" id="password" class="input1" placeholder="Enter Password" required="required"/>
            </div>
            <br><br>
            <button  class="b1" type="submit">LOGIN</button> 
        </form:form>
    </div>
    
    <br><br>
    <div class="container4">
        
        <hr>
        
        <h11 class="motiv">Contact Information:</h11><br><br>
         <label class="motiv1">Email: </label> 
        <a class="motiv1" href="" class="contactlink">Bookmyshow@gmail.com</a><br><br>
        <label class="motiv1">Contact info: </label>  
        <a class="motiv1" href="" class="contactlink">080-4444-5566 /  9771419610</a>
    </div>

</body>
</html>
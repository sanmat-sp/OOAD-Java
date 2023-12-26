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
    <link rel="stylesheet" href="../css/form2.css">
</head>
<body>
    <div class="right">
        <ul class="navbar">
            <li><a  href="./viewMovies">Exit</a></li>
        </ul>
    </div>
    <div class="container6" >
    <h1 style="text-align:center;padding:2%">ADD SHOW</h1>
    <form:form action="/saveShow" method="post" modelAttribute="show">
        
        <div class="form-data">
            <label class="h" for="id">Movie Id : </label>
            <form:input type="text" path="movieId" id="movieId"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="date">Date: </label>
            <form:input type="text" path="date" id="date"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="startTime">Start Time : </label>
            <form:input type="text" path="startTime" id="startTime"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="endTime">End Time: </label>
            <form:input type="text" path="endTime" id="endTime"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="seatMatrixID">Show Matrix To be Allocated : </label>
            <form:input type="text" path="seatMatrixID" id="seatMatrixID" class="input1" required="required"/>
        </div>
        <br><br>
        <button class="b1" type="submit">ADD SHOW</button>
    </form:form>
    </div>
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
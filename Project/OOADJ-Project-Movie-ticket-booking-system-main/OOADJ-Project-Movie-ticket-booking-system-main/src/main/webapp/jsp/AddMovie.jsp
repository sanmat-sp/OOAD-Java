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
        <h1 style="text-align:center;padding:2%">ADD MOVIE</h1>
    <form:form action="/saveMovie" method="post" modelAttribute="movie">
        
        <div class="form-data">
            <label class="h" for="name">Name : </label>
            <form:input type="text" path="name" id="name"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="genre">Genre: </label>
            <form:input type="text" path="genre" id="genre"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="durationMins">Duration of Movie in Mins : </label>
            <form:input type="text" path="durationMins" id="durationMins"  class="input1" required="required"/>
        </div>
        <br>
        <div class="form-data">
            <label class="h" for="releaseDate">Release Date : </label>
            <form:input type="text" path="releaseDate" id="releaseDate"  class="input1" required="required"/>
        </div>
        <br>
                
        <div class="form-data">
            <label class="h" for="description">Description : </label>
            <form:input type="text" path="description" id="description"  class="input1" required="required"/>
        </div>

        <!-- <div class="form-data">
            <label class="form-label" for="imageData">Image File : </label>
            <form:input type="file" name="file" path="imageData" id="imageData" class="form-control-input" required="required"/>
        </div> -->
        <br><br>
        <div class="form-register">
            <button type="submit" value="Register" class="b1">Save</button>
        </div>
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
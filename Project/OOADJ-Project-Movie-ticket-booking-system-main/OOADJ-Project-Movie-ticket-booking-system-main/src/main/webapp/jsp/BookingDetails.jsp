<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
                <link rel="stylesheet" href="../css/view.css">
            </head>

            <body>
                <!-- <div class="mid">Movies Available:</div> <br> -->
                <!-- <div class="right">
                    <ul class="navbar">
                        <li><a href="./addMovie">ADD MOVIE</a></li>
                        <li><a href="./addShow">ADD SHOW</a></li>
                        <li><a href="./logoutUser">LOGOUT</a></li>
                    </ul>
                </div> -->
                
                    <form:form action ='./saveBooking' modelAttribute="booking" method="post">
                    <h2>BOOKING DETAILS</h2>
                    <br>
                    <div class="form-data">
                        <label class="h" for="movieId">Movie Id : </label>
                        <form:input type="text" path="movieId" id="name" class="input1" required="required" value="${movieId}"/>
                    </div>
                    <br>
                    <div class="form-data">
                        <label class="h" for="showId">Show Id : </label>
                        <form:input type="text" path="showId" id="name" class="input1" required="required" value="${showId}"/>
                    </div>
                    <br>
                    <div class="form-data">
                        <label class="h" for="price">Price : </label>
                        <form:input type="text" path="price" id="seat" class="input1" required="required" value="330"/>
                    </div>
                    <br>
                    <!-- <h3>Price : 23₹</h3> -->
                    <div class="form-data">
                        <label class="h" for="seat">Seat : </label>
                        <form:input type="text" path="colNo" id="seat" class="input1" required="required" value="${seat}"/>
                    </div>
                    <br>
                    <div class="form-data">
                        <label class="h" for="emailId">Owner : </label>
                        <form:input type="text" path="emailId" id="name" class="input1" required="required" value="${owner}"/>
                    </div>
                    <br>
                    <!-- <div class="form-data">
                        <label class="h" for="date">Date : </label>
                        <form:input type="text" path="date" id="name" class="input1" required="required"/>
                    </div> -->
                    <br><br>
                    <button class="b1" type="submit">Confirm Booking</button>
                </form:form>

                <div class="container4">
        
                    <hr>
                    
                    <h11 class="motiv">Contact Information:</h11><br><br>
                     <label class="motiv1">Email: </label> 
                    <a class="motiv1" href="" class="contactlink">Bookmyshow@gmail.com</a><br><br>
                    <label class="motiv1">Contact info: </label>  
                    <a class="motiv1" href="" class="contactlink">080-4444-5566 /  9771419610</a>
                </div>
            
                
                
                
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
            </script>
            </html>
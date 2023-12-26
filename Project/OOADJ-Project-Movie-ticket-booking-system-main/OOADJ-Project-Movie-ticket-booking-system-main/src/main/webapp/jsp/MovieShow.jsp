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
                <div class="mid">Shows Available:</div> <br>
                <div class="right">
                    <ul class="navbar">
                        <li><a  href="./viewMovies">Exit</a></li>
                    </ul>
                </div>
                
                <form:form>
                    <c:forEach var="show" items="${shows}">
                        <div class="container6" >
                            <a>
                                <!-- <h2 class="motiv2">Show Id: ${show.showId}</h2>
                                <h2 class="motiv2">Movie Id: ${show.movieId}</h2> -->
                                <!-- <h2 class="motiv2">Theatre Id: ${show.theatreId}</h2> -->
                                <h2 class="motiv2">Movie Id: ${show.movieId}</h2>
                                <h2 class="motiv2">Date: ${show.date}</h2>
                                <h2 class="motiv2">Start Time: ${show.startTime}</h2>
                                <h2 class="motiv2">End Time: ${show.endTime}</h2>
                                <!-- <h2 class="motiv2">${show.seatMatrixID}</h2> -->
                    <button class="b1"><a href="./bookingForm?movieId=${show.movieId}&&id=${show.showId}">Booking</a></button>
    
                            </a>
                        </div>
                        
                       
                        <!-- <h2><button type="button" class="btn btn-success">
                                            <a href="/editMovie/${movie.id}" style="color:white;font-size: large;">Edit</a>
                                        </button></h2> -->
                        <!-- <h2><button type="button" class="btn btn-danger">
                                            <a href="/deleteMovie/${movie.id}" style="color:white;font-size:large">Delete</a>
                                        </button></h2> -->

                    </c:forEach>

                </form:form>
                <div class="container4">
        
                    <hr>
                    
                    <h11 class="motiv">Contact Information:</h11><br><br>
                     <label class="motiv1">Email: </label> 
                    <a class="motiv1" href="" class="contactlink">Bookmyshow@gmail.com</a><br><br>
                    <label class="motiv1">Contact info: </label>  
                    <a class="motiv1" href="" class="contactlink">080-4444-5566 /  9771419610</a>
                </div>
                <!-- <button><a href="./loginForm">LOGIN</a></button> -->
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
            </script>
            </html>
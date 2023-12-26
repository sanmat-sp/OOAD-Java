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
                <div class="mid">Movies Available:</div> <br>
                <div class="right">
                    <ul class="navbar">
                        <li><a href="./addMovie">ADD MOVIE</a></li>
                        <li><a href="./addShow">ADD SHOW</a></li>
                        <li><a href="./currUserBookings">View Bookings</a></li>
                        <li><a href="./logoutUser">LOGOUT</a></li>
                    </ul>
                </div>
                
                    <form:form>
                    <c:forEach var="movie" items="${movieList}">
                       
                        <div class="container6" >
                            
                                <a href="./showMovie?id=${movie.id}">
                                    <h2 class="motiv2" id="movie_id">Id:    ${movie.id}</h2>
                                    <h2 class="motiv2">Movie: ${movie.name}</h2>
                                    
                                    <h2 class="motiv2">Description: ${movie.description}</h2>
                                    
                                    <h2 class="motiv2">Duration: ${movie.durationMins}</h2>
                                    
                                    <h2 class="motiv2">Release: ${movie.releaseDate}</h2>
                                    
                                    <h2 class="motiv2">Genre: ${movie.genre}</h2>
                              
                                    
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
            
                
                
                
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
            </script>
            </html>
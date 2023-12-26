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
                <link rel="stylesheet" href="../css/booking.css">
            </head>

            <body>
              
                <div class="right">
                    <ul class="navbar">
                        <li><a  href="./viewMovies">Exit</a></li>
                    </ul>
                </div>
                
                <div class="container6" >
                        <div class="seat-map">
                            <h2>Select your seats</h2>
                            <div class="screen">Screen</div><br><br><br>
                            <div class="seats">
                                <div class="row">
                                    <button onclick="disableButton()" id="bookTicketButton" class="seat available"> <a onclick="handleClick('${showID}','${movieId}',1)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=1">1</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',2)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=2">2</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',3)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=3">3</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',4)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=4">4</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',5)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=5">5</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',6)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=6">6</a></button>                             
                                </div>
                                <div class="row">
                            
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',7)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=7">7</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',8)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=8">8</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',9)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=9">9</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',10)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=10">10</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',11)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=11">11</a></button> 
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',12)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=12">12</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',13)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=13">13</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',14)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=14">14</a></button>

                                </div>
                                <div class="row">
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',15)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=15">15</a></button>                                    
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',16)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=16">16</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',17)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=17">17</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',18)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=18">18</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',19)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=19">19</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',20)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=20">20</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',21)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=21">21</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',22)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=22">22</a></button>                                      
                                </div>
                                <div class="row">
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',23)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=23">23</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',24)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=24">24</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',25)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=25">25</a></button>
                                    <button class="seat available"> <a onclick="handleClick('${showID}','${movieId}',26)" href="./bookingDetails?movieId=${movieId}&&showId=${showID}&&colName=26">26</a></button>                                  
                                </div>
                                <br><br><br><br>
                                </div>
                                <div class="legend">
                                <div class="seat available"></div><span>&nbsp;&nbsp;&nbsp;Available&nbsp;&nbsp;&nbsp;</span>
                                <div class="seat selected"></div><span>&nbsp;&nbsp;&nbsp;Selected&nbsp;&nbsp;&nbsp;</span>
                                <div class="seat unavailable"></div><span>&nbsp;&nbsp;&nbsp;Unavailable&nbsp;&nbsp;&nbsp;</span>
                                </div><br><br><br><br>
                                <button class="submit-btn" disabled>Book selected seats</button>
                             </div>
                             
                        
                </div>
                <!-- <button><a href="./logoutUser">LOGOUT</a></button> -->
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
                const handleClick=async(showId,movieId,colName)=>{
                    const res = await fetch("/selectSeat?colName="+ colName +"&&showId="+showId + "&&movieId="+movieId, {method :"post", "Content-Type": "application/json"})
                    console.log(res)
                }
                // const handleClick1=async(colName)=>{
                //     const res = await fetch("/selectSeat?colName=${colName}",method="post")
                //     console.log(res.json())
                // }
                function disableButton() {
                    // Disable the button
                    document.getElementById("bookTicketButton").disabled = true;
                    
                    // Make an AJAX request to update the ticket availability
                    
                }
            </script>
            
            </html>
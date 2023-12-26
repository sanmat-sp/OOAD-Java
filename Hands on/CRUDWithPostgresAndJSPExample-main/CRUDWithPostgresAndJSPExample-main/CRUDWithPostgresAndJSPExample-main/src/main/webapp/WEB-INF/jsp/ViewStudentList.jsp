<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
    <meta charset="ISO-8859-1">
    <title>View Student List</title>

    <link rel="stylesheet"
        	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
        <script
        	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script
        	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>

            <style>
                a{
                        color: rgb(217, 184, 184);
                    }
                    a:hover {
                        color: white;
                        text-decoration: none;
                    }
            
                    .container{
                        background-color: rgb(204, 204, 204);
                        color: rgb(79, 55, 55);
                        padding-bottom: 20px;
                        border-radius: 10px;
                        padding-left: 400px;
                  
                    }
                    body{
                        
                        margin: 10px;
                        padding: 100px;
                    }
                    .btn_btn-primary_btn-block{
                        width: 340px;
                        text-align: center;
                        height: 40px;
                        border-color: antiquewhite;
                        border-radius: 10px;
                        font-size: 25px;
                        background-color: rgb(72, 39, 39);
                    }
                    
                    body{
                        background-color: rgb(138, 114, 114);
                    }
                    .btn-btn-success{
                        background-color: rgb(255, 157, 0);
                        border: none;
                        border-radius: 9%;
                        padding-left: 20px;
                        padding-right: 20px;
                        border: 1px solid rgb(255, 196, 196);
                    }
                    
                    .btn-btn-danger{
                        background-color: rgb(63, 30, 30);
                        border: none;
                        border-radius: 9%;
                        padding-left: 20px;
                        padding-right: 20px;
                        border: 1px solid rgb(255, 193, 193);
                    }
                    
                    
            </style>

</head>
<body>

    <div class="container">

        <h1 class="p-3"> Student List</h1>

        <form:form>

            <table class="table-table-bordered">
            	<tr>
            		<th>Id</th>
            		<th>Name</th>
            		<th>Year</th>
            		<th>Edit</th>
            		<th>Delete</th>
            	</tr>

            	<c:forEach var="Student" items="${StudentList}">
                    <tr>
                		<td>${Student.id}</td>
                		<td>${Student.name}</td>
                		<td>${Student.year}</td>
                		<td><button type="button" class="btn-btn-success">
                		    <a href="/editStudent/${Student.id}">Edit</a>
                		</button></td>
                		<td><button type="button" class="btn-btn-danger">
                			<a href="/deleteStudent/${Student.id}">Delete</a>
                		</button></td>
                	</tr>

            	</c:forEach>

            </table>

        </form:form>

        <button type="button" class="btn_btn-primary_btn-block">
        	<a href="/addStudent">Add New Student</a>
        </button>

    </div>

    <script th:inline="javascript">
                window.onload = function() {

                    var msg = "${message}";
                    console.log(msg);
                    if (msg == "Save Success") {
        				Command: toastr["success"]("Student added successfully!!")
        			} else if (msg == "Delete Success") {
        				Command: toastr["success"]("Student deleted successfully!!")
        			} else if (msg == "Delete Failure") {
        			    Command: toastr["error"]("Some error occurred, couldn't delete user")
        			} else if (msg == "Edit Success") {
        				Command: toastr["success"]("Student updated successfully!!")
        			}

        			toastr.options = {
                          "closeButton": true,
                          "debug": false,
                          "newestOnTop": false,
                          "progressBar": true,
                          "positionClass": "toast-top-right",
                          "preventDuplicates": false,
                          "showDuration": "300",
                          "hideDuration": "1000",
                          "timeOut": "5000",
                          "extendedTimeOut": "1000",
                          "showEasing": "swing",
                          "hideEasing": "linear",
                          "showMethod": "fadeIn",
                          "hideMethod": "fadeOut"
                        }
        	    }
            </script>

</body>

</html>
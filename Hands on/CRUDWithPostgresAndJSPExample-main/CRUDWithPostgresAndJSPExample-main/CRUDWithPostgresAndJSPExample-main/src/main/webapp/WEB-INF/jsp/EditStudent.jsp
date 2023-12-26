<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
    <meta charset="ISO-8859-1">
    <title>Edit Student</title>

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

</head>
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
<body>

    <div class="container">

        <h1 class="p-3"> Edit Student </h1>

        <form:form action="/editSaveStudent" method="post" modelAttribute="Student">

                    <div class="row">
                    	<div class="form-group col-md-12">
                    		<div class="col-md-6">
                    			<form:hidden path="id" class="form-control input-sm" />
                    		</div>
                    	</div>
                    </div>

                    <div class="row">
                    	<div class="form-group col-md-12">
                    		<label class="col-md-3" for="name">Name</label>
                    		<div class="col-md-6">
                    		    <form:input type="text" path="name" id="name"
                    		        class="form-control input-sm" required="required" />
                    		</div>
                    	</div>
                    </div>

                    <div class="row">
                    	<div class="form-group col-md-12">
                    		<label class="col-md-3" for="year">Year</label>
                    		<div class="col-md-6">
                    			<form:input type="number" path="year" id="year"
                    				class="form-control input-sm" required="required" />
                    		</div>
                    	</div>
                    </div>

                    <div class="row p-2">
                    	<div class="col-md-2">
                    		<button type="submit" value="Register" class="btn-btn-success">Save</button>
                    	</div>
                    </div>

                </form:form>

    </div>

    <script th:inline="javascript">
                window.onload = function() {

                    var msg = "${message}";
                    console.log(msg);
                    if (msg == "Edit Failure") {
        				Command: toastr["error"]("Something went wrong with the edit.")
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
         <%@ page isELIgnored="false" %> 
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Form....</title>
  </head>
  <body style="background:#e2e2e2;">

<div class="container mt-7" >
<div class="card">
<div class="card-body"  style="background-color:gray;">
<h3 class="text-center text-uppercase">complex form</h3>
		
		<div class="alert alert-danger" role="alert">
      <form:errors path="student1.*"></form:errors>
  
		</div>
		
	 <form action="handleform" method="post">
    
    

    
    	 <div class="form-group">
		  <label for="exampleInputEmail1">Name
  		  
  			  </label>
 			 	  <input type="text" class="form-control" id="name" name=name aria-describedby="namehelp" placeholder="Enter name">
   					 <small id="name" class="form-text text-muted">We'll never share your name with anyone else.</small>
 		 </div>
 		 		<div class="form-group">
   					 <label for="id">Id
   			 
   					 </label>
   						 <input type="text" class="form-control" id="id" name="id" placeholder=" Enter id">
  				</div>
 		 
 		   <div class="form-group">
   				 <label for="dob">Date of birth
   			 
   				 </label>
   					 <input type="date" class="form-control" id="dob" name="dob" placeholder="dd/mm/yyyy">
  			</div>
  			
 		   <div class="form-group">
  			<label for="courses"> Select Courses	</label>
  			<select name="courses"   class="form-control" multiple="multiple">
  			<option>C++</option>
  						
  			<option>hibernate</option>
  			
  			<option>spring</option>
  			
  			<option>php</option>
  			
  			<option>python</option>
  			</select>
  			</div>
  			
 		   <div class="form-group">
 		   <span class="mr-3"></span>
 		   <div class="form-check- form-check-inline">
 		      <input class="form-check-input" type="radio" name="gender" value="male">
 		      <label class="form-check-label">Male</label>
 		      
 		     
 		   </div>
 		   </div>
 		      <div class="form-group">
 		      <div class="form-check- form-check-inline">
 		      <input class="form-check-input" type="radio" name="gender" value="female">
 		      <label class="form-check-label">Female</label>
 		      </div>
 		   </div>
  			
  			 
 		   <div class="form-group">
 		   
 		   <label>Select type</label>
 		   <select name="type" class="form-control">
 		   <option value="oldStudent">oldStudent</option>
 		    		   <option value="newstudent">newStudent</option>
 		   </select>
 		   </div>
 		   
 		   	 
 		   <div class="form-group">
 		   
 		   <label>your Address</label>
 		    		   <div class="form-group">
 		     <input type="text" class="form-control" id="street" name="address.street" aria-describedby="namehelp" placeholder="Enter Street">
  			</div>
  			 		   <div class="form-group">
  			 		   
  			 		    <input type="text" class="form-control" id="city" name="address.city" aria-describedby="namehelp" placeholder="Enter City">
  			 		   </div>
  			<div class="container text-center" >
  			
  				<button type="submit" class="btn btn-success">Submit</button>
  		</div>	</div>
  	 </form>
		</div>
		</div>
		
</div>
 
 	
 
 
    
   

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
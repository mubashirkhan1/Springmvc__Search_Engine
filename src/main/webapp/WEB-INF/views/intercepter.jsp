<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<style> 
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
}
</style>

<meta charset="ISO-8859-1">
<title>interceptor Example</title>
</head>

<body>
<div class="container">
	<form action="welcome">
	 	 <label for="fname">Name</label>
 			 <input type="text" id="fname" name="user" placeholder="Enter your name here">
 			 <button type="submit">say hello</button>
  	</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to CatFeeder #2!</title>
</head>
<body>
	<form action="getNumbersServlet2" method="post">
		<h2>This one is more customizable and only has default values for can price and tax.</h2>
		
		<label>Enter the number of cats you have: </label><br>
		<input type="text" name="userNumCats"><br>
		
		<label>Enter the number of cans per cat per feeding(must be the same for all cats): </label><br>
		<input type="text" name="userCansPerCat"><br>
		
		<label>Enter the number of feeding times per day(must be the same for all cats): </label><br>
		<input type="text" name="userCansADay"><br>
		
		<input type="submit" value="Calculate Costs" />
	</form>
</body>
</html>
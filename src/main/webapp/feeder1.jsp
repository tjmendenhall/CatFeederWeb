<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to CatFeeder #1!</title>
</head>
<body>
	<form action="getNumbersServlet" method="post">
		<h2>This one only asks for the number of cats and then uses default values for number of cans per feeding(1), number of feedings a day(2), price of one can(.60), and the tax(.07).</h2>
		
		<label>Enter the number of cats you have: </label><br>
		<input type="text" name="userNumCats"><br>
		
		<input type="submit" value="Calculate Costs" />
	</form>
</body>
</html>
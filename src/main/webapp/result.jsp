<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<p>
		${userCatPouch.getNumCats()} is the number of cats entered.<br />
		${userCatPouch.returnFeedingPrice()} is the price of one feeding. <br />
		${userCatPouch.returnDailyPrice()} is the daily price of feeding. <br />
	</p>
	<a href="index.jsp">Home Page</a> <br />
	<a href="feeder2.jsp">Try out CatFeeder #2</a>
</body>
</html>
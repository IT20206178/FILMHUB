<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uploader Profile</title>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery-func.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style3.css" type="text/css" media="all" />

<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}

	</style>
</head>
<body> 
<div id="shell">
		<div id="header">
			<h1 id="logo">
				<a href="#">Movie Tv Hub</a>
			</h1>
			<div class="social">
				<span>FOLLOW US ON:</span>
				<ul>
					<li><a class="twitter" href="#">twitter</a></li>
					<li><a class="facebook" href="#">facebook</a></li>
					<li><a class="vimeo" href="#">vimeo</a></li>
					<li><a class="rss" href="#">rss</a></li>
				</ul>
			</div>
			<div id="navigation">
				<ul>
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="#">NEWS</a></li>
					<li><a href="#">IN THEATERS</a></li>
					<li><a href="#">COMING SOON</a></li>
					<li><a href="#">CONTACT</a></li>
					
					
				</ul>
			</div>
			
			<br>
			<br>
			<br><br><br><br><br><br>
<center>

 <h1>Request Details</h1>
	<table class="styled-table">
	<c:forEach var="up" items="${upDetails}">
	
	<c:set var="id" value="${up.id}"/>
	<c:set var="uname" value="${up.uname}"/>
	<c:set var="uid" value="${up.uid}"/>
	<c:set var="phone" value="${up.phone}"/>
	<c:set var="film" value="${up.film}"/>
	<c:set var="date" value="${up.date}"/>
	
	
	<tr class="active-row">
		<td>User Name</td>
		<td>${up.uname}</td>
	</tr>
	<tr class="active-row">
		<td>User ID</td>
		<td>${up.uid}</td>
	</tr>
	<tr class="active-row">
		<td>User Contact No.</td>
		<td>${up.phone}</td>
	</tr>
	<tr class="active-row">
		<td>Asking Film/TV</td>
		<td>${up.film}</td>
	</tr>
	
	<tr class="active-row">
		<td>Request Date</td>
		<td>${up.date}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="UpdateAsking.jsp" var="uplupdate">
	<c:param name="id" value="${id}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="uid" value="${uid}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="film" value="${film}"/>
		<c:param name="date" value="${date}"/>
	</c:url>
	<a href="${uplupdate}">
	<input type="button" name="update" class ="button2" value="Update Request">
	</a>
	
	<c:url value="deleteRequest.jsp" var="updelete">
		<c:param name="id" value="${id}" />
		<c:param name="uname" value="${uname}" />
		<c:param name="uid" value="${uid}" />
		<c:param name="phone" value="${phone}"/>
		<c:param name="film" value="${film}" />
		<c:param name="date" value="${date}" />
	</c:url>
	<a href="${updelete}">
	
	<input type="button" name="delete" class ="button2" value="Delete Request">
	</a>
	<a href="index.jsp">
	
	<input type="button" name="delete" class ="button2" value="Confirm Details">
	</a>
	
	</div>
	<div id="footer">
			<p class="lf">
				Copyright &copy; 2010 <a href="#">SiteName</a> - All Rights Reserved
			</p>
			<p class="rf">
				Design by <a href="http://chocotemplates.com/">ChocoTemplates.com</a>
			</p>
			<div style="clear: both;"></div>
		</div>
	</div>
	</center>
</body>
</html>

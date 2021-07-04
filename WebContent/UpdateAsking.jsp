<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style3.css" type="text/css" media="all" />
	<title>Insert title here</title>
	<style type="text/css">
		table {
  			border-collapse: collapse;
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

<%
		String id = request.getParameter("id");
		String uname = request.getParameter("uname");
		String uid = request.getParameter("uid");
		String phone = request.getParameter("phone");
		String film = request.getParameter("film");
		String date = request.getParameter("date");
	%>
	
	<center>
	<h1>Update Request</h1>
	<form action="updateAskingServlet" method="post">
	<table class="styled-table">
		<tr class="active-row">
			<td>Request ID</td>
			<td><input type="text" name="id" value="<%= id %>" readonly></td>
		</tr>
		<tr class="active-row">
			<td>User Name</td>
			<td><input type="text" name="uname" value="<%= uname %>"></td>
		</tr>
		<tr class="active-row">
		<td>User id</td>
		<td><input type="text" name="uid" value="<%= uid%>"></td>
	</tr>
	<tr class="active-row">
		<td>User Contact No.</td>
		<td><input type="text" name="phone" value="<%= phone %>"></td>
	</tr>
	<tr class="active-row">
		<td>Asking Film/TV</td>
		<td><input type="text" name="film" value="<%= film %>"></td>
	</tr>
	<tr class="active-row">
		<td>Request Date</td>
		<td><input type="text" name="date" value="<%= date %>"></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" class="button2" value="Sumbit">
	</form>
	<br>
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


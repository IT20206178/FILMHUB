<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/kani3.css" type="text/css" media="all" />
<title>Insert title here</title>
</head>
<body>
<div id="shell">
  <div id="header">
    <h1 id="logo"><a href="#">Movie Tv Hub</a></h1>
    <div class="social"> <span>FOLLOW US ON:</span>
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
        <li><a href="#">ADVERTISE</a></li>
      </ul>
    </div>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h1 class="kaniya1">FILM/TV SERIES ASKING FORM</h1><br>
    


    
    

    <!-- Login Form -->
    <form action="AskingFilmServlet" method="POST">
    	<h2 class="active">  Enter User Name </h2>
      <input type="text" id="login" class="fadeIn second" name="login" placeholder="User Name" required>
      
      <h2 class="active">  Enter User ID </h2>
      
      <input type="text" id="password" class="fadeIn third" name="email" placeholder="User ID" required>
      
        <h2 class="active">  Contact Number </h2>
      
      <input type="text" id="password" class="fadeIn third" name="contact" placeholder="Contact Number" required>
      
        <h2 class="active">  Asking FILM/TV Series </h2>
      
      <input type="text" id="password" class="fadeIn third" name="uname" placeholder="What You Want" required>
      <h2 class="active"> Date</h2>
      
      <input type="text" id="password" class="fadeIn third" name="password1" placeholder="Today Date" required>
      
       <!--  <h2 class="active">  Confirm Password </h2>
      
      <input type="text" id="password" class="fadeIn third" name="password2" placeholder="password" required>-->
      
       
      
    
      <input type="submit" class="fadeIn fourth" value="Submit">
    </form>

    <!-- Remind Passowrd -->
    

  </div>
  <div id="footer">
    <p class="lf">Copyright &copy; 2021 <a href="#">SiteName</a> - All Rights Reserved</p>
    <p class="rf">Design by <a href="http://chocotemplates.com/">Kanishka Saranga</a></p>
    <div style="clear:both;"></div>
  </div>
</div>
</body>
</html>
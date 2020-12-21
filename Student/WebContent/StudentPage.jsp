<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>
        Student Page
    </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta charset="ISO-8859-1">
<style>




</style>
</head>
<body>
    <div class="bannerSP">
       <div class="leftSide">
        <div class="profilepic">

        </div>
        <div class="Information">
        <h1>Personal Information</h1> 
        ${Person}<br>
        <p><b>Address:</b> 123 Fake Street</p>
        <p><b>About Myself:</b> I know that successful students become successful adults. This is my 15th year at Edison Elementary School and my 10th year teaching fourth grade. So far, fourth grade is my favorite grade to teach! Mrs. Carroll was the 2011 Newell Unified School District Teacher of the Year, and received my National Board Certification in 2013. my loves science and majored in biology at Arizona State University, where my also earned her teaching credential and Master of Education degree. Mrs. Carroll is excited to begin the best year ever! </p>
        <br><p><b>Social Media</b> <br>
        Facebook: <a href="http://www.facebook.com/thisismyaccount"> Click here to view my Facebook</a> <br>
        Twitter: <a href="http://www.twitter.com/thisismyaccount"> Click here to view my Twitter</a> <br>
         </p>  <br><br> <br>
         <p><b>My References: <br></b>
        Jeff the Manager of a School<br>
        Phone: 0800838383 <br><br> 
        May the Other Manager of a School<br>
        Phone: 06-824 8083
        </p>
        </div>
    </div>
    <div class="rightSide">
        <div class="RightInfo">
           <h1>Records</h1>
           ${Name} <br>
        </div>
    </div>

</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>
        Student Records
    </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
    <div class="banner">
        <div class="navbar">
            <img src="" class="logo">
        <ul>
            <li><a href="StudentLogin.html"> Login</a></li>
        </ul>
    </div>
    <div class="content">
        <h1>Students Records</h1>
        <p>Search For Student Records<br></p>
        <div>
        <form action="AccountInfo" method="post">
            <input type="text" name="account" placeholder="Students Key Here">
            </form>
        </div>
        <div>
            <button type="button"><span></span>Go</button>
        </div> 
    </div>
</div>
</body>
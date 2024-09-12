<%@page import="entity.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
        color: #333;
        background-color: #f4f4f4;
    }
    
    .container {
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    
    h1 {
        text-align: center;
        color: #4CAF50;
        margin-bottom: 20px;
    }
    
    .details {
        margin-bottom: 20px;
    }
    
    .details label {
        font-weight: bold;
    }
    
    .details p {
        margin: 5px 0;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Student Details</h1>
        <%
            Student svt = (Student) request.getAttribute("student");
            out.println("<div class='details'>"
                + "<p><label>First Name:</label> " + svt.getfName() + "</p>"
                + "<p><label>Last Name:</label> " + svt.getlName() + "</p>"
                + "<p><label>Email:</label> " + svt.getEmail() + "</p>"
                + "<p><label>Gender:</label> " + svt.getGender() + "</p>"
                + "<p><label>Hobbies:</label> " + svt.getHobbies() + "</p>"
                + "<p><label>Birthday:</label> " + svt.getBirthday() + "</p>"
                + "</div>");
        %>
    </div>
</body>
</html>

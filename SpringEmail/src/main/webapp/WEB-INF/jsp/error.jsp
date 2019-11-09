<%-- 
    Document   : error
    Created on : Sep 7, 2017, 6:14:55 PM
    Author     : minh tuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
</head>
<body>
    <center>
        <h2>Sorry, the email was not sent because of the following error:</h2>
        <h3>${exception.message}</h3>
    </center>
</body>
</html>

<%-- 
    Document   : viewnote
    Created on : Sep 29, 2022, 8:24:04 PM
    Author     : colby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper - View</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>View Note</h2>
        <br>
        <h3>Title: </h3> <p>${note.title}</p>
        <br>
        <h3>Contents:</h3>
        <p>${note.content}</p>
        
        <a href="note?edit">Edit</a>
    </body>
</html>

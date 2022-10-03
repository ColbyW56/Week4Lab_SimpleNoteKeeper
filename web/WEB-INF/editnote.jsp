<%-- 
    Document   : editnote
    Created on : Sep 29, 2022, 8:24:26 PM
    Author     : colby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper - Edit</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>Edit Note</h2>
        <br>
        <form method="post" action="editnote">
            <p>Title: </p>
            <input type="text" name="titlebox" value=${titleval}>
            <p>Contents: </p>
            <input type="text" name="contentsbox" value=${contentsvalue}>
        </form>
        
            <p style="color: red">${inputResponse}</p>
    </body>
</html>

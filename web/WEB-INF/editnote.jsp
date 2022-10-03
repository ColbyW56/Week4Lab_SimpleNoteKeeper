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
        <form method="post" action="note">
            <p>Title: </p>
            <input type="text" name="titlebox" value=${note.title}>
            <p>Contents: </p>
            <textarea name="content" rows="6" cols="25">%{note.content}</textarea>
        </form>
            <input type="submit" value="Save">
        <p style="color: red">${inputResponse}</p>
    </body>
</html>

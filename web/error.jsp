<%-- 
    Document   : error
    Created on : Dec 4, 2018, 9:30:15 PM
    Author     : Portege R30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TA RSBK</title>
    </head>
    <body>
        <h1>Message - <%=request.getAttribute("error")%> </h1>
        <br>

        <form method="POST" action="/TARSBK/MainServlet">
            <input type="submit" name="Index" value="Index Page">
        </form>
    </body>
</html>


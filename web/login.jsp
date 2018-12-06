<%-- 
    Document   : login
    Created on : Dec 4, 2018, 9:29:57 PM
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
        <form method="POST" action="/TARSBK/MainServlet">
            <input type="submit" name="Index" value="Back">
        </form>
 
        <h1>Halaman Login</h1>
        <form method="POST" action="/TARSBK/LoginServlet"> 
            <table border="0"> 
                <tr> 
                    <td>Username</td> 
                    <td><input type="text" name="username"></td> 
                </tr> 
                <tr> 
                    <td>Password</td> 
                    <td><input type="password" name="password"></td> 
                </tr> 
                <tr><td colspan="2" align="center"> 
                        <input type="submit" name="Login" value="Login"></td> 
                </tr> 
            </table> 
        </form> 
    </body>
</html>


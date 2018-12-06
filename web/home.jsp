<%-- 
    Document   : home
    Created on : Dec 4, 2018, 9:29:43 PM
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
        <h3>Welcome <%=session.getAttribute("loginName")%> </h3>
    <center>
        <h2>Sistem Informasi</h2>
        <h2>Rumah Sakit Sehat Sentosa</h2>
    </center>
    <form method="POST" action="/SpeedCar/MainServlet">
        <input type="submit" name="Pasien" value="Pasien">
        <input type="submit" name="Kamar" value="Kamar">
    </form>
    <br>
    <br>
    <form method="POST" action="/TARSBK/LoginServlet">
        <input type="submit" name="Logout" value="Logout">
    </form>
</body>
</html>


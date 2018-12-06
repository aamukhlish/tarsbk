<%-- 
    Document   : index
    Created on : Dec 4, 2018, 9:40:07 PM
    Author     : Portege R30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TA RSBK</title>
    </head>
    <body>
        <form method="POST" action="/SpeedCar/MainServlet">
            <input type="submit" name="Login" value="Login">
        </form>
        <center>
            <h2>Sistem Informasi</h2>
            <h2>Rental "Speed Car"</h2>
        </center>
        <sql:query var="result" dataSource="jdbc/taRSBK">
            SELECT mobil.mobilId,mobil.tipe,mobil.merk,mobil.noplat,penyewa.nama FROM mobil, penyewa
            WHERE mobil.penyewaid = penyewa.penyewaId
        </sql:query>
            <center>
        <table border="1">
            <th>Tipe Mobil</th>
            <th>Merk Mobil</th>
            <th>No Plat</th>
            <th>Nama Penyewa</th>
            <th>Action</th>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.tipe}"/></td>
                    <td><c:out value="${row.merk}"/></td>
                    <td><c:out value="${row.noplat}"/></td>
                    <td><c:out value="${row.nama}"/></td>
                    <td>
                        <form method="POST" action="/SpeedCar/DataServlet">
                            <input type="hidden" name="mobilId" value="${row.mobilId}">
                            <center><input type="submit" value="Lihat Spesifikasi"></center>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </center>
    </body>
</html>


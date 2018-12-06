<%-- 
    Document   : pasien
    Created on : Dec 4, 2018, 9:30:50 PM
    Author     : Portege R30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TA RSBK</title>
    </head>
    <body>
        <h2>Halaman Penyewa</h2>
        <form method="POST" action="/SpeedCar/MainServlet">
            <input type="submit" name="Home" value="Home">
        </form>
        <br>
        <form action="./PenyewaServlet" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="penyewaId" value="${penyewa.penyewaId}" /></td>
                </tr>
                <tr>
                    <td>Nama Penyewa</td>
                    <td><input type="text" name="nama" value="${penyewa.nama}" /></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td><input type="text" name="alamat" value="${penyewa.alamat}" /></td>
                </tr>
                <tr>
                    <td>No Telpon</td>
                    <td><input type="text" name="notlpn" value="${penyewa.notlpn}" /></td>
                </tr>
                <tr>
                    <td>No KTP</td>
                    <td><input type="text" name="noktp" value="${penyewa.noktp}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <th>ID</th>
            <th>Nama Penyewa</th>
            <th>Alamat</th>
            <th>No Telpon</th>
            <th>No KTP</th>
                <s:forEach items="${allPenyewa}" var="pen">
                <tr>
                    <td>${pen.penyewaId}</td>
                    <td>${pen.nama}</td>
                    <td>${pen.alamat}</td>
                    <td>${pen.notlpn}</td>
                    <td>${pen.noktp}</td>
                </tr>
            </s:forEach>
        </table>
    </body>
</html>


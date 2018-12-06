<%-- 
    Document   : kamar
    Created on : Dec 4, 2018, 9:30:32 PM
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
        <h2>Halaman Mobil</h2>
        <form method="POST" action="/SpeedCar/MainServlet">
            <input type="submit" name="Home" value="Home">
        </form>
        <br>
        <form action="./MobilServlet" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="mobilId" value="${mobil.mobilId}" /></td>
                </tr>
                <tr>
                    <td>Tipe Mobil</td>
                    <td><input type="text" name="tipe" value="${mobil.tipe}" /></td>
                </tr>
                <tr>
                    <td>Merk Mobil</td>
                    <td><input type="text" name="merk" value="${mobil.merk}" /></td>
                </tr>
                <tr>
                    <td>No Plat</td>
                    <td><input type="text" name="noplat" value="${mobil.noplat}" /></td>
                </tr>
                <tr>
                    <td>ID Penyewa</td>
                    <td><input type="text" name="penyewaid" value="${mobil.penyewaid}" /></td>
                </tr>
                <tr>
                    <td>Warna Mobil</td>
                    <td><input type="text" name="warna" value="${mobil.warna}" /></td>
                </tr>
                <tr>
                    <td>Tahun Mobil</td>
                    <td><input type="text" name="tahun" value="${mobil.tahun}" /></td>
                </tr>
                <tr>
                    <td>Nomor Mesin</td>
                    <td><input type="text" name="nomesin" value="${mobil.nomesin}" /></td>
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
            <th>Tipe Mobil</th>
            <th>Merk Mobil</th>
            <th>No Plat</th>
            <th>ID Penyewa</th>
            <th>Warna Mobil</th>
            <th>Tahun Mobil</th>
            <th>No Mesin</th>
                <s:forEach items="${allMobil}" var="mobil">
                <tr>
                    <td>${mobil.mobilId}</td>
                    <td>${mobil.tipe}</td>
                    <td>${mobil.merk}</td>
                    <td>${mobil.noplat}</td>
                    <td>${mobil.penyewaid}</td>
                    <td>${mobil.warna}</td>
                    <td>${mobil.tahun}</td>
                    <td>${mobil.nomesin}</td>
                </tr>
            </s:forEach>
        </table>
    </body>
</html>


<%-- 
    Document   : data
    Created on : Dec 4, 2018, 9:41:17 PM
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
        <form method="POST" action="/SpeedCar/MainServlet">
                <input type="submit" name="Index" value="Back">
        </form>
        <center>
            <h2>Spesifikasi Mobil</h2>
        </center>
        <center>
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="mobilId" value="${mobil.mobilId}" /></td>
                    <td style="width:50%" rowspan="7" align="center" valign="middle"><img src="${initParam.GambarMobil}${mobil.noplat}.jpg"
                        alt="${mobil.noplat}"></td>
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
                    <td>Warna</td>
                    <td><input type="text" name="warna" value="${mobil.warna}" /></td>
                </tr>
                <tr>
                    <td>Tahun Mobil</td>
                    <td><input type="text" name="tahun" value="${mobil.tahun}" /></td>
                </tr>
                <tr>
                    <td>No Mesin</td>
                    <td><input type="text" name="nomesin" value="${mobil.nomesin}" /></td>
                </tr>     
            </table>
        </center>
    </body>
</html>


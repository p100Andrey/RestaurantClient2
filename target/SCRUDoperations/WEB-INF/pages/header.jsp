<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <style>
        a {
            text-decoration: none;
        }

        /* Убираем подчеркивание у ссылок */
        a:hover {
            text-decoration: none;
            background-color: #40c373;
            padding: 3px;
        }

        /* Добавляем подчеркивание при наведении курсора мыши на ссылку */
    </style>
    <table style="background: white; width: 800px">
        <tr>
            <td>
                <h1>
                    <big><big><big><big><big><big><a href="../../index.jsp"
                                                     title="Main page" style="font-family: 'Franklin Gothic Medium';
                      color:#0cc316; background-color: white">ELF</a></big></big></big></big></big></big>
                </h1>
            </td>
            <td>
                <h3>&emsp;Restaurant: Kiev, str. Reitarska 5, t. 808880888 </h3>
                <hr width="100%" align="left">
                <table style="background: #0cc316">
                    <tr>
                        <td><b><a href="/dishes/" style="font-size:20px;color:white">&nbsp&nbsp Main Page &nbsp&nbsp</a></b></td>
                        <%--<td><b><a href="<c:url value='/restaurantmap'/>" style="font-size:20px;color:white">Restaurant Map</a></b></td>--%>
                        <td><b><a href="/restaurantmap/" style="font-size:20px;color:white">&nbsp&nbsp Restaurant Map &nbsp&nbsp</a></b></td>
                        <td><b><a href="/workers/" style="font-size:20px;color:white">&nbsp&nbsp Workers &nbsp&nbsp</a></b></td>
                        <td><b><a href="/contacts/" style="font-size:20px;color:white">&nbsp&nbsp Contacts &nbsp&nbsp</a></b></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</header>
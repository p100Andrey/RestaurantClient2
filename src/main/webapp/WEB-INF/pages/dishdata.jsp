<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>

    <title>Info Dish</title>

    <style>
        a {
            text-decoration: none;
        }

        /* Убираем подчеркивание у ссылок */
        a:hover {
            text-decoration: underline;
        }

        /* Добавляем подчеркивание при наведении курсора мыши на ссылку */
    </style>

    <style type="text/css">
        .tg {
            width: 800px;
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>

</head>

<body style="background: url(/№1.jpg); background-size: cover">
<div align="center">

    <c:import url="/WEB-INF/pages/header.jsp"></c:import>

    <br/>
    <h1 style="color: white">Dish data</h1>

    <table class="tg">

            <th width="200px">Name</th>
            <th width="200px">Category</th>
            <th width="300px">Ingradients</th>
            <th width="50px">Cost</th>
            <th width="50px">Weight</th>
        <tr>
            <%--<td>${dish.dishId}</td>--%>
            <td>${dish.dishName}</td>
            <td>${dish.category}</td>
            <td>${dish.ingredients}</td>
            <%--<td>${dish.cost/100}${dish.cost%100}</td>--%>
            <td>${dish.cost}</td>
            <td>${dish.weight}</td>
        </tr>
    </table>
    <br/>
    <img src="${"/photo/".concat(dish.dishName).concat(".jpg")}" width="800px" height="500px">

</div>

</body>
</html>
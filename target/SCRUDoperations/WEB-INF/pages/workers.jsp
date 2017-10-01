<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Workers</title>

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

    <table class="tg" style="width: 250px">
        <br/>
        <h1 style="color: white">Workers</h1>

        <c:if test="${!empty listWorkers}">

            <tr>
                <th width="50">Name</th>
                <th width="50">Photo</th>
            </tr>
            <c:forEach items="${listWorkers}" var="worker">
                <c:if test="${worker.position eq 'waiter'}">
                    <tr>
                        <td style="padding: 30px">${worker.name}</td>
                        <td align="center"><img
                                src="${"/photo/".concat(worker.lastName).concat(worker.name).concat(".jpg")}"></td>
                    </tr>
                </c:if>
            </c:forEach>
        </c:if>
    </table>
</div>
</body>
</html>
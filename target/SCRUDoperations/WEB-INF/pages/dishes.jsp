<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page autoFlush="true" buffer="1094kb"%>
<%
    // Create an ArrayList with test data
    ArrayList<String> list = new ArrayList();
    list.add("Zakuski");
    list.add("Pervie Blyuda");
    list.add("Vtorie Blyuda");
    list.add("Desert");
    pageContext.setAttribute("razdely", list);
%>

<html>

<head>
    <title>Dish Page</title>

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
            background-color: transparent;
        }
    </style>
</head>
<body style="background: url(/№1.jpg); background-size: cover">
<div align="center">

    <c:import url="/WEB-INF/pages/header.jsp"></c:import>

    <br/>
    <b style="color: white; font-size: 30px">Menu</b>

    <form>
        <table class="tg-4eph">
            <%--<th width="100"></th>--%>
            <%--<th width="50"></th>--%>
            <%--<th width="30"></th>--%>
            <tr>
                <td width="560px"></td>
                <td><input type="text" name="inp1" value="" width="120px"/></td>
                <td><input type="submit" value="Search" width="50px"/></td>
            </tr>
        </table>
    </form>

    <table class="tg">

        <c:if test="${!empty listDishes}">

            <%--<th width="200px">Name</th>--%>
            <%--<th width="200px">Category</th>--%>
            <%--<th width="100px">Cost</th>--%>
            <%--<th width="100px">Weight</th>--%>
            <%--<th width="100px">Edit</th>--%>
            <%--<th width="100px">Delete</th>--%>

            <%--<th width="20">ID</th>--%>
            <th width="60">Name</th>
            <th width="60">Category</th>
            <th width="20">Cost</th>
            <th width="20">Weight</th>
            <%--<th width="30">Edit</th>--%>
            <%--<th width="30">Delete</th>--%>
            <c:forEach items="${listDishes}" var="dish">
                <tr>
                        <%--<td>${dish.dishid}</td>--%>
                    <td><a href="/dishdata/${dish.dishId}">${dish.dishName}</a></td>
                    <td>${dish.category}</td>
                        <%--<td>${dish.cost/100}${dish.cost%100}</td>--%>
                    <td>${dish.cost}</td>
                    <td>${dish.weight}</td>
                        <%--<td><a href="<c:url value='/dishedit/${dish.dishid}'/>">Edit</a></td>--%>
                        <%--<td><a href="<c:url value='/dishremove/${dish.dishid}'/>">Delete</a></td>--%>
                </tr>
            </c:forEach>
        </c:if>
    </table>

    <c:if test="${!empty param.inp1}">

        <c:forEach items="${listDishes}" var="dish">
            <c:if test="${fn:toLowerCase(dish.dishName) == fn:toLowerCase(param.inp1)}">
                <jsp:forward page="/dishdata/${dish.dishId}"></jsp:forward>
            </c:if>
        </c:forEach>
    </c:if>

</div>
</body>
</html>
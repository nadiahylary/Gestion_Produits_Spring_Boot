<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<%@include file="navbar.jsp" %>
<!--<br><br>
<div><form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form></div>-->
<br><br><br>
    <table class="table" style="margin-left: 50px; margin-right: 50px">
        <thead>
        <tr>
            <th>Id</th>
            <th>Nom</th>
            <th>Prix</th>
            <th>Quantité</th>
            <th>Catégorie</th>
            <th>Action</th>
        </tr>
        </thead>
        <c:forEach items="${products}" var = "p">
            <tr>
                <td>${p.id}</td>
                <td>${p.nom}</td>
                <td>${p.prix}</td>
                <td>${p.quantite}</td>
                <td>${p.categorie.nom}</td>
                <td><a href="/api/supprimerproduit/${p.id}" class="btn btn-danger"><span class="fa-solid fa-trash">Supprimer</span></a>&nbsp;
                    <a href="/api/modifierproduit/${p.id}" class="btn btn-warning"><span class="fa fa-edit">Modifier</span></a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
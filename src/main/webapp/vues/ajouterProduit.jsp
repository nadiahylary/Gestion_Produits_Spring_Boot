<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="nh.jee.gestionproduitsspringb.entities.Produit"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ajout produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<%@include file="navbar.jsp" %>
<br><br><br>
<div class="container">
    <div class="card m-5 p-2">
        <div class="card-header">
            <h2>Ajouter Produit</h2>
        </div>
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/api/ajouterProduit" method=post>

                <div class="mb-3 mt-3">
                    <label for="inputName" class="form-label">Nom:</label>
                    <input name="nom" type="text" class="form-control" id="inputName" value="${produit.nom }">
                </div>

                <div class="mb-3">
                    <label for="inputPassword4" class="form-label">Prix:</label>
                    <input type="text" name="prix" class="form-control" value="${produit.prix }" id="inputPassword4">
                </div>

                <div class="mb-3">
                    <label for="inputAddress" class="form-label">Quantite:</label>
                    <input type="text" name="quantite" class="form-control" value="${produit.quantite}" id="inputAddress">
                </div>

                <div class="mb-3">
                    <label for="inputCat" class="form-label">Categorie:</label>
                    <select id="inputCat" name="categorie">
                        <option>Choose here</option>
                        <c:forEach items="${categories}" var="cat">
                            <option value="${cat.id}" <c:choose><c:when test="${produit.categorie.id == cat.id}">
                                selected = "true"</c:when><c:otherwise>selected = "false"</c:otherwise></c:choose>>${cat.nom}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="mb-3">
                    <c:choose>
                        <c:when test="${idp == 0}">
                            <input type="hidden" disabled id="idp" name="idp" <% //session.setAttribute("idp", String.valueOf(idp));%>
                                   value="${0}">
                        </c:when>
                        <c:otherwise>
                            <input type="hidden" disabled id="idp" name="idp"
                                    <% //session.setAttribute("idp", String.valueOf(idp));%> value="${produit.id}">
                        </c:otherwise>
                    </c:choose>
                </div>

                <button type="submit" name="action" value="ajout" class="btn btn-primary">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

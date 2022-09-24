<!DOCTYPE html>
<html>
<head>
    <title>nav</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark fixed-top">
    <!-- Navbar content -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="navbar-brand" >Catalogue Produit</a>
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item">
                <a class="nav-link"  href="${pageContext.request.contextPath}/api/products">Liste des produits</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/api/ajouterProduit" >Ajouter un Produit</a>
            </li>
        </ul>
    </div>
    <!-- Navbar content -->

    <form action="${pageContext.request.contextPath}/api/produitmc" method="GET">
        <input type="text" name=mc>
        <button type="submit" type="button" class="btn btn-dark"  name="action" value="rechercher">Rechercher</button>
    </form >
</nav>
</body>
</html>

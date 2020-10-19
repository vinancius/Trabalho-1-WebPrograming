<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">

	<title>Will Im�veis</title>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<header>
  <div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container d-flex justify-content-between">
      <a href="index.jsp" class="navbar-brand d-flex align-items-center">
        <strong>� Procura de um Im�vel</strong>
      </a>
    </div>
  </div>
</header>

<main role="main">

  <section class="jumbotron text-center" style= "background-image: url(images/city.jpg);background-size: cover;">
    <div class="container">
      <h1 class="badge badge-primary text-wrap" style= "background-color: #00000059;color: white; font-size:300%;">Im�veis � venda!!!</h1>
      <p class="badge badge-primary text-wrap" style= "background-color: #00000059;color: white; font-size:180%;">Voc� est� � procura de um im�vel?? Na empresa will im�veis tem op��es incr�veis para voc� que est� � Procura da Felicidade</p>
      <div>
      	<form action="ImovelController" method="get">
			<input class="btn btn-primary my-2" type = "submit" value = "Clique aqui para ver nossas op��es">
		</form>
        <p>
        	<a href="form.jsp" class="btn btn-secondary my-2">Adicione um Im�vel</a>
        </p>
      </div>
    </div>
  </section>
	<form action="ImovelController" method="get">

	</form>
  <div class="album py-5 bg-light">
    <div class="container">
      <div class="row">
       <c:forEach items="${lista}" var = "imoveis">
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
          <img class="card-img-top"  src="images/city.jpg" alt="Card image cap">
            <div class="card-body">
            <p class="card-text">Nome do Imovel: ${imoveis.nomeImovel}</p>
              <p class="card-text">N� de Quartos: ${imoveis.qtd_quartos}</p>
              <p class="card-text">N� de Banheiros: ${imoveis.qtd_banheiros}</p>
              <p class="card-text">�rea do Im�vel: ${imoveis.area} m�</p>
              <p class="card-text">Descri��o: ${imoveis.descricao}</p>
              <div class="d-flex justify-content-between align-items-center">
                <small class="text-muted">R$ ${imoveis.valor}</small>
              </div>
            </div>
          </div>
        </div>
      </c:forEach>  
     </div>
    </div>
  </div>

</main>
</body>
</body>
</html>
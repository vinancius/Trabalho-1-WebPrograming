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

	<title>Will Imóveis</title>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<header>
  <div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container d-flex justify-content-between">
      <a href="index.jsp" class="navbar-brand d-flex align-items-center">
        <strong>À Procura de um Imóvel</strong>
      </a>
    </div>
  </div>
</header>

<main role="main">

  <section class="jumbotron text-center" style= "background-image: url(images/city.jpg);background-size: cover;">
    <div class="container">
      <h1 class="badge badge-primary text-wrap" style= "background-color: #ffffff9e;color: Black; font-size:160%;">Imóveis à venda!!!</h1>
      <p class="badge badge-primary text-wrap" style= "background-color: #ffffff9e;color: Black; font-size:160%;">Você está á procura de um imóvel? Na empresa will imóveis tem opções incríveis para você que está á Procura da Felicidade</p>
    </div>
  </section>
  	<div class = "container">
		<form action="ImovelController" method="post" enctype="multipart/form-data">
		  <div class="form-row">
		    <div class="col-md-2 mb-3">
		      <label>Nome do Imovel</label>
		      <input type="text" class="form-control" id="nomeImovel" name = "nomeImovel" placeholder="" value="">
		    </div>
		    <div class="col-md-2 mb-3">
		      <label>Nº de Banheiros</label>
		      <input type="number" class="form-control" id="qtd_banheiros" name = "qtd_banheiros" placeholder="" value="">
		    </div>
		    <div class="col-md-3 mb-3">
		      <label>Nº de Quartos</label>
  			  <input type="number" class="form-file" id="qtd_quartos" name = "qtd_quartos">
			</div>
		  </div>
		  <div class="form-row">
		    <div class="col-md-2 mb-3">
		      <label>Valor</label>
		      <input type="number" class="form-control" id="valor" name = "valor" placeholder="">
		    </div>
		    <div class="col-md-2 mb-3">
		      <label>Área do Imóvel</label>
		      <input type="number" class="form-control" id="area" name = "area" placeholder="">
		    </div>
		    <div class="col-md-6 mb-3">
		      <label>Descrição</label>
		      <textarea class="form-control" id="descricao" name = "descricao" rows="3"></textarea>
		    </div>
		  </div>
		  <button class="btn btn-primary" type="submit">Submit form</button>
		</form>
	</div>
</main>
</body>
</body>
</html>
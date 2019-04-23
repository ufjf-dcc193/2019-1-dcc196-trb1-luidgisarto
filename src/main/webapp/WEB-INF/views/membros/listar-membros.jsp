<%@page pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
  <title>Trabalho 1 - Membros</title>
</head>

<body>
  <nav>
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo center">Equilibrium</a>
      <ul class="left hide-on-med-and-down">
        <li><a href="/index.html">Início</a></li>
        <li><a href="/sedes.html">Sedes</a></li>
        <li class="active"><a href="/membros.html">Membros</a></li>
        <li><a href="/atividades.html">Atividades</a></li>
      </ul>
    </div>
  </nav>
  <div class="container">
    <div class="row">
      <div class="col s2" style="margin-top: 2em;">
        <a class="btn-floating waves-effect waves-light green" href="/cadastrar-membro.html"><i class="material-icons">add</i></a>
      </div>
      <div class="col s10">
        <h3 class="text-center">Consulta de Membros</h3>
      </div>
    </div>
    <div class="row">
      <div class="col s12">
        <table>
          <thead>
            <tr>
              <th>Nome Completo</th>
              <th>Função</th>
              <th>E-mail</th>
              <th>Data de Entrada</th>
              <th>Data de Saída</th>
              <th>Ações</th>
            </tr>
          </thead>
          <tbody>
           <c:forEach var="membro" items="${membros}">
            <tr>
               <td>${membro.getNomeCompleto()}</td>
                <td>${membro.getFuncao()}</td>
                <td>${membro.getEmail()}</td>
                <td>${membro.getDataEntradaFuncao()}</td>
                <td>${membro.getDataSaidaFuncao()}</td>
              <td>
                <a href="/editar-membro/${membro.getId()}.html" class="btn-floating btn-small orange"><i class="material-icons left">edit</i></a>
                <a href="/excluir-membro/${membro.getId()}.html" class="btn-floating btn-small red"><i class="material-icons left">delete</i></a>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</body>

</html>
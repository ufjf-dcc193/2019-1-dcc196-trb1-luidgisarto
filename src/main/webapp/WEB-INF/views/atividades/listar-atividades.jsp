<%@page pageEncoding="utf-8"%>
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
  <title>Trabalho 1 - Atividades</title>
</head>

<body>
  <nav>
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo center">Equilibrium</a>
      <ul class="left hide-on-med-and-down">
        <li><a href="index.html">Início</a></li>
        <li><a href="sedes.html">Sedes</a></li>
        <li><a href="membros.html">Membros</a></li>
        <li class="active"><a href="atividades.html">Atividades</a></li>
      </ul>
    </div>
  </nav>
  <div class="container">
    <div class="row">
      <div class="col s2" style="margin-top: 2em;">
        <a class="btn-floating waves-effect waves-light green"><i class="material-icons">add</i></a>
      </div>
      <div class="col s10">
        <h3 class="text-center">Consulta de Atividades</h3>
      </div>
    </div>
    <div class="row">
      <div class="col s12">
        <table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Item Name</th>
              <th>Item Price</th>
              <th>Ações</th>
            </tr>
          </thead>

          <tbody>
            <tr>
              <td>Alvin</td>
              <td>Eclair</td>
              <td>$0.87</td>
              <td>
                <a class="btn-floating btn-small orange"><i class="material-icons left">edit</i></a>
                <a class="btn-floating btn-small red"><i class="material-icons left">delete</i></a>
              </td>
            </tr>
            <tr>
              <td>Alan</td>
              <td>Jellybean</td>
              <td>$3.76</td>
              <td>
                <a class="btn-floating btn-small orange"><i class="material-icons left">edit</i></a>
                <a class="btn-floating btn-small red"><i class="material-icons left">delete</i></a>
              </td>
            </tr>
            <tr>
              <td>Jonathan</td>
              <td>Lollipop</td>
              <td>$7.00</td>
              <td>
                <a class="btn-floating btn-small orange"><i class="material-icons left">edit</i></a>
                <a class="btn-floating btn-small red"><i class="material-icons left">delete</i></a>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</body>

</html>
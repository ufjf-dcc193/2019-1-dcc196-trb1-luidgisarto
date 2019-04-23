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
    <title>Trabalho 1 - Nova Sede</title>
</head>

<body>
    <nav>
        <div class="nav-wrapper">
            <a href="/index.html" class="brand-logo center">Equilibrium</a>
            <ul class="left hide-on-med-and-down">
                <li><a href="/index.html">Início</a></li>
                <li><a href="/sedes.html">Sedes</a></li>
                <li><a href="/membros.html">Membros</a></li>
                <li><a href="/atividades.html">Atividades</a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
    <form action="salvar-sede.html" method="post">
        <div class="card" style="margin-top:5em;">
            <div class="card-content">
            <span class="card-title">Manter Sede</span>
                <div class="row">
                <div class="input-field col s4">
                    <input id="nomeFantasia" name="nomeFantasia" type="text" class="validate" 
                    value="${sede.nomeFantasia}">
                    <label for="nomeFantasia">Nome Fantasia</label>
                </div>
                <div class="input-field col s4">
                    <input id="estadoFederacao" name="estadoFederacao" type="text" class="validate"
                    value="${sede.estadoFederacao}">
                    <label for="estadoFederacao">Estado de Federação</label>
                </div>
                <div class="input-field col s4">
                    <input id="cidade" name="cidade" type="text" class="validate" value="${sede.cidade}">
                    <label for="cidade">Cidade</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s4">
                    <input id="bairro" name="bairro" type="text" class="validate" value="${sede.bairro}">
                    <label for="bairro">Bairro</label>
                </div>
                <div class="input-field col s4">
                    <input id="telefone" name="telefone" type="text" class="validate" value="${sede.telefone}">
                    <label for="telefone">Telefone</label>
                </div>
                <div class="input-field col s4">
                    <input id="enderecoWeb" name="enderecoWeb" type="text" class="validate" value="${sede.enderecoWeb}">
                    <label for="enderecoWeb">Endereço web</label>
                </div>
            </div>
            </div>
            <div class="card-action">
            <input type="hidden" name="id" value="${sede.id}">
            <button type="submit" class="waves-effect waves-light btn green">Salvar</button>
            <button type="button" class="waves-effect waves-light btn grey">Cancelar</button>
            </div>
        </div>
        </div>
    </form>
</body>

</html>
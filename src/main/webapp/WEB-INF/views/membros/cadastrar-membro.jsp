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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <title>Trabalho 1 - Novo Membro</title>
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
    <form action="salvar-membro.html" method="post">
        <div class="card" style="margin-top:5em;">
            <div class="card-content">
            <span class="card-title">Manter Membro</span>
                <div class="row">
                <div class="input-field col s4">
                    <input id="nomeFantasia" name="nomeCompleto" type="text" class="validate" 
                    value="${membro.nomeCompleto}">
                    <label for="nomeCompleto">Nome Completo</label>
                </div>
                <div class="input-field col s4">
                    <input id="funcao" name="funcao" type="text" class="validate"
                    value="${membro.funcao}">
                    <label for="funcao">Função</label>
                </div>
                <div class="input-field col s4">
                    <input id="email" name="email" type="text" class="validate" value="${membro.email}">
                    <label for="email">E-mail</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s3">
                    <input id="dataEntradaFuncao" format="dd-mm-yyyy" name="dataEntradaFuncao" type="text" class="validate datepicker" value="${membro.dataEntradaFuncao}">
                    <label for="dataEntradaFuncao">Data de Entrada</label>
                </div>
                <div class="input-field col s3">
                    <input id="dataSaidaFuncao" format="dd-mm-yyyy" name="dataSaidaFuncao" type="text" class="validate datepicker" value="${membro.dataSaidaFuncao}">
                    <label for="dataSaidaFuncao">Data de Saída</label>
                </div>
                 <div class="input-field col s6">
                    <select name="sede">
                        <option value="" disabled selected>Selecione</option>
                        <c:forEach var="sede" items="${sedes}">
                            <option value="${sede.getId()}">${sede.getNomeFantasia()}</option>
                        </c:forEach>
                    </select>
                    <label>Sede</label>
                </div>
            </div>
            </div>
            <div class="card-action">
            <input type="hidden" name="id" value="${membro.id}">
            <button type="submit" class="waves-effect waves-light btn green">Salvar</button>
            <button type="button" class="waves-effect waves-light btn grey">Cancelar</button>
            </div>
        </div>
        </div>
    </form>

    <script>
     $(document).ready(function() {
        $('select').formSelect();
       $('.datepicker').datepicker({
            i18n: {
            months: ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
            monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
            weekdays: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabádo'],
            weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
            weekdaysAbbrev: ['D', 'S', 'T', 'Q', 'Q', 'S', 'S'],
            today: 'Hoje',
            clear: 'Limpar',
            cancel: 'Sair',
            done: 'Confirmar',
            labelMonthNext: 'Próximo mês',
            labelMonthPrev: 'Mês anterior',
            labelMonthSelect: 'Selecione um mês',
            labelYearSelect: 'Selecione um ano',
            selectMonths: true,
            selectYears: 15,
            },
            format: 'dd/mm/yyyy',
            container: 'body',
            minDate: new Date(),
        });
});
    </script>
</body>

</html>
package br.ufjf.luidgisarto.trb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping("sedes.html")
    public String listarSedes() {
        return "sedes/listar-sedes";
    }

    @RequestMapping("membros.html")
    public String listarMembros() {
        return "membros/listar-membros";
    }

    @RequestMapping("atividades.html")
    public String listarAtividades() {
        return "atividades/listar-atividades";
    }
}
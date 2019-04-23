package br.ufjf.luidgisarto.trb1;

import br.ufjf.luidgisarto.trb1.models.RelatorioSede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

import java.util.List;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @Autowired
    SedeRepository sedeRepository;

    @RequestMapping({ "", "index.html" })
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        List<RelatorioSede> relatorio = sedeRepository.getAll();
        mv.setViewName("home");

        return mv;
    }
}
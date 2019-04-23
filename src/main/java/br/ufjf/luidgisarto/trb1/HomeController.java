package br.ufjf.luidgisarto.trb1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.luidgisarto.trb1.models.RelatorioSede;
import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

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

        mv.setViewName("home");

        List<RelatorioSede> relatorioSedes = sedeRepository.FindAllWithActivitiesQuery();

        mv.addObject("relatorioSedes", relatorioSedes);

        return mv;
    }
}
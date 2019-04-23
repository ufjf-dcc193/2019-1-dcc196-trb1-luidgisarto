package br.ufjf.luidgisarto.trb1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.luidgisarto.trb1.models.Sede;
import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

/**
 * SedeController
 */
@Controller
public class SedeController {
    @Autowired
    private SedeRepository sedeRepository;

    @RequestMapping("sedes.html")
    public ModelAndView listarSedes() {
        ModelAndView mv = new ModelAndView();
        List<Sede> sedes = sedeRepository.findAll();
        mv.setViewName("sedes/listar-sedes");
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("cadastrar-sede.html")
    public ModelAndView prepararCadastro() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes/cadastrar-sede");

        return mv;
    }

    @RequestMapping(value = "salvar-sede.html", method = RequestMethod.POST)
    public RedirectView salvarSede(Sede sede) {
        sedeRepository.save(sede);
        return new RedirectView("/sedes.html");
    }

    @RequestMapping("editar-sede/{id}.html")
    public ModelAndView editarSede(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView();

        Sede sede = sedeRepository.getOne(id);

        mv.addObject("sede", sede);

        mv.setViewName("sedes/cadastrar-sede");

        return mv;
    }

    @RequestMapping("excluir-sede/{id}.html")
    public RedirectView excluirSede(@PathVariable Long id) {
        sedeRepository.deleteById(id);
        return new RedirectView("/sedes.html");
    }
}
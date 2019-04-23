package br.ufjf.luidgisarto.trb1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.luidgisarto.trb1.models.Membro;
import br.ufjf.luidgisarto.trb1.models.Sede;
import br.ufjf.luidgisarto.trb1.repositories.MembroRepository;
import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

/**
 * SedeController
 */
@Controller
public class MembroController {
    @Autowired
    private MembroRepository membroRepository;

    @Autowired
    private SedeRepository sedeRepository;

    @RequestMapping("membros.html")
    public ModelAndView listarSedes() {
        ModelAndView mv = new ModelAndView();
        List<Membro> membros = membroRepository.findAll();
        mv.setViewName("membros/listar-membros");
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("cadastrar-membro.html")
    public ModelAndView prepararCadastro() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros/cadastrar-membro");

        List<Sede> sedes = sedeRepository.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping(value = "salvar-membro.html", method = RequestMethod.POST)
    public RedirectView salvarSede(Membro membro) {
        membroRepository.save(membro);
        return new RedirectView("membros.html");
    }

    @RequestMapping("editar-membro/{id}.html")
    public ModelAndView editarSede(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView();

        Membro membro = membroRepository.getOne(id);

        List<Sede> sedes = sedeRepository.findAll();
        mv.addObject("sedes", sedes);

        mv.addObject("membro", membro);

        mv.setViewName("membros/cadastrar-membro");

        return mv;
    }

    @RequestMapping("excluir-membro/{id}.html")
    public RedirectView excluirSede(@PathVariable Long id) {
        membroRepository.deleteById(id);
        return new RedirectView("membros.html");
    }
}
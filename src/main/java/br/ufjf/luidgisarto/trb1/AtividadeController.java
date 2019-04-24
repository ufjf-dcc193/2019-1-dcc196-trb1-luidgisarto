package br.ufjf.luidgisarto.trb1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.luidgisarto.trb1.models.Atividade;
import br.ufjf.luidgisarto.trb1.models.Sede;
import br.ufjf.luidgisarto.trb1.repositories.AtividadeRepository;
import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

/**
 * Atividade Controller
 */
@Controller
public class AtividadeController {
    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private SedeRepository sedeRepository;

    @RequestMapping("atividades.html")
    public ModelAndView listarAtividades() {
        ModelAndView mv = new ModelAndView();
        List<Atividade> atividades = atividadeRepository.findAll();
        mv.setViewName("atividades/listar-atividades");
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("cadastrar-atividade.html")
    public ModelAndView prepararCadastro() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades/cadastrar-atividade");

        List<Sede> sedes = sedeRepository.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping(value = "salvar-atividade.html", method = RequestMethod.POST)
    public RedirectView salvarAtividade(Atividade atividade) {
        atividadeRepository.save(atividade);
        return new RedirectView("/atividades.html");
    }

    @RequestMapping("editar-atividade/{id}.html")
    public ModelAndView editarAtividade(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("atividades/cadastrar-atividade");

        Atividade atividade = atividadeRepository.getOne(id);

        List<Sede> sedes = sedeRepository.findAll();
        mv.addObject("sedes", sedes);

        mv.addObject("atividade", atividade);

        return mv;
    }

    @RequestMapping("excluir-atividade/{id}.html")
    public RedirectView excluirAtividade(@PathVariable Long id) {
        atividadeRepository.deleteById(id);
        return new RedirectView("/atividades.html");
    }
}
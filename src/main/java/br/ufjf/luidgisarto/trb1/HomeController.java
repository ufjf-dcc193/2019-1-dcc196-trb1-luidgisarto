package br.ufjf.luidgisarto.trb1;

import br.ufjf.luidgisarto.trb1.models.Atividade;
import br.ufjf.luidgisarto.trb1.models.RelatorioSede;
import br.ufjf.luidgisarto.trb1.models.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

import java.util.ArrayList;
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

        mv.setViewName("home");

        List<RelatorioSede> relatorio = new ArrayList<>();

        List<Sede> sedes = sedeRepository.findAll();

        for (Sede s: sedes) {
            List<Atividade> atividadesSede = s.getAtividades();

            Long totalAssistencial = s.getAtividades().stream().mapToLong(a -> a.getTotalHorasAssistencial()).sum();
            Long totalFinanceira = s.getAtividades().stream().mapToLong(a -> a.getTotalHorasFinanceira()).sum();
            Long totalJuridica = s.getAtividades().stream().mapToLong(a -> a.getTotalHorasJuridica()).sum();
            Long totalExecutiva = s.getAtividades().stream().mapToLong(a -> a.getTotalHorasExecutiva()).sum();

            RelatorioSede dadoRelatorio = new RelatorioSede(s.getId(), s.getNomeFantasia(), (long) atividadesSede.size(),
                    totalAssistencial, totalJuridica, totalFinanceira, totalExecutiva);

            relatorio.add(dadoRelatorio);
        }

        mv.addObject("relatorioSedes", relatorio);

        return mv;
    }
}
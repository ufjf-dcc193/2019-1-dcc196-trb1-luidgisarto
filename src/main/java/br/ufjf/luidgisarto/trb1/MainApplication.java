package br.ufjf.luidgisarto.trb1;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.luidgisarto.trb1.models.Atividade;
import br.ufjf.luidgisarto.trb1.models.Membro;
import br.ufjf.luidgisarto.trb1.models.Sede;
import br.ufjf.luidgisarto.trb1.repositories.AtividadeRepository;
import br.ufjf.luidgisarto.trb1.repositories.MembroRepository;
import br.ufjf.luidgisarto.trb1.repositories.SedeRepository;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

		SedeRepository sedeRep = ctx.getBean(SedeRepository.class);
		MembroRepository membroRep = ctx.getBean(MembroRepository.class);
		AtividadeRepository atividadeRep = ctx.getBean(AtividadeRepository.class);

		for (int i = 1; i < 4; i++) {
			Sede s = new Sede("Sede" + (i), "MG", "Juiz de Fora", "Centro", "32 99999-9999", "sede" + i + ".com.br");

			Sede sede = sedeRep.save(s);

			Membro m = new Membro("Membro" + i, "Developer", "developer@gmail.com", new Date(), new Date(), sede);

			Atividade a = new Atividade("Atividade" + i, "Descrição " + i, new Date(), new Date(), Long.parseLong("10"), Long.parseLong("20"),
					Long.parseLong("10"), Long.parseLong("20"), s);

			atividadeRep.save(a);
			membroRep.save(m);

		}
	}

}

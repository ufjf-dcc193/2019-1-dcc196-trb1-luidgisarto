package br.ufjf.luidgisarto.trb1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufjf.luidgisarto.trb1.models.RelatorioSede;
import br.ufjf.luidgisarto.trb1.models.Sede;

/**
 * SedeRepository
 * 
 */
public interface SedeRepository extends JpaRepository<Sede, Long> {

    @Query(value = "SELECT new br.ufjf.luidgisarto.trb1.models.RelatorioSede(s.id, count(a)) FROM Sede s join s.atividades a group by s.id")
    List<RelatorioSede> getAll();

}
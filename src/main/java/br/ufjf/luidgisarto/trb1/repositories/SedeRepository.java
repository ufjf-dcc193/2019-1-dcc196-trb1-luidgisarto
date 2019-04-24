package br.ufjf.luidgisarto.trb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.luidgisarto.trb1.models.Sede;

/**
 * SedeRepository
 * 
 */
public interface SedeRepository extends JpaRepository<Sede, Long> {

    // @Query(value = "SELECT new
    // br.ufjf.luidgisarto.trb1.models.RelatorioSede(s.id, count(a)) FROM Sede s
    // join s.atividades a group by s.id")
    // List<RelatorioSede> getAll();

}
package br.ufjf.luidgisarto.trb1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufjf.luidgisarto.trb1.models.RelatorioSede;
import br.ufjf.luidgisarto.trb1.models.Sede;

/**
 * SedeRepository
 * 
 * @param <RelatorioSede>
 */
public interface SedeRepository extends JpaRepository<Sede, Long> {
    @Query("")
    public List<RelatorioSede> FindAllWithActivitiesQuery();
}
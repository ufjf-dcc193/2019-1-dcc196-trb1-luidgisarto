package br.ufjf.luidgisarto.trb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.luidgisarto.trb1.models.Sede;

/**
 * SedeRepository
 * 
 * @param <RelatorioSede>
 */
public interface SedeRepository extends JpaRepository<Sede, Long> {

}
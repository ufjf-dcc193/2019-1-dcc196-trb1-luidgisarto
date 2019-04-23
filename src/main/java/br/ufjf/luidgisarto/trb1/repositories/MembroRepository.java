package br.ufjf.luidgisarto.trb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.luidgisarto.trb1.models.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {

}
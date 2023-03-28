package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fabricanteRepository")
public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
}

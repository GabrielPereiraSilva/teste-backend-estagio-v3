package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Operador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("operadorRepository")
public interface OperadorRepository extends JpaRepository<Operador, Integer> {
}

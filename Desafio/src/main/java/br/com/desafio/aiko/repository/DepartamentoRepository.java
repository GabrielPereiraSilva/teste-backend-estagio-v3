package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("departamentoRepository")
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}

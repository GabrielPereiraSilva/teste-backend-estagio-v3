package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.EstadoEquipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("estadoEquipamentoRepository")
public interface EstadoEquipamentoRepository extends JpaRepository<EstadoEquipamento, Integer> {
}

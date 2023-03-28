package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("equipamentoRepository")
public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer> {
}

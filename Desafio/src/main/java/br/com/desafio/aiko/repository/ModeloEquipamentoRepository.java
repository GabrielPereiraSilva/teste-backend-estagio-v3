package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.ModeloEquipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("modeloEquipamentoRepository")
public interface ModeloEquipamentoRepository extends JpaRepository<ModeloEquipamento, Integer> {
}

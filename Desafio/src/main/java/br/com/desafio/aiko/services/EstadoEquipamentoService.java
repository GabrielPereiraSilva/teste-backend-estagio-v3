package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.EstadoEquipamento;

import java.util.List;
import java.util.Optional;

public interface EstadoEquipamentoService {

    Optional<EstadoEquipamento> getEstadoEquipamentoById(Integer id);
    List<EstadoEquipamento> getAllEstadoEquipamento();
    void deleteAllEstadoEquipamento();
    void deleteEstadoEquipamentoById(Integer id);
    void deleteEstadoEquipamento(EstadoEquipamento estadoEquipamento);
    void updateEstadoEquipamentoById(Integer id, EstadoEquipamento estadoEquipamento);
    void updateEstadoEquipamento(EstadoEquipamento estadoEquipamento);
    void insertEstadoEquipamento(EstadoEquipamento estadoEquipamento);
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Equipamento;

import java.util.List;
import java.util.Optional;

public interface EquipamentoService {

    Optional<Equipamento> getEquipamentoById(Integer id);
    List<Equipamento> getAllEquipamentos();
    void deleteAllEquipamentos();
    void deleteEquipamentoById(Integer id);
    void deleteEquipamento(Equipamento equipamento);
    void updateEquipamentoById(Integer id, Equipamento equipamento);
    void updateEquipamento(Equipamento equipamento);
    void insertEquipamento(Equipamento equipamento);
}

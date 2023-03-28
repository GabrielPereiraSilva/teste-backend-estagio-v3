package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.ModeloEquipamento;

import java.util.List;
import java.util.Optional;

public interface ModeloEquipamentoService {
    Optional<ModeloEquipamento> getModeloEquipamentoById(Integer id);
    List<ModeloEquipamento> getAllModeloEquipamentos();
    void deleteAllModeloEquipamentos();
    void deleteModeloEquipamentoById(Integer id);
    void deleteModeloEquipamento(ModeloEquipamento modeloEquipamento);
    void updateModeloEquipamentoById(Integer id, ModeloEquipamento modeloEquipamento);
    void updateModeloEquipamento(ModeloEquipamento modeloEquipamento);
    void insertModeloEquipamento(ModeloEquipamento modeloEquipamento);
}

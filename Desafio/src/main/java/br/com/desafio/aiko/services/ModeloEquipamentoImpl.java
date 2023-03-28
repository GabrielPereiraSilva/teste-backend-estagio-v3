package br.com.desafio.aiko.services;

import br.com.desafio.aiko.repository.ModeloEquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import br.com.desafio.aiko.models.ModeloEquipamento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("modeloEquipamentoService")
public class ModeloEquipamentoImpl implements  ModeloEquipamentoService{

    @Qualifier("modeloEquipamentoRepository")
    @Autowired
    ModeloEquipamentoRepository modeloEquipamentoRepository;

    @Override
    public Optional<ModeloEquipamento> getModeloEquipamentoById(Integer id) {
        return modeloEquipamentoRepository.findById(id);
    }

    @Override
    public List<ModeloEquipamento> getAllModeloEquipamentos() {
        return modeloEquipamentoRepository.findAll();
    }

    @Override
    public void deleteAllModeloEquipamentos() {
        modeloEquipamentoRepository.deleteAll();
    }

    @Override
    public void deleteModeloEquipamentoById(Integer id) {
        modeloEquipamentoRepository.deleteById(id);
    }

    @Override
    public void deleteModeloEquipamento(ModeloEquipamento modeloEquipamento) {
        modeloEquipamentoRepository.delete(modeloEquipamento);
    }

    @Override
    public void updateModeloEquipamentoById(Integer id, ModeloEquipamento modeloEquipamento) {
        Optional<ModeloEquipamento> getModeloEquipamento = getModeloEquipamentoById(id);
        getModeloEquipamento.get().setDescricaoFuncao(modeloEquipamento.getDescricaoFuncao());
        getModeloEquipamento.get().setFabricante(modeloEquipamento.getFabricante());
        getModeloEquipamento.get().setModeloSerie(modeloEquipamento.getModeloSerie());
        getModeloEquipamento.get().setPeso(modeloEquipamento.getPeso());
        getModeloEquipamento.get().setPreco(modeloEquipamento.getPreco());
    }

    @Override
    public void updateModeloEquipamento(ModeloEquipamento modeloEquipamento) {
        modeloEquipamentoRepository.save(modeloEquipamento);
    }

    @Override
    public void insertModeloEquipamento(ModeloEquipamento modeloEquipamento) {
        modeloEquipamentoRepository.save(modeloEquipamento);
    }
}

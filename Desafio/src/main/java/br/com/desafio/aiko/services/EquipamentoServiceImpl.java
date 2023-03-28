package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Equipamento;
import br.com.desafio.aiko.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("equipamentoService")
public class EquipamentoServiceImpl implements EquipamentoService {
    @Qualifier("equipamentoRepository")
    @Autowired
    EquipamentoRepository equipamentoRepository;

    @Override
    public Optional<Equipamento> getEquipamentoById(Integer id) {
        return equipamentoRepository.findById(id);
    }

    @Override
    public List<Equipamento> getAllEquipamentos() {
        return equipamentoRepository.findAll();
    }

    @Override
    public void deleteAllEquipamentos() {
        equipamentoRepository.deleteAll();
    }

    @Override
    public void deleteEquipamentoById(Integer id) {
        equipamentoRepository.deleteById(id);
    }

    @Override
    public void deleteEquipamento(Equipamento equipamento) {
        equipamentoRepository.delete(equipamento);
    }

    @Override
    public void updateEquipamentoById(Integer id, Equipamento equipamento) {
        Optional<Equipamento> getEquipamento = getEquipamentoById(id);
        getEquipamento.get().setHistoricoPosicoes(equipamento.getHistoricoPosicoes());
        getEquipamento.get().setEstadoAtualEquipamento(equipamento.getEstadoAtualEquipamento());
        getEquipamento.get().setModeloEquipamento(equipamento.getModeloEquipamento());
        getEquipamento.get().setNome(equipamento.getNome());
        getEquipamento.get().setGanhosPorEstado(equipamento.getGanhosPorEstado());
    }

    @Override
    public void updateEquipamento(Equipamento equipamento) {
        equipamentoRepository.save(equipamento);
    }

    @Override
    public void insertEquipamento(Equipamento equipamento) {
        equipamentoRepository.save(equipamento);
    }
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.EstadoEquipamento;
import br.com.desafio.aiko.repository.EstadoEquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("estadoEquipamentoService")
public class EstadoEquipamentoImpl implements EstadoEquipamentoService{
    @Qualifier("estadoEquipamentoRepository")
    @Autowired
    EstadoEquipamentoRepository estadoEquipamentoRepository;


    @Override
    public Optional<EstadoEquipamento> getEstadoEquipamentoById(Integer id) {
        return estadoEquipamentoRepository.findById(id);
    }

    @Override
    public List<EstadoEquipamento> getAllEstadoEquipamento() {
        return estadoEquipamentoRepository.findAll();
    }

    @Override
    public void deleteAllEstadoEquipamento() {
        estadoEquipamentoRepository.deleteAll();
    }

    @Override
    public void deleteEstadoEquipamentoById(Integer id) {
        estadoEquipamentoRepository.deleteById(id);
    }

    @Override
    public void deleteEstadoEquipamento(EstadoEquipamento estadoEquipamento) {
        estadoEquipamentoRepository.delete(estadoEquipamento);
    }

    @Override
    public void updateEstadoEquipamentoById(Integer id, EstadoEquipamento estadoEquipamento) {
        Optional<EstadoEquipamento> getEstadoEquipamento = getEstadoEquipamentoById(id);
        getEstadoEquipamento.get().setEstadoAtual(estadoEquipamento.getEstadoAtual());
    }

    @Override
    public void updateEstadoEquipamento(EstadoEquipamento estadoEquipamento) {
        estadoEquipamentoRepository.save(estadoEquipamento);
    }

    @Override
    public void insertEstadoEquipamento(EstadoEquipamento estadoEquipamento) {
        estadoEquipamentoRepository.save(estadoEquipamento);
    }
}

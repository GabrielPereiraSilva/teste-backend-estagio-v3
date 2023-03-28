package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Departamento;
import br.com.desafio.aiko.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("departamentoService")
public class DepartamentoServiceImpl implements DepartamentoService {
    @Qualifier("departamentoRepository")
    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public Optional<Departamento> getDepartamentoById(Integer id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public void deleteAllDepartamentos() {
        departamentoRepository.deleteAll();
    }

    @Override
    public void deleteDepartamentoById(Integer id) {
        departamentoRepository.deleteById(id);
    }

    @Override
    public void deleteDepartamento(Departamento departamento) {
        departamentoRepository.delete(departamento);
    }

    @Override
    public void updateDepartamentoById(Integer id, Departamento departamento) {
        Optional<Departamento> getDepartamento = getDepartamentoById(id);
        getDepartamento.get().setCodigoGerente(departamento.getCodigoGerente());
        getDepartamento.get().setNome(departamento.getNome());
        getDepartamento.get().setTipoDepartamento(departamento.getTipoDepartamento());
        getDepartamento.get().setOperadores(departamento.getOperadores());
    }

    @Override
    public void updateDepartamento(Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @Override
    public void insertDepartamento(Departamento departamento) {
        departamentoRepository.save(departamento);
    }
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Operador;
import br.com.desafio.aiko.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("operadorService")
public class OperadorServiceImpl implements OperadorService {
    @Qualifier("operadorRepository")
    @Autowired
    OperadorRepository operadorRepository;

    @Override
    public Optional<Operador> getOperadorById(Integer id) {
        return operadorRepository.findById(id);
    }

    @Override
    public List<Operador> getAllOperadores() {
        return operadorRepository.findAll();
    }

    @Override
    public void deleteAllOperadores() {
        operadorRepository.deleteAll();
    }

    @Override
    public void deleteOperadorById(Integer id) {
        operadorRepository.deleteById(id);
    }

    @Override
    public void deleteOperador(Operador operador) {
        operadorRepository.delete(operador);
    }

    @Override
    public void updateOperadorById(Integer id, Operador operador) {
        Optional<Operador> getOperador = getOperadorById(id);
        getOperador.get().setCpf(operador.getCpf());
        getOperador.get().setDepartamento(operador.getDepartamento());
        getOperador.get().setEndereco(operador.getEndereco());
        getOperador.get().setNome(operador.getNome());
        getOperador.get().setTelefoneContato(operador.getTelefoneContato());
    }

    @Override
    public void updateOperador(Operador operador) {

    }

    @Override
    public void insertOperador(Operador operador) {

    }
}

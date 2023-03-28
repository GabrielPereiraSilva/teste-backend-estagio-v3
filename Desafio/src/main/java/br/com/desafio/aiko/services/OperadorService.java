package br.com.desafio.aiko.services;


import br.com.desafio.aiko.models.Operador;

import java.util.List;
import java.util.Optional;

public interface OperadorService {

    Optional<Operador> getOperadorById(Integer id);
    List<Operador> getAllOperadores();
    void deleteAllOperadores();
    void deleteOperadorById(Integer id);
    void deleteOperador(Operador operador);
    void updateOperadorById(Integer id, Operador operador);
    void updateOperador(Operador operador);
    void insertOperador(Operador operador);
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoService {

    Optional<Departamento> getDepartamentoById(Integer id);
    List<Departamento> getAllDepartamentos();
    void deleteAllDepartamentos();
    void deleteDepartamentoById(Integer id);
    void deleteDepartamento(Departamento departamento);
    void updateDepartamentoById(Integer id, Departamento departamento);
    void updateDepartamento(Departamento departamento);
    void insertDepartamento(Departamento departamento);
}

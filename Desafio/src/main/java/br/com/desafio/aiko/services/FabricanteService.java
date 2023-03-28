package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Fabricante;

import java.util.List;
import java.util.Optional;

public interface FabricanteService {

    Optional<Fabricante> getFabricanteById(Integer id);
    List<Fabricante> getAllFabricantes();
    void deleteAllFabricantes();
    void deleteFabricanteById(Integer id);
    void deleteFabricante(Fabricante fabricante);
    void updateFabricanteById(Integer id, Fabricante fabricante);
    void updateFabricante(Fabricante fabricante);
    void insertFabricante(Fabricante fabricante);
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Fabricante;
import br.com.desafio.aiko.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("fabricanteService")
public class FabricanteImpl implements FabricanteService {
    @Autowired
    FabricanteRepository fabricanteRepository;

    @Override
    public Optional<Fabricante> getFabricanteById(Integer id) {
        return fabricanteRepository.findById(id);
    }

    @Override
    public List<Fabricante> getAllFabricantes() {
        return fabricanteRepository.findAll();
    }

    @Override
    public void deleteAllFabricantes() {
        fabricanteRepository.deleteAll();
    }

    @Override
    public void deleteFabricanteById(Integer id) {
        fabricanteRepository.deleteById(id);
    }

    @Override
    public void deleteFabricante(Fabricante fabricante) {
        fabricanteRepository.delete(fabricante);
    }

    @Override
    public void updateFabricanteById(Integer id, Fabricante fabricante) {
        Optional<Fabricante> getFabricante = getFabricanteById(id);
        getFabricante.get().setCnpj(fabricante.getCnpj());
        getFabricante.get().setEnderecoPrincipal(fabricante.getEnderecoPrincipal());
        getFabricante.get().setNome(fabricante.getNome());
    }

    @Override
    public void updateFabricante(Fabricante fabricante) {
        fabricanteRepository.save(fabricante);
    }

    @Override
    public void insertFabricante(Fabricante fabricante) {
        fabricanteRepository.save(fabricante);
    }
}

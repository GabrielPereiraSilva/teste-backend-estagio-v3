package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.EstadoEquipamento;
import br.com.desafio.aiko.models.Fabricante;
import br.com.desafio.aiko.services.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerFabricante {
    @Autowired
    FabricanteService fabricanteService;

    @RequestMapping(value = "fabricante", method = RequestMethod.GET)
    public List<Fabricante> getFabricante(){
        return fabricanteService.getAllFabricantes();
    }
    @RequestMapping(value = "fabricante/{id}", method = RequestMethod.GET)
    public Optional<Fabricante> getFabricanteById(@PathVariable("id") Integer id){
        return fabricanteService.getFabricanteById(id);
    }
    @RequestMapping(value = "fabricante", method = RequestMethod.POST)
    public void insertFabricante(@RequestBody Fabricante fabricante){
        fabricanteService.insertFabricante(fabricante);
    }
    @RequestMapping(value = "fabricante", method = RequestMethod.PUT)
    public void updateFabricante(@RequestBody Fabricante fabricante){
        fabricanteService.updateFabricante(fabricante);
    }
    @RequestMapping(value = "fabricante/{id}", method = RequestMethod.DELETE)
    public void deleteFabricante(@PathVariable("id") Integer id){
        fabricanteService.deleteFabricanteById(id);
    }
    @RequestMapping(value = "fabricante", method = RequestMethod.DELETE)
    public void deleteAllFabricante(){
        fabricanteService.deleteAllFabricantes();
    }
}

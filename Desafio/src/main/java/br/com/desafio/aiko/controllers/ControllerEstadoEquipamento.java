package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Equipamento;
import br.com.desafio.aiko.models.EstadoEquipamento;
import br.com.desafio.aiko.services.EstadoEquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerEstadoEquipamento {
    @Autowired
    EstadoEquipamentoService estadoEquipamentoService;

    @RequestMapping(value = "estadoEquipamento", method = RequestMethod.GET)
    public List<EstadoEquipamento> getEstadoEquipamento(){
        return estadoEquipamentoService.getAllEstadoEquipamento();
    }
    @RequestMapping(value = "estadoEquipamento/{id}", method = RequestMethod.GET)
    public Optional<EstadoEquipamento> getEstadoEquipamentoById(@PathVariable("id") Integer id){
        return estadoEquipamentoService.getEstadoEquipamentoById(id);
    }
    @RequestMapping(value = "estadoEquipamento", method = RequestMethod.POST)
    public void insertEstadoEquipamento(@RequestBody EstadoEquipamento estadoEquipamento){
        estadoEquipamentoService.insertEstadoEquipamento(estadoEquipamento);
    }
    @RequestMapping(value = "estadoEquipamento", method = RequestMethod.PUT)
    public void updateEstadoEquipamento(@RequestBody EstadoEquipamento estadoEquipamento){
        estadoEquipamentoService.updateEstadoEquipamento(estadoEquipamento);
    }
    @RequestMapping(value = "estadoEquipamento/{id}", method = RequestMethod.DELETE)
    public void deleteEstadoEquipamento(@PathVariable("id") Integer id){
        estadoEquipamentoService.deleteEstadoEquipamentoById(id);
    }
    @RequestMapping(value = "estadoEquipamento", method = RequestMethod.DELETE)
    public void deleteAllEstadoEquipamento(){
        estadoEquipamentoService.deleteAllEstadoEquipamento();
    }
}

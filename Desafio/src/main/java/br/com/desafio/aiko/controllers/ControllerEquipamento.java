package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Equipamento;
import br.com.desafio.aiko.services.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerEquipamento {
    @Autowired
    EquipamentoService equipamentoService;

    @RequestMapping(value = "equipamentos", method = RequestMethod.GET)
    public List<Equipamento> getEquipamentos(){
        return equipamentoService.getAllEquipamentos();
    }
    @RequestMapping(value = "equipamentos/{id}", method = RequestMethod.GET)
    public Optional<Equipamento> getEquipamentoById(@PathVariable("id") Integer id){
        return equipamentoService.getEquipamentoById(id);
    }
    @RequestMapping(value = "equipamentos", method = RequestMethod.POST)
    public void insertEquipamento(@RequestBody Equipamento equipamento){
        equipamentoService.insertEquipamento(equipamento);
    }
    @RequestMapping(value = "equipamentos", method = RequestMethod.PUT)
    public void updateEquipamento(@RequestBody Equipamento equipamento){
        equipamentoService.updateEquipamento(equipamento);
    }
    @RequestMapping(value = "equipamentos/{id}", method = RequestMethod.DELETE)
    public void deleteEquipamento(@PathVariable("id") Integer id){
        equipamentoService.deleteEquipamentoById(id);
    }
    @RequestMapping(value = "equipamentos", method = RequestMethod.DELETE)
    public void deleteAllEquipamento(){
        equipamentoService.deleteAllEquipamentos();
    }

}

package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.ModeloEquipamento;
import br.com.desafio.aiko.services.ModeloEquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerModeloEquipamento {
    @Autowired
    ModeloEquipamentoService modeloEquipamentoService;

    @RequestMapping(value = "modeloEquipamento", method = RequestMethod.GET)
    public List<ModeloEquipamento> getModeloEquipamento(){
        return modeloEquipamentoService.getAllModeloEquipamentos();
    }
    @RequestMapping(value = "modeloEquipamento/{id}", method = RequestMethod.GET)
    public Optional<ModeloEquipamento> getModeloEquipamentoById(@PathVariable("id") Integer id){
        return modeloEquipamentoService.getModeloEquipamentoById(id);
    }
    @RequestMapping(value = "modeloEquipamento", method = RequestMethod.POST)
    public void insertModeloEquipamento(@RequestBody ModeloEquipamento modeloEquipamento){
        modeloEquipamentoService.insertModeloEquipamento(modeloEquipamento);
    }
    @RequestMapping(value = "modeloEquipamento", method = RequestMethod.PUT)
    public void updateModeloEquipamento(@RequestBody ModeloEquipamento modeloEquipamento){
        modeloEquipamentoService.updateModeloEquipamento(modeloEquipamento);
    }
    @RequestMapping(value = "modeloEquipamento/{id}", method = RequestMethod.DELETE)
    public void deleteModeloEquipamento(@PathVariable("id") Integer id){
        modeloEquipamentoService.deleteModeloEquipamentoById(id);
    }
    @RequestMapping(value = "modeloEquipamento", method = RequestMethod.DELETE)
    public void deleteAllModeloEquipamento(){
        modeloEquipamentoService.deleteAllModeloEquipamentos();
    }
}

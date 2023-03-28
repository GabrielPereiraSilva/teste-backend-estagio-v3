package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Departamento;
import br.com.desafio.aiko.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerDepartamento {
    @Autowired
    private DepartamentoService departamentoService;

    @RequestMapping(value = "departamento", method = RequestMethod.GET)
    public List<Departamento> getDepartamentos(){
        return departamentoService.getAllDepartamentos();
    }
    @RequestMapping(value = "departamento/{id}", method = RequestMethod.GET)
    public Optional<Departamento> getDepartamentoById(@PathVariable("id") Integer id){
        return departamentoService.getDepartamentoById(id);
    }
    @RequestMapping(value = "departamento", method = RequestMethod.POST)
    public void insertDepartamento(@RequestBody Departamento departamento){
        departamentoService.insertDepartamento(departamento);
    }
    @RequestMapping(value = "departamento", method = RequestMethod.PUT)
    public void updateDepartamento(@RequestBody Departamento departamento){
        departamentoService.updateDepartamento(departamento);
    }
    @RequestMapping(value = "departamento/{id}", method = RequestMethod.DELETE)
    public void deleteDepartamento(@PathVariable("id") Integer id){
        departamentoService.deleteDepartamentoById(id);
    }
    @RequestMapping(value = "departamento", method = RequestMethod.DELETE)
    public void deleteAllDepartamentos(){
        departamentoService.deleteAllDepartamentos();
    }
}

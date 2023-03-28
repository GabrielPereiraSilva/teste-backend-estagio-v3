package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Operador;
import br.com.desafio.aiko.services.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerOperador {
    @Autowired
    OperadorService operadorService;

    @RequestMapping(value = "operadores", method = RequestMethod.GET)
    public List<Operador> getOperadores(){
        return operadorService.getAllOperadores();
    }
    @RequestMapping(value = "operadores/{id}", method = RequestMethod.GET)
    public Optional<Operador> getOperadorById(@PathVariable("id") Integer id){
        return operadorService.getOperadorById(id);
    }
    @RequestMapping(value = "operadores", method = RequestMethod.POST)
    public void insertOperador(@RequestBody Operador operadores){
        operadorService.insertOperador(operadores);
    }
    @RequestMapping(value = "operadores", method = RequestMethod.PUT)
    public void updateOperador(@RequestBody Operador operadores){
        operadorService.updateOperador(operadores);
    }
    @RequestMapping(value = "operadores/{id}", method = RequestMethod.DELETE)
    public void deleteOperador(@PathVariable("id") Integer id){
        operadorService.deleteOperadorById(id);
    }
    @RequestMapping(value = "operadores", method = RequestMethod.DELETE)
    public void deleteAllOperadores(){
        operadorService.deleteAllOperadores();
    }
}

package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Endereco;
import br.com.desafio.aiko.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerEndereco {
    @Autowired
    private EnderecoService enderecoService;

    @RequestMapping(value = "enderecos", method = RequestMethod.GET)
    public List<Endereco> getEndereco(){
        return enderecoService.getAllEnderecos();
    }
    @RequestMapping(value = "enderecos/{id}", method = RequestMethod.GET)
    public Optional<Endereco> getEnderecoById(@PathVariable("id") Integer id){
        return enderecoService.getEnderecoById(id);
    }
    @RequestMapping(value = "enderecos", method = RequestMethod.POST)
    public void insertEndereco(@RequestBody Endereco endereco){
        enderecoService.insertEndereco(endereco);
    }
    @RequestMapping(value = "enderecos", method = RequestMethod.PUT)
    public void updateEndereco(@RequestBody Endereco endereco){
        enderecoService.updateEndereco(endereco);
    }
    @RequestMapping(value = "enderecos/{id}", method = RequestMethod.DELETE)
    public void deleteEndereco(@PathVariable("id") Integer id){
        enderecoService.deleteEnderecoById(id);
    }
    @RequestMapping(value = "enderecos", method = RequestMethod.DELETE)
    public void deleteAllEndereco(){
        enderecoService.deleteAllEnderecos();
    }
}

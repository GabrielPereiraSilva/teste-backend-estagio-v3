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

    @RequestMapping(value = "endereco", method = RequestMethod.GET)
    public List<Endereco> getEndereco(){
        return enderecoService.getAllEnderecos();
    }
    @RequestMapping(value = "endereco/{id}", method = RequestMethod.GET)
    public Optional<Endereco> getEnderecoById(@PathVariable("id") Integer id){
        return enderecoService.getEnderecoById(id);
    }
    @RequestMapping(value = "endereco", method = RequestMethod.POST)
    public void insertEndereco(@RequestBody Endereco endereco){
        enderecoService.insertEndereco(endereco);
    }
    @RequestMapping(value = "endereco", method = RequestMethod.PUT)
    public void updateEndereco(@RequestBody Endereco endereco){
        enderecoService.updateEndereco(endereco);
    }
    @RequestMapping(value = "endereco/{id}", method = RequestMethod.DELETE)
    public void deleteEndereco(@PathVariable("id") Integer id){
        enderecoService.deleteEnderecoById(id);
    }
    @RequestMapping(value = "endereco", method = RequestMethod.DELETE)
    public void deleteAllEndereco(){
        enderecoService.deleteAllEnderecos();
    }
}

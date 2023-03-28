package br.com.desafio.aiko.controllers;

import br.com.desafio.aiko.models.Geolocalizacao;
import br.com.desafio.aiko.services.GeolocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerGeolocalizacao {
    @Autowired
    GeolocalizacaoService geolocalizacaoService;

    @RequestMapping(value = "geolocalizacao", method = RequestMethod.GET)
    public List<Geolocalizacao> getGeolocalizacao(){
        return geolocalizacaoService.getAllGeolocalizacoes();
    }
    @RequestMapping(value = "geolocalizacao/{id}", method = RequestMethod.GET)
    public Optional<Geolocalizacao> getGeolocalizacaoById(@PathVariable("id") Integer id){
        return geolocalizacaoService.getGeolocalizacaoById(id);
    }
    @RequestMapping(value = "geolocalizacao", method = RequestMethod.POST)
    public void insertGeolocalizacao(@RequestBody Geolocalizacao geolocalizacao){
        geolocalizacaoService.insertGeolocalizacao(geolocalizacao);
    }
    @RequestMapping(value = "geolocalizacao", method = RequestMethod.PUT)
    public void updateGeolocalizacao(@RequestBody Geolocalizacao geolocalizacao){
        geolocalizacaoService.updateGeolocalizacao(geolocalizacao);
    }
    @RequestMapping(value = "geolocalizacao/{id}", method = RequestMethod.DELETE)
    public void deleteGeolocalizacao(@PathVariable("id") Integer id){
        geolocalizacaoService.deleteGeolocalizacaoById(id);
    }
    @RequestMapping(value = "geolocalizacao", method = RequestMethod.DELETE)
    public void deleteAllGeolocalizacoes(){
        geolocalizacaoService.deleteAllGeolocalizacoes();
    }
}

package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Geolocalizacao;

import java.util.List;
import java.util.Optional;

public interface GeolocalizacaoService {

    Optional<Geolocalizacao> getGeolocalizacaoById(Integer id);
    List<Geolocalizacao> getAllGeolocalizacoes();
    void deleteAllGeolocalizacoes();
    void deleteGeolocalizacaoById(Integer id);
    void deleteGeolocalizacao(Geolocalizacao geolocalizacao);
    void updateGeolocalizacaoById(Integer id, Geolocalizacao geolocalizacao);
    void updateGeolocalizacao(Geolocalizacao geolocalizacao);
    void insertGeolocalizacao(Geolocalizacao geolocalizacao);
}

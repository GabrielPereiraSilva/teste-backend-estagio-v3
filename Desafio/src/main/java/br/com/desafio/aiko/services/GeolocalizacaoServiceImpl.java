package br.com.desafio.aiko.services;


import br.com.desafio.aiko.models.Geolocalizacao;
import br.com.desafio.aiko.repository.GeolocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GeolocalizacaoService")
public class GeolocalizacaoServiceImpl implements GeolocalizacaoService {
    @Qualifier("geolocalizacaoRepository")
    @Autowired
    GeolocalizacaoRepository geolocalizacaoRepository;

    @Override
    public Optional<Geolocalizacao> getGeolocalizacaoById(Integer id) {
        return geolocalizacaoRepository.findById(id);
    }

    @Override
    public List<Geolocalizacao> getAllGeolocalizacoes() {
        return geolocalizacaoRepository.findAll();
    }

    @Override
    public void deleteAllGeolocalizacoes() {
        geolocalizacaoRepository.deleteAll();
    }

    @Override
    public void deleteGeolocalizacaoById(Integer id) {
        geolocalizacaoRepository.deleteById(id);
    }

    @Override
    public void deleteGeolocalizacao(Geolocalizacao geolocalizacao) {
        geolocalizacaoRepository.delete(geolocalizacao);
    }

    @Override
    public void updateGeolocalizacaoById(Integer id, Geolocalizacao geolocalizacao) {
        Optional<Geolocalizacao> getGeolocalizacao = getGeolocalizacaoById(id);
        getGeolocalizacao.get().setUltimoEndereco(geolocalizacao.getUltimoEndereco());
    }

    @Override
    public void updateGeolocalizacao(Geolocalizacao geolocalizacao) {
        geolocalizacaoRepository.save(geolocalizacao);
    }

    @Override
    public void insertGeolocalizacao(Geolocalizacao geolocalizacao) {
        geolocalizacaoRepository.save(geolocalizacao);
    }
}

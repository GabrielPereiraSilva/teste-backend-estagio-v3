package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Geolocalizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("geolocalizacaoRepository")
public interface GeolocalizacaoRepository extends JpaRepository<Geolocalizacao, Integer> {
}

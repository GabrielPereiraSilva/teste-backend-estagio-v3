package br.com.desafio.aiko.repository;

import br.com.desafio.aiko.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("enderecoRepository")
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}

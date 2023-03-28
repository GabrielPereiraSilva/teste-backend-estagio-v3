package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Endereco;

import java.util.List;
import java.util.Optional;

public interface EnderecoService {

    Optional<Endereco> getEnderecoById(Integer id);
    List<Endereco> getAllEnderecos();
    void deleteAllEnderecos();
    void deleteEnderecoById(Integer id);
    void deleteEndereco(Endereco endereco);
    void updateEnderecoById(Integer id, Endereco endereco);
    void updateEndereco(Endereco endereco);
    void insertEndereco(Endereco endereco);
}

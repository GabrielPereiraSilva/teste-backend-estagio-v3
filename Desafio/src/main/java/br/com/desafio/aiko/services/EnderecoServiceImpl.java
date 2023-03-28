package br.com.desafio.aiko.services;

import br.com.desafio.aiko.models.Endereco;
import br.com.desafio.aiko.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("enderecoService")
public class EnderecoServiceImpl implements EnderecoService {
    @Qualifier("enderecoRepository")
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Optional<Endereco> getEnderecoById(Integer id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    @Override
    public void deleteAllEnderecos() {
        enderecoRepository.deleteAll();
    }

    @Override
    public void deleteEnderecoById(Integer id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        enderecoRepository.delete(endereco);
    }

    @Override
    public void updateEnderecoById(Integer id, Endereco endereco) {
        Optional<Endereco> getEndereco = getEnderecoById(id);
        getEndereco.get().setBairro(endereco.getBairro());
        getEndereco.get().setCep(endereco.getCep());
        getEndereco.get().setCidade(endereco.getCidade());
        getEndereco.get().setComplemento(endereco.getComplemento());
        getEndereco.get().setEstado(endereco.getEstado());
        getEndereco.get().setNumeroResidencial(endereco.getNumeroResidencial());
        getEndereco.get().setRua(endereco.getRua());
    }

    @Override
    public void updateEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void insertEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }
}

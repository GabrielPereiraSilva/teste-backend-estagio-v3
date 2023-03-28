package br.com.desafio.aiko.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Geolocalizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco ultimoEndereco;
    @OneToMany
    @JoinColumn(name = "endereco_id")
    private List<Endereco> ultimosEnderecos = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getUltimoEndereco() {
        return ultimoEndereco;
    }

    public void setUltimoEndereco(Endereco ultimoEndereco) {
        this.ultimoEndereco = ultimoEndereco;
        this.ultimosEnderecos.add(ultimoEndereco);
    }

    public List<Endereco> getUltimosEnderecos() {
        return ultimosEnderecos;
    }

}

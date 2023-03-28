package br.com.desafio.aiko.models;

import javax.persistence.*;

@Entity
public class Operador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String nome;
    @OneToOne
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamento departamento;
    private String cpf;
    private int telefoneContato;
    @OneToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}

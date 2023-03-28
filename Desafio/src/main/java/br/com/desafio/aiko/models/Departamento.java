package br.com.desafio.aiko.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String nome;
    private String tipoDepartamento;
    private int codigoGerente;
    @OneToMany
    @JoinColumn(name="operador_id")
    private List<Operador> operadores = new ArrayList<>();

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

    public String getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(String tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    public List<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(List<Operador> operadores) {
        this.operadores = operadores;
    }

    public int getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }
}

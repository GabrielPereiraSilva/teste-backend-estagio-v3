package br.com.desafio.aiko.models;

import javax.persistence.*;

@Entity
public class ModeloEquipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String descricaoFuncao;
    private String modeloSerie;
    @OneToOne
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;
    private double peso;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoFuncao() {
        return descricaoFuncao;
    }

    public void setDescricaoFuncao(String descricaoFuncao) {
        this.descricaoFuncao = descricaoFuncao;
    }

    public String getModeloSerie() {
        return modeloSerie;
    }

    public void setModeloSerie(String modeloSerie) {
        this.modeloSerie = modeloSerie;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

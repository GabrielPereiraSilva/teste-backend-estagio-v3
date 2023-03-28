package br.com.desafio.aiko.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Equipamento {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private double ganhosPorEstado;
    @OneToOne
    @JoinColumn(name = "estadoEquipamento_id")
    private EstadoEquipamento estadoAtualEquipamento;
    @ManyToOne
    @JoinColumn(name = "modeloEquipamento_id", nullable=false)
    private ModeloEquipamento modeloEquipamento;
    @ManyToMany
    @JoinColumn(name="geolocalizacao_id", nullable=false)
    private List<Geolocalizacao> historicoPosicoes = new ArrayList<>();
    @ManyToMany
    @JoinColumn(name="estadoEquipamento_id")
    private List<EstadoEquipamento> historicoEstados = new ArrayList<>();

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

    public List<Geolocalizacao> getHistoricoPosicoes() {
        return historicoPosicoes;
    }

    public void setHistoricoPosicoes(List<Geolocalizacao> historicoPosicoes) {
        this.historicoPosicoes = historicoPosicoes;
    }

    public EstadoEquipamento getEstadoAtualEquipamento() {
        return estadoAtualEquipamento;
    }

    public void setEstadoAtualEquipamento(EstadoEquipamento estadoAtualEquipamento) {
        this.estadoAtualEquipamento = estadoAtualEquipamento;
    }

    public ModeloEquipamento getModeloEquipamento() {
        return modeloEquipamento;
    }

    public void setModeloEquipamento(ModeloEquipamento modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }

    public double getGanhosPorEstado() {
        return ganhosPorEstado;
    }

    public void setGanhosPorEstado(double ganhosPorEstado) {
        this.ganhosPorEstado = ganhosPorEstado;
    }
}

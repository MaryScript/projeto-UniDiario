package br.edu.undf.unidiario.model;

import java.time.LocalDate;

public class Avaliacao {
    private int idAvaliacao;
    private String descricao;
    private double peso;
    private LocalDate dataPrazo;
    
    // Relacionamento: Uma avaliação pertence a uma Turma
    private Turma turma;

    public Avaliacao() {
    }

    public Avaliacao(int idAvaliacao, String descricao, double peso, LocalDate dataPrazo, Turma turma) {
        this.idAvaliacao = idAvaliacao;
        this.descricao = descricao;
        this.peso = peso;
        this.dataPrazo = dataPrazo;
        this.turma = turma;
    }

    // Getters e Setters
    public int getIdAvaliacao() { return idAvaliacao; }
    public void setIdAvaliacao(int idAvaliacao) { this.idAvaliacao = idAvaliacao; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public LocalDate getDataPrazo() { return dataPrazo; }
    public void setDataPrazo(LocalDate dataPrazo) { this.dataPrazo = dataPrazo; }

    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
}
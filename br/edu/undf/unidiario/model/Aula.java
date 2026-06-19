package br.edu.undf.unidiario.model;

import java.time.LocalDate;

public class Aula {
    private int idAula;
    private LocalDate dataAula;
    private String conteudoMinistrado;
    
    // Relacionamento: Uma aula pertence a uma Turma específica
    private Turma turma;

    public Aula() {
    }

    public Aula(int idAula, LocalDate dataAula, String conteudoMinistrado, Turma turma) {
        this.idAula = idAula;
        this.dataAula = dataAula;
        this.conteudoMinistrado = conteudoMinistrado;
        this.turma = turma;
    }

    // Getters e Setters
    public int getIdAula() { return idAula; }
    public void setIdAula(int idAula) { this.idAula = idAula; }

    public LocalDate getDataAula() { return dataAula; }
    public void setDataAula(LocalDate dataAula) { this.dataAula = dataAula; }

    public String getConteudoMinistrado() { return conteudoMinistrado; }
    public void setConteudoMinistrado(String conteudoMinistrado) { this.conteudoMinistrado = conteudoMinistrado; }

    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
}
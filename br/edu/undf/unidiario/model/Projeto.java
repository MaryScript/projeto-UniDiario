package br.edu.undf.unidiario.model;

import java.time.LocalDate;
import java.util.List;

public class Projeto {
    private int idProjeto;
    private String titulo;
    private String tipo; // "Pesquisa" ou "Extensão"
    private LocalDate dataInicio;
    private LocalDate dataFim;

    // Relacionamentos N:N (Um projeto tem uma lista de alunos participando e professores orientando)
    private List<Aluno> alunosParticipantes;
    private List<Professor> professoresOrientadores;

    public Projeto() {
    }

    public Projeto(int idProjeto, String titulo, String tipo, LocalDate dataInicio, LocalDate dataFim) {
        this.idProjeto = idProjeto;
        this.titulo = titulo;
        this.tipo = tipo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e Setters
    public int getIdProjeto() { return idProjeto; }
    public void setIdProjeto(int idProjeto) { this.idProjeto = idProjeto; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    public List<Aluno> getAlunosParticipantes() { return alunosParticipantes; }
    public void setAlunosParticipantes(List<Aluno> alunosParticipantes) { this.alunosParticipantes = alunosParticipantes; }

    public List<Professor> getProfessoresOrientadores() { return professoresOrientadores; }
    public void setProfessoresOrientadores(List<Professor> professoresOrientadores) { this.professoresOrientadores = professoresOrientadores; }
}
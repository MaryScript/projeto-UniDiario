package br.edu.undf.unidiario.model;

import java.util.List;

public class Turma {
    private int idTurma;
    private String semestreLetivo;
    private String periodo;

    // Relacionamentos: Uma turma possui 1 Professor e 1 Disciplina
    private Professor professor;
    private Disciplina disciplina;
    
    // Uma turma possui uma lista de matrículas (relacionamento N:N)
    private List<Matricula> matriculas;

    public Turma(int idTurma, String semestreLetivo, String periodo, Professor professor, Disciplina disciplina) {
        this.idTurma = idTurma;
        this.semestreLetivo = semestreLetivo;
        this.periodo = periodo;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public int getIdTurma() { return idTurma; }
    public void setIdTurma(int idTurma) { this.idTurma = idTurma; }

    public String getSemestreLetivo() { return semestreLetivo; }
    public void setSemestreLetivo(String semestreLetivo) { this.semestreLetivo = semestreLetivo; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }

    public List<Matricula> getMatriculas() { return matriculas; }
    public void setMatriculas(List<Matricula> matriculas) { this.matriculas = matriculas; }
}
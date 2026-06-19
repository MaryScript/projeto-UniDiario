package br.edu.undf.unidiario.model;

public class Professor {
    private int idProfessor;
    private String matriculaFuncional;
    private String nomeProfessor;

    public Professor() {}

    public int getIdProfessor() { return idProfessor; }
    public void setIdProfessor(int idProfessor) { this.idProfessor = idProfessor; }

    public String getMatriculaFuncional() { return matriculaFuncional; }
    public void setMatriculaFuncional(String matriculaFuncional) { this.matriculaFuncional = matriculaFuncional; }

    public String getNomeProfessor() { return nomeProfessor; }
    public void setNomeProfessor(String nomeProfessor) { this.nomeProfessor = nomeProfessor; }
}
package br.edu.undf.unidiario.model;

public class Matricula {
    // A classe intermédia conhece os dois lados da relação
    private Aluno aluno;
    private Turma turma;
    
    private double mediaFinal;
    private int totalFaltas;
    private String situacaoFinal; // Aprovado, Reprovado

    public Matricula() {
    }

    public String verificarSituacao() {
        // Lógica de fechamento de diário automático
        return this.situacaoFinal;
    }

    // Getters e Setters
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }

    public double getMediaFinal() { return mediaFinal; }
    public void setMediaFinal(double mediaFinal) { this.mediaFinal = mediaFinal; }

    public int getTotalFaltas() { return totalFaltas; }
    public void setTotalFaltas(int totalFaltas) { this.totalFaltas = totalFaltas; }

    public String getSituacaoFinal() { return situacaoFinal; }
    public void setSituacaoFinal(String situacaoFinal) { this.situacaoFinal = situacaoFinal; }
}
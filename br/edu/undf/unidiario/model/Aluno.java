package br.edu.undf.unidiario.model;

public class Aluno {
    // Atributos privados (Encapsulamento)
    private int idAluno;
    private String matricula;
    private String nomeAluno;
    private double ira;

    // Construtor Vazio (Necessário para frameworks e boas práticas)
    public Aluno() {
    }

    // Construtor Cheio
    public Aluno(int idAluno, String matricula, String nomeAluno, double ira) {
        this.idAluno = idAluno;
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.ira = ira;
    }

    public double calcularIRA() {
        return this.ira;
    }

    // --- GETTERS E SETTERS (Permitem acessar os dados privados com segurança) ---
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNomeAluno() { return nomeAluno; }
    public void setNomeAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }

    public double getIra() { return ira; }
    public void setIra(double ira) { this.ira = ira; }
}
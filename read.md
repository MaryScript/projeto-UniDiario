```mermaid
classDiagram
    %% --- CLASSES PRINCIPAIS ---
    class Aluno {
        -int idAluno
        -String matricula
        -String nomeAluno
        -double ira
        +calcularIRA() double
    }

    class Professor {
        -int idProfessor
        -String matriculaFuncional
        -String nomeProfessor
    }

    class Disciplina {
        -int idDisciplina
        -String nomeDisciplina
        -int cargaHoraria
    }

    class Turma {
        -int idTurma
        -String semestreLetivo
        -String periodo
        -Disciplina disciplina
        -Professor professor
        -List~Matricula~ matriculas
    }

    class Aula {
        -int idAula
        -LocalDate dataAula
        -String conteudoMinistrado
        -Turma turma
    }

    class Avaliacao {
        -int idAvaliacao
        -String descricao
        -double peso
        -LocalDate dataPrazo
        -Turma turma
    }
    
    class Matricula {
        -Aluno aluno
        -Turma turma
        -double mediaFinal
        -int totalFaltas
        -String situacaoFinal
        +verificarSituacao() String
    }

    class Projeto {
        -int idProjeto
        -String titulo
        -String tipo
        -LocalDate dataInicio
        -LocalDate dataFim
        -List~Aluno~ alunosParticipantes
        -List~Professor~ professoresOrientadores
    }


   %% Relacionamento Disciplina e Professor com a Turma
    Disciplina "1" <-- "0..*" Turma : baseia-se em
    Professor "1" <-- "0..*" Turma : ministra
    
    %% Relacionamento Bidirecional: Turma, Aula e Avaliação
    Turma "1" *--> "0..*" Aula : possui (Composição)
    Aula "1" --> "1" Turma : pertence a
    
    Turma "1" *--> "0..*" Avaliacao : contém (Composição)
    Avaliacao "1" --> "1" Turma : pertence a

    %% A Classe Intermédia Matricula unindo Aluno e Turma (Bidirecional)
    Aluno "1" <-- "0..*" Matricula : associado a
    Matricula "1" --> "1" Aluno : pertence a
    
    Turma "1" <-- "0..*" Matricula : possui inscritos
    Matricula "1" --> "1" Turma : vinculada a

    %% Relações do Módulo de Pesquisa e Extensão (Projetos)
    Projeto "0..*" --> "0..*" Aluno : alunosParticipantes (List)
    Projeto "0..*" --> "0..*" Professor : professoresOrientadores (List)
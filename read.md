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

    class Projeto {
        -int idProjeto
        -String titulo
        -String tipo
        -LocalDate dataInicio
        -LocalDate dataFin
    }

    %% --- CLASSES INTERMÉDIAS (Muitos-para-Muitos) ---
    class Matricula {
        -Aluno aluno
        -Turma turma
        -double mediaFinal
        -int totalFaltas
        -String situacaoFinal
        +verificarSituacao() String
    }

    class Frequencia {
        -Aluno aluno
        -Aula aula
        -boolean frequentou
    }

    class Nota {
        -Aluno aluno
        -Avaliacao avaliacao
        -double notaObtida
    }

    class ParticipacaoProjeto {
        -Aluno aluno
        -Projeto projeto
        -String funcaoAluno
        -int horasDedicadas
    }

    class OrientacaoProjeto {
        -Professor professor
        -Projeto projeto
    }

    %% --- RELACIONAMENTOS ---
    Disciplina "1" -- "0..*" Turma : origina
    Professor "1" -- "0..*" Turma : ministra
    Turma "1" -- "0..*" Aula : possui
    Turma "1" -- "0..*" Avaliacao : contem

    %% Relações N:N resolvidas pelas classes intermédias
    Aluno "1" -- "0..*" Matricula : possui
    Turma "1" -- "0..*" Matricula : contem

    Aluno "1" -- "0..*" Frequencia : registra
    Aula "1" -- "0..*" Frequencia : contem

    Aluno "1" -- "0..*" Nota : possui
    Avaliacao "1" -- "0..*" Nota : avalia

    Aluno "1" -- "0..*" ParticipacaoProjeto : atua
    Projeto "1" -- "0..*" ParticipacaoProjeto : possui

    Professor "1" -- "0..*" OrientacaoProjeto : orienta
    Projeto "1" -- "0..*" OrientacaoProjeto : supervisiona
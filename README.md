# UniDiario - UnDF

Sistema de gestão acadêmica e diário de classe desenvolvido para a UnDF. O projeto foi feito em Java e estruturado usando POO para controlar notas, faltas, turmas e projetos de pesquisa/extensão.

## Tecnologias
* Java 17
* MySQL
* Mermaid 

## Estrutura do Pacote Model
Os arquivos foram criados em `src/main/java/br/edu/undf/unidiario/model/`:

* `Aluno.java`: Dados do aluno e método do IRA.
* `Professor.java`: Cadastro dos professores.
* `Disciplina.java`: Nome da matéria e carga horária.
* `Turma.java`: Junta professor, disciplina, e as listas de matrículas, aulas e avaliações.
* `Aula.java`: Diário de conteúdo e data.
* `Avaliacao.java`: Provas/trabalhos e pesos da nota.
* `Matricula.java`: Tabela intermediária que junta Aluno e Turma para guardar a média final e faltas.
* `Projeto.java`: Cadastro dos projetos de Pesquisa e Extensão.

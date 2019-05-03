package br.com.digitalhouse;

import java.util.List;

public class DigitalHouseManager {

    List<Aluno> alunos = (List<Aluno>) new Aluno();

    List<Professor> professores = (List<Professor>) new Professor();

    List<Curso> cursos = (List<Curso>) new Curso();

    List<Matricula> matriculas = (List<Matricula>) new Matricula();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {

    }

    public void excluirCurso(Integer codigoCurso) {
        for (codigoCurso : Curso) {
            Curso.remove(codigoCurso);
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadedeHoras) {
       ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(registrarProfessorAdjunto());
        System.out.println(professorAdjunto + "foi registrado com sucesso!");
       }



    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(registrarProfessorTitular());
        System.out.println(professorTitular + "registrado com sucesso!");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (codigoProfessor: Professor) {
            if (codigoProfessor == codigoProfessor) {
                Professor.remove(codigoProfessor);
                System.out.println(codigoProfessor + "foi removido com sucesso!");
            }
        }
    }

    public void matricularAluno (String nome, String sobrenome, Integer codigoAluno){
        Aluno novoAluno = new Aluno();
       for(novoAluno : Aluno){
            if( novoAluno != Aluno){
                Aluno.add(novoAluno);
            }
        }
    }




}


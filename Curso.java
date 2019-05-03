package br.com.digitalhouse;

import java.util.List;

public class Curso {

    private String nome;
    private Integer codigo;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeAlunos;


    public Curso() {
    }

    public Curso(String nome, Integer codigo, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer quantidadeAlunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(Integer quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno) {
        boolean vaga = true;
        for (umAluno:
             Aluno) {
            if (quantidadeAlunos < 30) {
                quantidadeAlunos.add(vaga);
                System.out.println(umAluno + "Foi matriculado com sucesso!");
            else{
                    boolean vaga = false;
                    System.out.println("Não há vagas para essa turma!");
                }

                public void excluirAluno (Aluno umAluno){
                    Aluno.remove(umAluno);
                    System.out.println("Aluno excluído com sucesso!");
                }
            }
        }
    }
}

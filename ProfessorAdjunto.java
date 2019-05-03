package br.com.digitalhouse;

public class ProfessorAdjunto {

    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;
    private Integer monitoria;

    public ProfessorAdjunto() {
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer monitoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
        this.monitoria = monitoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public Integer getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Integer monitoria) {
        this.monitoria = monitoria;
    }
}

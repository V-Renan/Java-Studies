package br.com.victor.Modulo11.domain;

import java.util.Objects;

/**
 * @author Victor$
 * @date 24/08/2023$
 * Description:
 */
public class Teste implements Comparable<Teste>{

    private String nome;
    private String curso;
    private double nota;
    private String sala;
    private String turno;

    public Teste(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public Teste(String nome, String curso, double nota, String sala, String turno) {
        this(nome, curso, nota);
        this.sala = sala;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String toString() {
        return this.nome;
    }

//    @Override
//    public String toString() {
//        return "Aluno{" +
//                "nome='" + nome + '\'' +
//                ", curso='" + curso + '\'' +
//                ", nota=" + nota +
//                ", sala='" + sala + '\'' +
//                '}';
//    }

    /**
     * Usado para comparação entre objetos e verificar se o mesmo é igual
     * @param teste the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Teste teste) {
        return this.nome.compareTo(teste.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teste teste = (Teste) o;
        return Objects.equals(nome, teste.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

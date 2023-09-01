package br.com.victor.Modulo13.atividade;

/**
 * @author Victor$
 * @date 01/09/2023$
 * Description:
 */
public abstract class Pessoa {

    private String nome;


    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

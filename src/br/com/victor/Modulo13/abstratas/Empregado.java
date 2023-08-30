package br.com.victor.Modulo13.abstratas;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public abstract class Empregado {

    private String nome;

    private String sobrenome;

    private String cpf;



    public abstract Double vencimento();


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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

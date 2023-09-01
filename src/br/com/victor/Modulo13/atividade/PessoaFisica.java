package br.com.victor.Modulo13.atividade;

/**
 * @author Victor$
 * @date 01/09/2023$
 * Description:
 */
public class PessoaFisica extends Pessoa{

    private String cpf;

    private Double impostos;

    private Double heranca;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getImpostos() {
        return impostos;
    }

    public void setImpostos(Double impostos) {
        this.impostos = impostos;
    }

    public Double getHeranca() {
        return heranca;
    }

    public void setHeranca(Double heranca) {
        this.heranca = heranca;
    }
}

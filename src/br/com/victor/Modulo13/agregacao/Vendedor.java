package br.com.victor.Modulo13.agregacao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class Vendedor {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double comissao;

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void vende() {
        System.out.println("Vender");
    }
}

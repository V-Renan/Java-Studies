package br.com.victor.Modulo13.agregacao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class Produto {
    private Long codigo;

    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido() {
        System.out.println("Vendido");
    }
}

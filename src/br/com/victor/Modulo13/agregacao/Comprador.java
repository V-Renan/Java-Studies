package br.com.victor.Modulo13.agregacao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class Comprador {

    private String nome;

    public Comprador(String nome, double verba) {
        this.nome = nome;
        this.verba = verba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double verba;

    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }

    public void compra() {
        System.out.println("Comprar");
    }
}

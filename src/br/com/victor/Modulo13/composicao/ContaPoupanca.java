package br.com.victor.Modulo13.composicao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class ContaPoupanca {

    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

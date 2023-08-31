package br.com.victor.Modulo13.composicao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class ContaCorrente {

    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    private Double saldo;

    private Double ChequeEspecial;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return ChequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        ChequeEspecial = chequeEspecial;
    }

    public void deposita() {

    }

    public void saque() {

    }

    public void extrato() {

    }
}

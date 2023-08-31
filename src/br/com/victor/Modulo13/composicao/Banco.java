package br.com.victor.Modulo13.composicao;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class Banco {

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

    private Set<ContaCorrente> contasCorrentes;

    private Set<ContaPoupanca> contasPoupancas;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp) {
        this.contasPoupancas.add(cp);
    }
}

package br.com.victor.Modulo13.abstratas;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Comissionado extends Empregado{
    private Double totalVenda;

    private Double taxaComissao;

    @Override
    public Double vencimento() {
        return totalVenda * taxaComissao;
    }


    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}

package br.com.victor.Modulo13.atividade;

/**
 * @author Victor$
 * @date 01/09/2023$
 * Description:
 */
public class PessoaJuridica extends Pessoa{

    private String cnpj;

    private Double impostosEmpresariais;

    private Double herancaEmpresarial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getImpostosEmpresariais() {
        return impostosEmpresariais;
    }

    public void setImpostosEmpresariais(Double impostosEmpresariais) {
        this.impostosEmpresariais = impostosEmpresariais;
    }

    public Double getHerancaEmpresarial() {
        return herancaEmpresarial;
    }

    public void setHerancaEmpresarial(Double herancaEmpresarial) {
        this.herancaEmpresarial = herancaEmpresarial;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", impostosEmpresariais=" + impostosEmpresariais +
                ", herancaEmpresarial=" + herancaEmpresarial +
                '}';
    }
}

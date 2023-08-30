package br.com.victor.Modulo13.abstratas;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Assalariado extends Empregado{

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }
}

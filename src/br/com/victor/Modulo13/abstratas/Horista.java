package br.com.victor.Modulo13.abstratas;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Horista extends Empregado{

    private Double precoHora;

    private Double horasTrabalhadas;

    @Override
    public Double vencimento() {
        return precoHora * horasTrabalhadas;
    }


    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}

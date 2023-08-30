package br.com.victor.Modulo13.abstratas;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Programa {

    public static void main(String[] args) {

        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Renan1");
        empregado.setSobrenome("Moura");
        empregado.setSalario(100d);
        System.out.println(empregado.getNome() + " tem salário: R$" + empregado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Renan2");
        comissionado.setSobrenome("Moura");
        comissionado.setTotalVenda(2000d);
        comissionado.setTaxaComissao(0.1d);
        System.out.println(comissionado.getNome() + " tem salário: R$" + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Renan3");
        horista.setSobrenome("Moura");
        horista.setPrecoHora(6d);
        horista.setHorasTrabalhadas(166d);
        System.out.println(horista.getNome() + " tem salário: R$" + horista.vencimento());

    }
}

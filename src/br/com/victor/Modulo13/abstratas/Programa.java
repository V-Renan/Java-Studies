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
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Renan2");
        comissionado.setSobrenome("Moura");
        comissionado.setTotalVenda(2000d);
        comissionado.setTaxaComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Renan3");
        horista.setSobrenome("Moura");
        horista.setPrecoHora(6d);
        horista.setHorasTrabalhadas(166d);
        imprimir(horista);

    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        System.out.println(empregado.getNome() + " Tem salário: R$" + empregado.vencimento());

        empregado.imprimirSobrenome();
        empregado.imprimirValor();
    }


}

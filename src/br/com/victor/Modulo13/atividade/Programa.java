package br.com.victor.Modulo13.atividade;

/**
 * @author Victor$
 * @date 01/09/2023$
 * Description:
 */
public class Programa {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Victor");
        pf.setIdade(23);
        pf.setCpf("139-814-424-07");
        pf.setHeranca(100000D);
        pf.setImpostos(300D);
        imprimirpf(pf);

        System.out.println("--------------FIM--------------");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Cod-New");
        pj.setCnpj("00.000.000/0000-00");
        pj.setIdade(57);
        pj.setHerancaEmpresarial(999888777D);
        pj.setImpostosEmpresariais(422D);
        imprimirpj(pj);

        System.out.println("--------------FIM--------------");
    }

    public static void imprimirpj(PessoaJuridica pj) {
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Idade: " + pj.getIdade());
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Herança Empresarial: R$" + pj.getHerancaEmpresarial());
        System.out.println("Impostos Empreseraiais: R$" + pj.getImpostosEmpresariais());
    }

    public static void imprimirpf(PessoaFisica pf) {
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Idade: " + pf.getIdade());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Herança R$: " + pf.getHeranca());
        System.out.println("Impostos: R$" + pf.getImpostos());
    }
}

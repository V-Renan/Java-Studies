package br.com.victor.Modulo11.atividade;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Victor$
 * @date 26/08/2023$
 * Description:
 */
public class AtividadeModulo12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> lista = new TreeSet<>();

        System.out.print("Digite a quantidade de pessoas para serem cadastradas: ");
        int qtdPessoas = (scan.nextInt());

        for (int i=0; i<qtdPessoas; i++) {
            System.out.print(i+1 + "ª Nome: ");
            String nome = scan.next();
            lista.add(nome);

        }

        System.out.println(lista);


    }

}

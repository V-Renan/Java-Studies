package br.com.victor.Modulo11.array;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 26/08/2023$
 * Description:
 */
public class TestandoAprendizado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtdPessoas = scan.nextInt();

        String[] nomes = new String[qtdPessoas];

        for (int i=0; i<qtdPessoas; i++) {
            System.out.print(i+1 + "ª Nome: ");
            nomes[i] = scan.next();
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

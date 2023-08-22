package br.com.victor.Modulo10;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 22/08/2023$
 * Description:
 */
public class DoWhile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.print("Digite um número para gerar a tabuáda: ");
            int num = s.nextInt();
            for (int i=0; i <=10; i++) {
                System.out.println(num + " x " + i + " = " + num*i);
            }

            System.out.print("Deseja gerar uma nova tabuáda? ");
            resposta = s.next();

        } while (resposta.equalsIgnoreCase("SIM"));

        System.out.println("Encerrando programa!");
    }
}

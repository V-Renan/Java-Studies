package br.com.victor.Modulo10;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 22/08/2023$
 * Description:
 */
public class While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Deseja gerar a tabuáda de um algum número? ");
        String op = scan.next();

        while (op.equalsIgnoreCase("SIM")) {
            System.out.print("Digite o número: ");
            int n = scan.nextInt();

            for (int i=0; i<=10; i++) {
                System.out.println(n + " x " + i + " = " + n*i);
            }

            System.out.print("Quer continuar com um número diferente? ");
            op = scan.next();
        }

        System.out.println("Encerrando programa!");
    }
}

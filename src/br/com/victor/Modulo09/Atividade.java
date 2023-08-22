package br.com.victor.Modulo09;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 21/08/2023$
 * Description:
 */
public class Atividade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = scan.nextInt();

        System.out.println("O valor digitado foi: " + n1);

        Double n2 = Double.valueOf(n1);

        System.out.println("Casting para Double: " + n2);

        byte n3 = (byte) n1;

        System.out.println("Forçando um int para byte: " + n3);
    }
}

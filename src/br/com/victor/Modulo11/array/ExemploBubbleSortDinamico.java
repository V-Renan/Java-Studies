package br.com.victor.Modulo11.array;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 26/08/2023$
 * Description:
 */
public class ExemploBubbleSortDinamico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os números separados por [,]: ");
        String resposta = scan.next();

        String[] vetStr = resposta.split(",");
        int[] vet = convert(vetStr);
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i=0; i<vet.length; i++) {
            System.out.println(" " + vet[i]);
        }

        System.out.println(" ");

        for (i=0; i<vet.length; i++) {
            for (int j=0; j<vet.length-1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor organizado:");
        for (i=0; i<vet.length; i++) {
            System.out.println(" " + vet[i]);
        }


    }

    private static int[] convert(String[] vetStr) {
        int[] numbers = new int[vetStr.length];
        for (int i=0; i< vetStr.length; i++) {
            numbers[i] = Integer.parseInt(vetStr[i]);
        }
        return numbers;
    }
}
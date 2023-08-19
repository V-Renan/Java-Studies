package br.com.victor.Modulo08;

/**
 * @author Victor$
 * @date 19/08/2023$
 * Description:
 */
public class Operadores {

    public static void main(String[] args) {
        operacoesAritimeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    public static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");
        int n1 = 10;
        int n2 = 10;
        boolean isMaior = n1 > n2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = n1 == n2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiff= n1 != n2;
        System.out.println("isDiff: " + isDiff);

        boolean isMaiorIgual = n1 >= n2;
        System.out.println("isMaiorIgual: " + isMaiorIgual );
        //1...10
        boolean isDentro10 = n1 >= 1 && n1 <= 10;
        System.out.println("isDentro10: " + isDentro10);

        boolean isDentro_10 = n1 >= 1 || n1 <= 9;
        System.out.println("isDentro_10: " + isDentro_10);

        boolean isNot = n1 >= 1;
        System.out.println("isNot: " + !isNot);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes ****");
        int num1 = 10;
        int num2 = 10;
        int num3 = num1 + num2;
        System.out.println(num3);
        num3 += num3;
        System.out.println(num3);

    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremento ****");
        int numero1 = 10;
        System.out.println(numero1);

        numero1++;
        System.out.println(numero1);

        numero1--;
        System.out.println(numero1);
    }

    public static void operacoesAritimeticas() {
        System.out.println("**** operacoesAritimeticas ****");
        int n1 = 10;
        int n2 = 20;

        int n3 = n1 + n2;
        int n4 = n1 - n2;
        int n5 = n1 / n2;
        int n6 = n1 * n2;
        int n7 = (10 + 10) / 2;

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
    }
}

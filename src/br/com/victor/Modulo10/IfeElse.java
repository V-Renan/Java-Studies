package br.com.victor.Modulo10;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 22/08/2023$
 * Description:
 */
public class IfeElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
        String forTabuada = getforTabuada();
    }

    //entre 0 e 5 bebe, entre 6 e 10 criança, 11 e 18 adolescente, acima disso atulto
    public static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5) {
            return "Você é bebê";
        }
        else if (idade >= 6 && idade <= 10) {
            return "Você é criança";
        }
        else if (idade >= 11 && idade <= 18) {
            return "Você é adolescente";
        }
        else {
            return "Você é Adulto";
        }
    }

    public static String getforTabuada() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = scan.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);

        }
        return null;
    }

}

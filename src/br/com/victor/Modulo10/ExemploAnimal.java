package br.com.victor.Modulo10;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 22/08/2023$
 * Description:
 */
public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    public static String exampleOfIf(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}

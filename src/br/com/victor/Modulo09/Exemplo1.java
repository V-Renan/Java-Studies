package br.com.victor.Modulo09;

/**
 * @author Victor$
 * @date 21/08/2023$
 * Description:
 */
public class Exemplo1 {

    public static void main(String[] args) {

        //Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;


        Long cpf = Long.valueOf(123123); //não é autoboxing
        Long cpf1 = 123123123l;

        //unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(123123);


    }
}

package br.com.victor.Modulo12;

/**
 * @author Victor$
 * @date 25/08/2023$
 * Description:
 */
public class DeclarandoArrays {

    public static void main(String[] args) {

        System.out.println("APRENDENDO SOBRE ARRAY");

        declarandoArrays();
        tamanhoArray();
        percorrendoArray1();
        percorrentoArray2();
        arrayBidimensional();
    }

    private static void declarandoArrays() {
        System.out.println("****** declarandoArrays ******");

        int[] a = new int[4];
        int[] b;
        int[] c = {1, 2, 3, 4, 5};
        int[] meuArray = new int[10];
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 5;
        meuArray[5] = 6;
        meuArray[6] = 7;
        meuArray[7] = 8;
        meuArray[8] = 9;
        meuArray[9] = 10;

        System.out.println(meuArray[7] + meuArray[2]);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }

    private static void tamanhoArray() {
        System.out.println("****** tamanhoArray ******");
        int[] arrayUm = {12, 3, 4, 5, 65, 73, 44, 567, 574, 457, 65};
        int[] arrayDois = {12, 23, 543, 456, 65, 6, 5, 4};

        if (arrayDois.length > 8) {
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }

    private static void percorrendoArray1() {
        System.out.println("****** percorrendoArray1 ******");

        int[] arrayNum = {87, 68, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONANDO O VALOR DE CADA ELEMENTO AO TOTAL
        for (int i : arrayNum) {
            total += i;
        }

        System.out.println("1 - Total de elementos arrayUm: " + total);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }

    private static void percorrentoArray2() {
        System.out.println("****** percorrentoArray2 ******");

        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }


        System.out.println("-------------------------------------------------------------------");
        System.out.println("");

    }

    private static void arrayBidimensional() {
        System.out.println("****** arrayBidimensional ******");

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {4, 5, 6}};

        System.out.println("Valores no array1 passados na linha são:");
        outputArray( array1 ); //EXIBE O ARRAY1 POR LINHA

        System.out.println("Valores no array2 passados na linha são:");
        outputArray( array2); //EXIBE O ARRAY2 POR LINHA
    }

    public static void outputArray(int[][] array) {
        //FAZ UM LOOP PELAS LINHAS DO ARRAY
        for (int linha = 0; linha < array.length; linha++) {
            //FAZ LOOOP PELAS COLUNAS DA LINHA ATUAL
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }
}

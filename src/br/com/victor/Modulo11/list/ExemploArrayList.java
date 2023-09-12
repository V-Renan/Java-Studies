package br.com.victor.Modulo11.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 *
 * @author rodrigo.pires
 */
public class ExemploArrayList {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    public static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);

    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Victor Renan");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Victor Renan");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}

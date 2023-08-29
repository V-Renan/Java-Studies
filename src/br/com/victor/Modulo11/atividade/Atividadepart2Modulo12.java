package br.com.victor.Modulo11.atividade;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Victor$
 * @date 29/08/2023$
 * Description:
 */
public class Atividadepart2Modulo12 {

    public static void main(String[] args) {

        Set<String> masculino = new TreeSet<>();
        Set<String> feminino = new TreeSet<>();
        Scanner scan = new Scanner(System.in);

        String resposta = " ";
        System.out.print("Deseja cadastrar uma pessoa? ");
        resposta = scan.nextLine();

        while (resposta.equalsIgnoreCase("SIM")) {
            System.out.print("Digite nome e sexo utilizando [-F/-M]: ");
            String nome = scan.nextLine();

            String[] splitado = nome.split("-");

            if (splitado.length == 2) {
                String sexo = splitado[1].toUpperCase();
                if (sexo.equals("M")) {
                    masculino.add(nome);
                    System.out.println("Pessoa cadastrada no grupo masculino com sucesso!");
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                    System.out.println("Pessoa cadastrada no grupo feminino com sucesso!");
                } else {
                    System.out.println("Sexo inválido, use apenas [-F/-M]");
                }
            }

            System.out.print("Deseja cadastrar mais alguma pessoa? ");
            resposta = scan.nextLine();
            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }

        }

        System.out.println("Lista de pessoas cadastradas do sexo feminino:");
        for (String nomesF : feminino) {
            System.out.println(nomesF);
        }

        System.out.println("Lista de pessoas cadastradas do sexo masculino:");
        for (String nomesM : masculino) {

            System.out.println(nomesM);
        }

    }

}

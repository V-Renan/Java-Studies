package br.com.victor.Modulo11.queue;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 24/08/2023$
 * Description:
 */
public class Atividade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> homem = new ArrayList<>();
        ArrayList<String> mulher = new ArrayList<>();

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtdPessoas = scan.nextInt();

        for (int i=1; i <= qtdPessoas; i++) {
            System.out.print(i +"ª pessoa: ");
            String nome = scan.next();
            System.out.print("Qual o sexo de " + nome + " [f/m]: ");
            String sexo = scan.next();
            if (sexo.equalsIgnoreCase("F")) {
                mulher.add(nome);
                System.out.println("Cadastro realizado no grupo Feminino com sucesso!");
            } else if (sexo.equalsIgnoreCase("M")) {
                homem.add(nome);
                System.out.println("Cadastro realizado no grupo Masculino com sucesso!");
            }
        }
        
        System.out.println("Pessoas cadastradas no grupo homem: " + homem);
        System.out.println("");
        System.out.println("Pessoas cadastradas no grupo homem: " + mulher);

    }

}

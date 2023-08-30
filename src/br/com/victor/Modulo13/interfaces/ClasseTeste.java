package br.com.victor.Modulo13.interfaces;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Victor!");
        caneta.escreverComumTodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Renan!");
        caneta.escreverComumTodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Renan!");
        caneta.escreverComumTodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}

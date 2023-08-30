package br.com.victor.Modulo13.interfaces;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Lapis implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Grafite";
    }
}

package br.com.victor.Modulo13.interfaces;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    default void escreverComumTodas() {
        System.out.println("Escritira igual para todas");
    }
}

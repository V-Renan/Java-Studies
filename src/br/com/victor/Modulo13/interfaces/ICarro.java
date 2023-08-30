package br.com.victor.Modulo13.interfaces;

import java.sql.SQLOutput;

public interface ICarro {

    default void parar() {
        System.out.println("Carro está parando");
    }

    public void andar();
}

package br.com.victor.Modulo13.interfaces;

/**
 * @author Victor$
 * @date 30/08/2023$
 * Description:
 */
public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Carro está andando devagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}

package br.com.victor.Modulo15.src.exemplosAula03.builder;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {
        //Gerente gerente = new Gerente( new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.builderBurger();
        burger.print();

        //Gerente gerente1 = new Gerente( new VeganBurgerBuilder());
        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger1 = gerente.builderBurger();
        burger1.print();
    }
}

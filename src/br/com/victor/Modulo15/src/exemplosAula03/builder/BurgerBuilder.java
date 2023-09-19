package br.com.victor.Modulo15.src.exemplosAula03.builder;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public abstract class BurgerBuilder {

    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildSauce();

    Burger build() {
        return burger;
    }
}

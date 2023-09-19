package br.com.victor.Modulo15.src.exemplosAula03.builder;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class CheeseBurgerBuilder extends BurgerBuilder{
    @Override
    void buildBun() {
        burger.setBun("White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("American Cheese");
    }

    @Override
    void buildSauce() {
        burger.setSauce("Secret Sauce");
    }
}

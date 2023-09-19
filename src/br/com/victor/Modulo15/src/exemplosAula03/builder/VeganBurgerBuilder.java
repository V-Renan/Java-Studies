package br.com.victor.Modulo15.src.exemplosAula03.builder;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class VeganBurgerBuilder extends BurgerBuilder{
    @Override
    void buildBun() {
        burger.setBun("Vegan White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Vegan Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Vegan American Cheese");
    }

    @Override
    void buildSauce() {
        burger.setSauce("Vegan Secret Sauce");
    }
}

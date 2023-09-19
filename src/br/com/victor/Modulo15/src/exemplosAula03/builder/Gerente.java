package br.com.victor.Modulo15.src.exemplosAula03.builder;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class Gerente {

    BurgerBuilder builder;

//    public Gerente(BurgerBuilder builder) {
//        this.builder = builder;
//    }


    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger builderBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }


}

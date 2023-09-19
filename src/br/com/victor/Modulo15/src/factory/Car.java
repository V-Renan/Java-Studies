package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;


    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void starEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("The engine has ben started, and ready to utilize " + horsePower + " horsepowers.n");
    }

    public void clear() {
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic. Everything looks good!");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }
}

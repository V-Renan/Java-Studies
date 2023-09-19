package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public abstract class Factory {

    public Car create(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clear();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String requestedGrade);
}

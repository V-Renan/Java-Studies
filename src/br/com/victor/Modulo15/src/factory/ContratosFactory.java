package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return  new CorolaCar(100, "50L", "Azul");
        } else if ("B".equals(requestedGrade)) {
            return new GolfCar(110, "Full", "Preto");
        } else if ("C".equals(requestedGrade)) {
            return new ArgoCar(110, "Full", "Preto");
        }
        return null;
    }
}

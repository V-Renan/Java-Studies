package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public class SemContratoFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BrasiliaCar(50, "Cheio", "Amarelo");
        } else {
            return new FuscaCar(20, "10L", "Branco");
        }
    }
}

package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {
        Customer cliente = new Customer("C", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.starEngine();
    }

    public static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratoFactory();
        }
    }
}

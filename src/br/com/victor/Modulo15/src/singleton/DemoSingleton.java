package singleton;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}

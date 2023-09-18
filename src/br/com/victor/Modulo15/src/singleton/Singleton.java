package singleton;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class Singleton {

    private static Singleton singleton;

    private  Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

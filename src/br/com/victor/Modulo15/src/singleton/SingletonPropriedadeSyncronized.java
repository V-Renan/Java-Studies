package singleton;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class SingletonPropriedadeSyncronized {
    private static SingletonPropriedadeSyncronized singleton;
    private String value;

    private SingletonPropriedadeSyncronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonPropriedadeSyncronized getInstance(String value){
        if (singleton == null) {
            singleton = new SingletonPropriedadeSyncronized(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}

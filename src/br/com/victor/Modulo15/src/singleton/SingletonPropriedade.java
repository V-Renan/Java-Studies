package singleton;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class SingletonPropriedade {

    private static SingletonPropriedade singleton;
    private String value;

    private SingletonPropriedade(String value) {
        this.value = value;
    }

    public static SingletonPropriedade getInstance(String value){
        if (singleton == null) {
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}

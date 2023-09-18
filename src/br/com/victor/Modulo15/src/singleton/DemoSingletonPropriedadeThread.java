package singleton;

/**
 * @author Victor$
 * @date 9/18/2023$
 * Description:
 */
public class DemoSingletonPropriedadeThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadFoo.ThreadBar());
        t1.start();
        t2.start();

    }

    static class ThreadFoo implements  Runnable {

        @Override
        public void run() {
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
            System.out.println(singleton.getValue());
        }

        static class ThreadBar implements Runnable{
            @Override
            public void run() {
                SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste1");
                System.out.println(singleton.getValue());
            }
        }

    }
}

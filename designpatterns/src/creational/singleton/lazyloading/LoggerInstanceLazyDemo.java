package creational.singleton.lazyloading;

public class LoggerInstanceLazyDemo {
    public static void main(String[] args) {
        LoggerInstanceLazy instance = LoggerInstanceLazy.getInstance();
        System.out.println(instance.getInstance());

        LoggerInstanceLazy instance2 = LoggerInstanceLazy.getInstance();
        System.out.println(instance2.getInstance());
    }
}

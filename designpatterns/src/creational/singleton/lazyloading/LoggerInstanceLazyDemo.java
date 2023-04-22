package creational.singleton.lazyloading;

public class LoggerInstanceLazyDemo {
    public static void main(String[] args) {
        LoggerInstanceLazy instance = new LoggerInstanceLazy();
        System.out.println(instance.getInstance());

        LoggerInstanceLazy instance2 = new LoggerInstanceLazy();
        System.out.println(instance2.getInstance());
    }
}

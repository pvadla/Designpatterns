package creational.singleton.eagerloading;

public class LoggerInstanceEagerDemo {
    public static void main(String[] args) {
        LoggerInstanceEager instance = new LoggerInstanceEager();
        System.out.println(instance.getINSTANCE());

        LoggerInstanceEager instance2 = new LoggerInstanceEager();
        System.out.println(instance2.getINSTANCE());


    }
}

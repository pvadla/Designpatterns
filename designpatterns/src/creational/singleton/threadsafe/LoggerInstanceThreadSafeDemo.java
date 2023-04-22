package creational.singleton.threadsafe;


public class LoggerInstanceThreadSafeDemo {
    public static void main(String[] args) {
        //LoggerInstanceThreadSafe instance = new LoggerInstanceThreadSafe();

        System.out.println(LoggerInstanceThreadSafe.getInstance());

        //LoggerInstanceThreadSafe instance2 = new LoggerInstanceThreadSafe();
        System.out.println(LoggerInstanceThreadSafe.getInstance());
    }
}

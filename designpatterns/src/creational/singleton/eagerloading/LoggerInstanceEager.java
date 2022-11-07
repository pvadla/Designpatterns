package creational.singleton.eagerloading;


public class LoggerInstanceEager {

    private static LoggerInstanceEager INSTANCE = new LoggerInstanceEager();

    LoggerInstanceEager(){
    }

    public LoggerInstanceEager getINSTANCE(){
        return INSTANCE;
    }
}

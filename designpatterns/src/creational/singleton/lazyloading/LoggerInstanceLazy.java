package creational.singleton.lazyloading;

public class LoggerInstanceLazy {
    private static LoggerInstanceLazy instance = null;

    LoggerInstanceLazy(){

    }

    public LoggerInstanceLazy getInstance(){
        if(instance == null){
            instance = new LoggerInstanceLazy();
        }
        return instance;
    }
}

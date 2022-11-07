package creational.singleton.lazyloading;

import java.io.Serializable;

public class LoggerInstanceLazy implements Serializable, Cloneable {
    private static LoggerInstanceLazy instance = null;

    private LoggerInstanceLazy(){

    }

    public static LoggerInstanceLazy getInstance(){
        if(instance == null){
            instance = new LoggerInstanceLazy();
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package creational.singleton.threadsafe;



public class LoggerInstanceThreadSafe {
    private static LoggerInstanceThreadSafe instance = null;

    private LoggerInstanceThreadSafe(){

    }

    public static LoggerInstanceThreadSafe getInstance(){
        if(instance == null){
            synchronized (LoggerInstanceThreadSafe.class){
                if(instance == null){
                    instance = new LoggerInstanceThreadSafe();
                }
            }
        }
        return instance;
    }
}

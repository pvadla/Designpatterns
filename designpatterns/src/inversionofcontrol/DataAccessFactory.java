package inversionofcontrol;

public class DataAccessFactory {

    public static DataAccess getDataAccessObject(){
        return new DataAccess();
    }
}

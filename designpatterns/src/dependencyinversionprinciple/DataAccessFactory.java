package dependencyinversionprinciple;

public class DataAccessFactory {

    public static ICustomerDataAccess getDataAccessObject(){
        return new DataAccess();
    }
}

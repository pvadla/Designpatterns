package dependencyinjection;

public class DataAccess implements ICustomerDataAccess {
    public String getCustomerName() {
        return "Implemented dependency Injection";
    }
}

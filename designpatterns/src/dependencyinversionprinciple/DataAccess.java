package dependencyinversionprinciple;

public class DataAccess implements ICustomerDataAccess {
    public String getCustomerName() {
        return "Dependency Inversion Principle";
    }
}

package dependencyinjection;

public class Client {
    public static void main(String[] args) {
        ICustomerDataAccess dataAccess = new dependencyinjection.DataAccess();
        CustomerBusinessLogic customerBusinessLogic = new CustomerBusinessLogic(dataAccess);

        customerBusinessLogic.getCustomerDetails();

    }
}

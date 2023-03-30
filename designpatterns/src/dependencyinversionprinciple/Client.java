package dependencyinversionprinciple;


public class Client {
    public static void main(String[] args) {

        CustomerBusinessLogic customerBusinessLogic = new CustomerBusinessLogic();
        customerBusinessLogic.getCustomerDetails();


    }
}

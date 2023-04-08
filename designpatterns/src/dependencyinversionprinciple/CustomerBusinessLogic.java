package dependencyinversionprinciple;


public class CustomerBusinessLogic {

    private ICustomerDataAccess iCustomerDataAccess;

    CustomerBusinessLogic(){
        iCustomerDataAccess = DataAccessFactory.getDataAccessObject();
    }

    public void getCustomerDetails(){
        System.out.println(iCustomerDataAccess.getCustomerName());
    }


}

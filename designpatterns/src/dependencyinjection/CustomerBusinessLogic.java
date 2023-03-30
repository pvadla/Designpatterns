package dependencyinjection;


public class CustomerBusinessLogic {

    private ICustomerDataAccess iCustomerDataAccess;

    CustomerBusinessLogic(ICustomerDataAccess iCustomerDataAccess){
        this.iCustomerDataAccess = iCustomerDataAccess;
    }

    public void getCustomerDetails(){
        System.out.println(iCustomerDataAccess.getCustomerName());
    }


}

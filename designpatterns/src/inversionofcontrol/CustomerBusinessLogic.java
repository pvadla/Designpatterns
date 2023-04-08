package inversionofcontrol;

public class CustomerBusinessLogic {

    private DataAccess dataAccess;

    CustomerBusinessLogic(){
        dataAccess = DataAccessFactory.getDataAccessObject();
    }

    public void getCustomerDetails(){
        System.out.println(dataAccess.getData());
    }


}

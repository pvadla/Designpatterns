package structural.observer;

public class EmailService implements CreateOrderObserver{


    EmailService(){
        Amazon amz = Amazon.getInstance();
        amz.registerCreateOrderObserver(this);
    }

    @Override
    public void orderCreated(OrderDetails od) {
        System.out.println("Order created sending emails");
    }
}

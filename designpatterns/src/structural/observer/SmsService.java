package structural.observer;

public class SmsService implements CreateOrderObserver{

    SmsService(){
        Amazon amz = Amazon.getInstance();
        amz.registerCreateOrderObserver(this);
    }

    @Override
    public void orderCreated(OrderDetails od) {
        System.out.println("Order created sending sms");

    }
}

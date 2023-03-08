package structural.observer;

public class Client {
    public static void main(String[] args) {
        Amazon amz = Amazon.getInstance();
        amz.createOrder();

        //Email service switched on
        EmailService es = new EmailService();
        amz.createOrder();


        //SMS service switched on
        SmsService ss = new SmsService();
        amz.createOrder();


        //Email service went down
        amz.unregister(es);
        amz.createOrder();

    }
}

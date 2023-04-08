package structural.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {


    private static Amazon inst;
    public static Amazon getInstance(){
        if(inst == null){
            inst = new Amazon();
        }
        return inst;
    }

    List<CreateOrderObserver> list = new ArrayList<>();

    void registerCreateOrderObserver(CreateOrderObserver obs){
        list.add(obs);
    }

    void unregister(CreateOrderObserver obs){
        list.remove(obs);
    }

    void createOrder(){
        //work to create the order, which will create order details object
        OrderDetails od = new OrderDetails();
        for(CreateOrderObserver coo: list){
            coo.orderCreated(od);
        }
    }

}

package creational.abstractfactory.scaler;


import creational.abstractfactory.scaler.Dependencies.D;
import creational.abstractfactory.scaler.Factories.Factory;

public class A {
    private Factory f;

    A(Factory f){
        this.f = f;
    }

    void execute(){
        // A is getting it's dependency D via an abstract factory f.
        D o = f.getD();
        o.work();
    }
}

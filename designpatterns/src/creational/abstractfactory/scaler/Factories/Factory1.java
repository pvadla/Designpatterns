package creational.abstractfactory.scaler.Factories;


import creational.abstractfactory.scaler.Dependencies.D;
import creational.abstractfactory.scaler.Dependencies.D1;

public class Factory1 implements Factory {
    @Override
    public D getD() {
        return new D1();
    }
}

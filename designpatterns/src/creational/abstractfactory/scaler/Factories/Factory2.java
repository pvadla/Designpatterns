package creational.abstractfactory.scaler.Factories;


import creational.abstractfactory.scaler.Dependencies.D;
import creational.abstractfactory.scaler.Dependencies.D2;

public class Factory2 implements Factory {
    @Override
    public D getD() {
        return new D2();
    }
}

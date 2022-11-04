package creational.abstractfactory;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Car")){
            return new CarFactory();
        }
        return null;
    }
}

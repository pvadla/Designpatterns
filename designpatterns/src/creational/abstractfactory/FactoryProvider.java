package creational.abstractfactory;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if(factoryType.equalsIgnoreCase("Bike")){
            return new BikeFactory();
        }
        return null;
    }
}

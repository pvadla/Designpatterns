package creational.abstractfactory;

public class AbstractFactoryPatternDemoClient {
    public static void main(String[] args) {
        int distance = 10;

        AbstractVehicleFactory carFactory1 = FactoryProvider.getVehicleFactory("car");
        Vehicle car = carFactory1.getVehicle("micro");
        car.book(distance);

        AbstractVehicleFactory carFactory2 = FactoryProvider.getVehicleFactory("car");
        Vehicle miniCar = carFactory2.getVehicle("mini");
        miniCar.book(distance);

        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("bike");
        Vehicle personal = bikeFactory.getVehicle("Personal");
        personal.book(distance);
    }
}

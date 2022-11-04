package creational.abstractfactory;

public class CarFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("Micro")){
            return new MicroCar();
        }else if(type.equalsIgnoreCase("mini")){
            return new MiniCar();
        }
        return null;
    }
}

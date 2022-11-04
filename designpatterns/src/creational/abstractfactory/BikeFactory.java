package creational.abstractfactory;

public class BikeFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("Personal")){
            return new PersonalBike();
        }
        return null;
    }
}

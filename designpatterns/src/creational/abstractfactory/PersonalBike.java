package creational.abstractfactory;

public class PersonalBike extends Bike{

    @Override
    public void setVehicletype() {
        biketype = "Personal";
    }

    @Override
    public void setBaseCost() {
        baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}

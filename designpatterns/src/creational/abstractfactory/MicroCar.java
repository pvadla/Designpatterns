package creational.abstractfactory;

public class MicroCar extends Car{

    @Override
    public void setVehicletype() {
        carType = "Micro";
    }

    @Override
    public void setBaseCost() {
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 10;
    }
}

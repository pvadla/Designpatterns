package creational.abstractfactory;

public class MiniCar extends Car{
    @Override
    public void setVehicletype() {
        carType = "Mini";
    }

    @Override
    public void setBaseCost() {
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 5;
    }
}

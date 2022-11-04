package creational.abstractfactory;

public interface Vehicle {
    void book(int distance);
    void setVehicletype();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);

}

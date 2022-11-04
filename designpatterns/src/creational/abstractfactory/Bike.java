package creational.abstractfactory;

public abstract class Bike implements Vehicle{
    String biketype;
    int baseCost;
    int chargesPerUnitDistance;

    public void book(int distance){
        setVehicletype();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + biketype + " Bike for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    public int calculateCostOfBooking(int distance){
        return baseCost + chargesPerUnitDistance * distance;
    }
}

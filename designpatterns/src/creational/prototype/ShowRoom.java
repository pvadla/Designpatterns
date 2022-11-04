package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShowRoom {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Bike bike = new Bike();
        bike.seats = 1;
        bike.tyres = 2;
        bike.color = "Black";
        bike.fuel = "Petrol";
        vehicles.add(bike);

        Car c1 = new Car(); // Demo Car object
        c1.seats = 5;
        c1.tyres = 4;
        c1.color = "White";
        c1.fuel = "Electric";
        vehicles.add(c1);

        for(Vehicle vehicle : vehicles){
            vehiclesCopy.add(vehicle.clone());
        }

        System.out.print("Original Objects:-\n");
        for (Vehicle vehicle : vehicles) { // Printing Original objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }
        System.out.print("\n\n\nPrototyped Objects:-\n");
        for (Vehicle vehicle : vehiclesCopy) { // Printing cloned objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }
    }
}
